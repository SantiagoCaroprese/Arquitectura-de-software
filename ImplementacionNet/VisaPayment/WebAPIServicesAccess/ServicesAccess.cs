using DataAccess;
using Grpc.Net.Client;
using PaymentServiceContract;
using System;
using System.Text.Json;
using System.Text.Json.Serialization;

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
            Console.WriteLine("cardNumber: " + cardNumber);
            Console.WriteLine("expirationDate: " + expirationDate.ToString());
            Console.WriteLine("securityCode: " + securityCode);
            Console.WriteLine("owner: " + owner);
            Console.WriteLine("paymentMonto: " + paymentMonto);

            bool transaction = false;

            VisaCard card = new();
            card.Number = cardNumber;
            if (cardNumber.Length == 16)
            {
                card.Number = cardNumber.Substring(0, 4) + " " + cardNumber.Substring(4, 4) + " " + cardNumber.Substring(8, 4) + " " + cardNumber.Substring(12, 4);
            }
            if(card.Number.Length!=19)
            {
                Console.WriteLine("Error formato de numero de tarjeta:" + cardNumber);
                return false;
            }
            card.ExpirationDate = expirationDate;
            card.SecurityCode = securityCode;
            card.Owner = owner;
            card.Quota = 0;
            card.Balance = 0;

            string message = JsonSerializer.Serialize(card);

            using var channel = GrpcChannel.ForAddress("https://localhost:5001");
            var client = new Payer.PayerClient(channel);
            var reply = client.Pay(new CardRequest { Card=message,Monto=paymentMonto});
            if (reply.Exito)
            {
                transaction=true;
            }
            return transaction;
        }
    }
}
