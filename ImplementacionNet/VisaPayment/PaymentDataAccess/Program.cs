using Grpc.Net.Client;
using System;
using System.Threading.Tasks;
using System.Net.Http;
using DataAccessService;

namespace PaymentDataAccess
{
    class Program
    {
        static void Main(string[] args)
        {
            using var channel = GrpcChannel.ForAddress("https://localhost:5001");
            var client = new DataAccessor.DataAccessorClient(channel);
            Console.WriteLine("Hello World!");
        }
    }
}
