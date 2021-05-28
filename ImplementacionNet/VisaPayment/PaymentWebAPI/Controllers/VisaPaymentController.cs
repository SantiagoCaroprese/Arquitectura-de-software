using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Net.Http;
using Grpc.Net.Client;
using PaymentServiceContract;

namespace PaymentWebAPI.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class VisaPaymentController : ControllerBase
    {
       private readonly ILogger<VisaPaymentController> _logger;

        public VisaPaymentController(ILogger<VisaPaymentController> logger)
        {
            _logger = logger;
        }

        [HttpGet("username")]
        public ActionResult<bool> getUserByUsername(String name)
        {
            using var channel = GrpcChannel.ForAddress("https://localhost:5001");
            var client = new Payer.PayerClient(channel);
            return false;
        }
    }
}
