package ro.teamnet.zth.api.em;

import java.util.List;
import java.util.Map;

/**
 * Created by Andreea.Puscasu on 7/13/2017.
 */
public interface EntityManager {

    <T> T findById(Class<T> entityClass, Long id);

    long getNextIdVal(String tableName, String columnIdName);

    <T> Object insert(T entity);

    <T> List<T> findAll(Class<T> entityClass);
    <T> T update(T entity) throws NoSuchFieldException, IllegalAccessException;
	void delete(Object entity) throws NoSuchFieldException, IllegalAccessException;
	<T> List<T> findByParams (Class<T> entityClass, Map<String, Object> params) throws NoSuchFieldException, IllegalAccessException, InstantiationException;


}

