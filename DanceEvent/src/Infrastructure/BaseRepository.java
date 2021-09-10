package Infrastructure;

import Entity.*;
import java.util.ArrayList;

public abstract class BaseRepository<T extends BaseEntity> implements IRepository<T> {
    ArrayList<T> repo = new ArrayList<T>();

    public T get(long id) {
        return repo.stream().filter(e -> e.getId() == id).findAny().get();
    }
    public ArrayList<T> getAll(long id) {
        return repo;
    }

    public void add(T entity) {
        repo.add(entity);
    }

    public void update(T entity) {
        BaseEntity toUpdate =  repo.stream().filter(e -> e.getId() == entity.getId()).findAny().get();
        // updaten
    }

    public void delete(T entity) {
        repo.remove(entity);
    }
}
