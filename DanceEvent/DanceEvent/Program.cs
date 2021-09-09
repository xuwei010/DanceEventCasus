using System;

namespace DanceEvent
{
    class Program
    {
        static void Main(string[] args)
        {
            bool showMenu = true;
            while (showMenu)
            {
                showMenu = MainMenu();
            }
        }

        private static bool MainMenu()
        {
            Console.WriteLine("Choose an option:");
            Console.WriteLine("1) See set info");
            Console.WriteLine("2) Review set");
            Console.WriteLine("3) Select set");
            Console.WriteLine("4) Read reviews");
            Console.WriteLine("5) Add new set");
            Console.Write("\r\nSelect an option: ");

            switch (Console.ReadLine())
            {
                case "1":
                    // method
                    return true;
                case "2":
                    // method
                    return true;
                case "3":
                    return false;
                case "4":
                    return false;
                case "5":
                    return false;
                default:
                    return true;
            }

        }
    }

    
}
