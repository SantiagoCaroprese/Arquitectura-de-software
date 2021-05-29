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
            VisaCard requestCard = JsonSerializer.Deserialize<VisaCard>(request.Card);
            VisaCard dbCard = GetCard(requestCard.Number);
            if (dbCard!=null)
            {
                if (VerifyPayment(requestCard, dbCard,request.Monto)){
                    dbCard.Balance = dbCard.Balance + request.Monto;
                    if (PersistPayment(dbCard))
                    {
                        operation = true;
                    }
                }
            }

            return Task.FromResult(new ActionResult
            {
                Exito=operation
            });
        }
        private VisaCard GetCard(string cardNumber)
        {
            ServiceDataAccess service =new();
            VisaCard card= service.getCard(cardNumber);
            return card;
        }
        private bool VerifyPayment(VisaCard propectCard, VisaCard originalCard, int monto)
        {
            bool posible = false;
            if (propectCard.Number.Equals(originalCard.Number) && propectCard.ExpirationDate.Equals(originalCard.ExpirationDate) && propectCard.Owner.Equals(originalCard.Owner))
            {
                if (propectCard.SecurityCode.Equals(originalCard.SecurityCode))
                {
                    if ((originalCard.Balance + monto) <= originalCard.Quota)
                    {
                        posible = true;
                    }
                }
            }
            return posible;
        }

        private bool PersistPayment(VisaCard card)
        {
            bool accepted = false;
            ServiceDataAccess service = new ServiceDataAccess();
            if (service.saveCard(card))
            {
                accepted= true;
            }
            return accepted;
        }
    }
}
