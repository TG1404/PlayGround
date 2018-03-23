package playground.database.accessors;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataBaseAccessorImpl<T> implements DataBaseAccessor<T> {

    @Override
    public void save(T entity) {

    }

    @Override
    public void update(T entity) {

    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public T find(String id, Class<T> entityType) {
        return null;
    }

    @Override
    public List<T> findAll(Class<T> entityType) {
        return null;
    }
}