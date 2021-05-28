using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Net.Http;
using WebAPIServicesAccess;

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
        public ActionResult<string> getUserByUsername(String name)
        {
            ServicesAccess services = new ServicesAccess();
            return "success";
        }
    }
}
