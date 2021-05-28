using Grpc.Net.Client;
using PaymentServiceContract;
using System;

namespace WebAPIServicesAccess
{
    public class ServicesAccess
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }

        public bool Pay(string cardNumber, DateTime expirationDate, string securityCode, string owner, int paymentMonto)
        {
            // using var channel = GrpcChannel.ForAddress("https://localhost:5001");
            //var client = new Payer.PayerClient(channel);
            Console.WriteLine("cardNumber: " + cardNumber);
            Console.WriteLine("expirationDate: " + expirationDate.ToString());
            Console.WriteLine("securityCode: " + securityCode);
            Console.WriteLine("owner: " + owner);
            Console.WriteLine("paymentMonto: " + paymentMonto);
            return false;
        }
    }
}
