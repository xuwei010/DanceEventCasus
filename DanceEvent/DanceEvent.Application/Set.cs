using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DanceEvent.Application
{
    public class Set
    {
        public Set(long id, string name, string day, string stage, DateTime beginTime, DateTime endTime)
        {
            Id = id;
            Name = name;
            Day = day;
            Stage = stage;
            BeginTime = beginTime;
            EndTime = endTime;
        }

        public long Id { get; set; }
        public string Name { get; set; }
        public string Day { get; set; }
        public string Stage { get; set; }
        public DateTime BeginTime{ get; set; }
        public DateTime EndTime { get; set; }
    }
}
