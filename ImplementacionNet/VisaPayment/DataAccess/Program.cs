using DataAccess.Data;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Hosting;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace DataAccess
{
    public class Program
    {
        public static void Main(string[] args)
        {
            //CreateCard();
            //ModifyCard();
            CreateHostBuilder(args).Build().Run();
        }

        // Additional configuration is required to successfully run gRPC on macOS.
        // For instructions on how to configure Kestrel and gRPC clients on macOS, visit https://go.microsoft.com/fwlink/?linkid=2099682
        public static IHostBuilder CreateHostBuilder(string[] args) =>
            Host.CreateDefaultBuilder(args)
                .ConfigureWebHostDefaults(webBuilder =>
                {
                    webBuilder.UseStartup<Startup>();
                });
        private static void CreateCard()
        {
            VisaCard card = new();
            card.Number = "1414 1414 1414 1414";
            card.ExpirationDate = new DateTime(2222, 2, 1);
            card.SecurityCode = "321";
            card.Owner = "Name LastName";
            card.Quota = 1000000;
            card.Balance = 14;
            using (var dbContext = new CardsContext())
            {
                dbContext.Add(card);
                dbContext.SaveChanges();
            }
        }

        private static void ModifyCard()
        {
            using (var dbContext = new CardsContext())
            {
                VisaCard card = dbContext.VisaCard.Where(o => o.Number.Equals("1414 1414 1414 1414")).First();
                card.Quota = 1000000000;
                card.Balance = 0;
                if (dbContext.Update(card) != null)
                {
                    dbContext.SaveChanges();
                }

            }
        }
    }
}
