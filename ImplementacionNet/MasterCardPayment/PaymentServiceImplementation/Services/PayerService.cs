using DataAccess;
using Grpc.Core;
using Microsoft.Extensions.Logging;
using PaymentDataAccess;
using PaymentServiceContract;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Text.Json;
using Grpc.Net.Client;

namespace PaymentServiceImplementation
{
    public class PayerService : Payer.PayerBase
    {
        private readonly ILogger<PayerService> _logger;
        public PayerService(ILogger<PayerService> logger)
        {
            _logger = logger;
        }
        public override Task<ActionResult> Pay(CardRequest request, ServerCallContext context)
        {
            bool operation = false;
            MasterCard requestCard = JsonSerializer.Deserialize<MasterCard>(request.Card);
            MasterCard dbCard = GetCard(requestCard.Number);
            if (dbCard!=null)
            {
                if (VerifyPayment(requestCard, dbCard, request.Monto))
                {
                    dbCard.Balance = dbCard.Balance + request.Monto;
                    if (PersistPayment(dbCard))
                    {
                        operation = true;
                    }
                    else
                    {
                        return Task.FromResult(new ActionResult { Error = new ErrorReply { Error = "Error at saveing changes" } });
                    }
                }
                else
                {
                    return Task.FromResult(new ActionResult { Error = new ErrorReply { Error = "Error validating transation: "} });
                }
            }
            else
            {
                return Task.FromResult(new ActionResult {Error=new ErrorReply { Error="Card with number " + requestCard.Number + " not found" } });
            }

            return Task.FromResult(new ActionResult
            {
                Success=operation
            });
        }
        private MasterCard GetCard(string cardNumber)
        {
            ServiceDataAccess service =new();
            MasterCard card = service.GetCard(cardNumber);
            return card;
        }
        private bool VerifyPayment(MasterCard prospectCard, MasterCard originalCard, int monto)
        {
            bool posible = false;
            if (prospectCard.Number.Equals(originalCard.Number) && prospectCard.ExpirationDate.Equals(originalCard.ExpirationDate) && prospectCard.Owner.Equals(originalCard.Owner))
            {
                if (prospectCard.SecurityCode.Equals(originalCard.SecurityCode))
                {
                    if ((originalCard.Balance + monto) <= originalCard.Quota && monto>0)
                    {
                        posible = true;
                    }
                }
            }
            return posible;
        }

        private bool PersistPayment(MasterCard card)
        {
            bool accepted = false;
            ServiceDataAccess service = new();
            if (service.SaveCard(card))
            {
                accepted= true;
            }
            return accepted;
        }
    }
}
