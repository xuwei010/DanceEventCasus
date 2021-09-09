using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DanceEvent.Application
{
    public class Set
    {
        public long Id { get; set; }
        public string Name { get; set; }
        public string Day { get; set; }
        public string Stage { get; set; }
        public DateTime BeginTime{ get; set; }
        public DateTime EndTime { get; set; }
    }
}
