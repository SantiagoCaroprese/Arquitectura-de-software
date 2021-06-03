using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Net.Http;
using WebAPIServicesAccess;
using System.Net;

namespace PaymentWebAPI.Controllers
{
    public class PaymentRequest
    {
        public string CardNumber { get; set; }
        public DateTime ExpirationDate { get; set; }
        public string SecurityCode { get; set; }
        public string Owner { get; set; }
        public int PaymentMonto { get; set; }
    }

    [ApiController]
    [RequireHttps]
    [Route("[controller]")]
    public class VisaPaymentController : ControllerBase
    {
        private readonly ILogger<VisaPaymentController> _logger;

        public VisaPaymentController(ILogger<VisaPaymentController> logger)
        {
            _logger = logger;
        }

        [RequireHttps]
        [HttpPost("Pay")]
        public HttpResponseMessage GetUserByUsername(PaymentRequest request)
        {
            ServicesAccess services = new();
            if (services.Pay(request.CardNumber,request.ExpirationDate,request.SecurityCode,request.Owner,request.PaymentMonto))
                return new HttpResponseMessage(HttpStatusCode.OK);
            return new HttpResponseMessage(HttpStatusCode.Conflict);
        }
    }
}
