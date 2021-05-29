using DataAccess.Data;
using DataAccessService;
using Grpc.Core;
using Grpc.Net.Client;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Text.Json;
using System.Text.Json.Serialization;


namespace DataAccess
{
    public class DataAccessService : DataAccessor.DataAccessorBase
    {
        private readonly ILogger<DataAccessService> _logger;
        public DataAccessService(ILogger<DataAccessService> logger)
        {
            _logger = logger;
        }

        public override Task<CardReply> GetCard(CardNumberRequest request, ServerCallContext context)
        {
            VisaCard card = null;
            if (CheckForExistingCard(request.CardNumber))
            {
                card = GetCard(request.CardNumber);
            }
            else
            {
                return Task.FromResult(new CardReply
                {
                    Error = new ErrorReply
                    {
                        Error = "Card with number "+request.CardNumber+" not found"
                    }
                });
            }

            if (card != null)
            {
                String message = JsonSerializer.Serialize(card);
                return Task.FromResult(new CardReply
                {
                    Card = message
                });;
            }

            return Task.FromResult(new CardReply{
                Error = new ErrorReply
                {
                    Error = "Error at getting card"
                }
            });
        }

        public override Task<ActionReply> SaveCard(SaveCardRequest request, ServerCallContext context)
        {
            VisaCard card = JsonSerializer.Deserialize<VisaCard>(request.Card);
            bool save = false;
            if (CheckForExistingCard(card.Number))
            {
                using (var dbContext = new CardsContext())
                {
                    if (dbContext.Update(card) != null)
                    {
                        dbContext.SaveChanges();
                        save = true;
                    }
                    
                }
            }
            else
            {
                return Task.FromResult(new ActionReply
                {
                    Error = new ErrorReply
                    {
                        Error = "Card with number " + card.Number + " not found"
                    }
                });
            }
            if (save)
            {
                return Task.FromResult(new ActionReply
                {
                    Success = true
                }); ;
            }
            return Task.FromResult(new ActionReply
            {
                Success = false
            }); ;
        }

        static bool CheckForExistingCard(string cardNumber)
        {
            bool exists = false;
            using (var context = new CardsContext())
            {
                var os = context.VisaCard.Where(o => o.Number.Equals(cardNumber));
                if (os.Count() > 0)
                {
                    exists = true;
                }
            }
            return exists;
        }
        static VisaCard GetCard(string cardNumber)
        {
            VisaCard card = null;
            using (var dbContext = new CardsContext())
            {
                card = dbContext.VisaCard.Where(o => o.Number.Equals(cardNumber)).First();
            }
            return card;
        }
    }
}
