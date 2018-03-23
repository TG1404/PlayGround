package playground.database.accessors;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DataBaseAccessor<T> {
    /**
     * This method gets an entity and saves it to the database.
     * @param entity The desired entity to be saved.
     */
    void save(T entity);

    /**
     * This method gets an entity and updates it in the database.
     * @param entity The desired entity to be updated.
     */
    void update(T entity);

    /**
     * This method gets an entity and delete it from the database.
     * @param entity The desired entity to be deleted.
     */
    void delete(T entity);

    /**
     * This method gets and entity id and entity type and return it from the database.
     * @param id The id of the desired entity.
     * @param entityType The type of the desired entity.
     * @return The desired entity.
     */
    T find(String id, Class<T> entityType);

    /**
     * This method gets an entity type and returns a list of all the entities in the database with the same type.
     * @param entityType The desired entity type.
     * @return A list of all the entities with the matching entity type.
     */
    List<T> findAll(Class<T> entityType);
}
