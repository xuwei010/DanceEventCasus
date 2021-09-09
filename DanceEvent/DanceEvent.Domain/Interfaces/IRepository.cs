using DanceEvent.Domain.Entity;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace DanceEvent.Domain.Interfaces
{
    public interface IRepository<TEntity>
        where TEntity : BaseEntity, IAggregateRoot // Only aggregate root entities have repositories
    {
        Task<TEntity> Get(int id);
        Task<IEnumerable<TEntity>> GetAll();
        Task<IEnumerable<TEntity>> FindBy(Expression<Func<TEntity, bool>> predicate);
        int Add(TEntity entity);
        int Remove(TEntity entity);
        int Update(TEntity entity);
    }
}
