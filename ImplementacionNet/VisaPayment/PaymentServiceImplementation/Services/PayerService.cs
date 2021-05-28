using DataAccess;
using Grpc.Core;
using Microsoft.Extensions.Logging;
using PaymentServiceContract;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

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
            return Task.FromResult(new ActionResult
            {
                Exito=false
            });
        }
        private VisaCard getCard(string cardNumber)
        {
            var data=new PaymentDataAccess.ServiceDataAccess();
            VisaCard card=data.getCard(cardNumber);
            return card;
        }
    }
}
