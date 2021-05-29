using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DataAccess;
using DataAccessService;
using Grpc.Net.Client;
using System.Text.Json;


namespace PaymentDataAccess
{
    public class ServiceDataAccess
    {
        public VisaCard GetCard(string cardNumebr)
        {
            VisaCard card;
            using var channel = GrpcChannel.ForAddress("https://localhost:5003");
            var client = new DataAccessor.DataAccessorClient(channel);
            var reply = client.GetCard(new CardNumberRequest{CardNumber=cardNumebr});
            switch (reply.ResultCase)
            {
                case CardReply.ResultOneofCase.None:
                    return null;
                case CardReply.ResultOneofCase.Error:
                    Console.WriteLine(reply.Error);
                    return null;
                case CardReply.ResultOneofCase.Card:
                    card = JsonSerializer.Deserialize<VisaCard>(reply.Card);
                    return card;
            }
            return null;
        }

        public bool SaveCard(VisaCard card)
        {
            String message = JsonSerializer.Serialize(card);
            using var channel = GrpcChannel.ForAddress("https://localhost:5003");
            var client = new DataAccessor.DataAccessorClient(channel);
            var reply = client.SaveCard(new SaveCardRequest { Card=message});
            switch (reply.ResultCase)
            {
                case ActionReply.ResultOneofCase.None:
                    return false;
                case ActionReply.ResultOneofCase.Error:
                    Console.WriteLine(reply.Error);
                    return false;
                case ActionReply.ResultOneofCase.Success:
                    return reply.Success;
            }
            return false;
        }
    }
}
