using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day2
{
    class Program
    {
        static void Main(string[] args)
        {
            //string input = "ULL\nRRDDD\nLURDL\nUUUUD\n";
            string input = System.IO.File.ReadAllText(@"../../input.txt");
            string code = "";
            int num = 5;

            foreach (var c in input)
            {
                switch (c)
                {
                    case 'U':
                        num = num <= 3 ? num : num - 3;
                        break;
                    case 'D':
                        num = num >= 7 ? num : num + 3;
                        break;
                    case 'L':
                        num = (num == 1 || num == 4 || num == 7) ? num : --num;
                        break;
                    case 'R':
                        num = num % 3 == 0 ? num : ++num;
                        break;
                    case '\n':
                        code += $"{num}";
                        break;
                    default:
                        break;
                }

            }

            Console.WriteLine(code);
        }
    }
}
