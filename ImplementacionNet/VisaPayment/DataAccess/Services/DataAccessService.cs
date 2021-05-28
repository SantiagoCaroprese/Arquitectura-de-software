using DataAccess.Data;
using DataAccessService;
using Grpc.Core;
using Grpc.Net.Client;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

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
            return Task.FromResult(new CardReply{
                Error = new ErrorReply
                {
                    Error = "Not implemented"
                }
            });
        }

        public override Task<CardReply> SaveCard(SaveCardRequest request, ServerCallContext context)
        {
            return Task.FromResult(new CardReply
            {
                Error = new ErrorReply
                {
                    Error = "Not implemented"
                }
            });
        }

        static bool CheckForExistingUser(string cardNumber)
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
        static bool validateUser(string cardNumber, string securityCode)
        {
            bool exists = false;
            using (var context = new CardsContext())
            {
                var os = context.VisaCard.Where(o => o.Number.Equals(cardNumber) && o.SecurityCode.Equals(securityCode));
                if (os.Count() > 0)
                {
                    exists = true;
                }
            }
            return exists;
        }
    }
}
