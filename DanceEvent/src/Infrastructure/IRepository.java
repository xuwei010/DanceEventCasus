package Infrastructure;

import java.util.ArrayList;

public interface IRepository<T> {
    T get(long id);
    ArrayList<T> getAll(long id);
    void add(T entity);
    void update(T entity);
    void delete(T entity);
}
