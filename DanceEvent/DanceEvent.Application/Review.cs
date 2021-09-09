using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DanceEvent.Application
{
    public class Review
    {
        public Review(long id, long setId, int rating, string comment)
        {
            Id = id;
            SetId = setId;
            Rating = rating;
            Comment = comment;
        }

        public long Id { get; set; }
        public long SetId { get; set; }
        public int Rating { get; set; }
        public string Comment { get; set; }
    }
}
