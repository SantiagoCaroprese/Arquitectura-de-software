using DataAccessService;
using Grpc.Core;
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

        public override Task<HelloReply> SayHello(HelloRequest request, ServerCallContext context)
        {
            return Task.FromResult(new HelloReply
            {
                Message = "Hello " + request.Name
            });
        }
    }
}
