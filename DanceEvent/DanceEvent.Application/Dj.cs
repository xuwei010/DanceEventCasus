using System;

namespace DanceEvent.Application
{
    public class Dj
    {
        public Dj(long id, string name, int age, string style)
        {
            Id = id;
            Name = name;
            Age = age;
            Style = style;
        }

        public long Id { get; set; }
        public string Name { get; set; }
        public int Age { get; set; }
        public string Style { get; set; }
    }
}
