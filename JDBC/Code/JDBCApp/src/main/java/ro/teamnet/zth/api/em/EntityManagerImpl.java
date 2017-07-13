package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.database.DBManager;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Andreea.Puscasu on 7/13/2017.
 */
public class EntityManagerImpl implements EntityManager {



    @Override
    public <T> T findById(Class<T> entityClass, Long id) {


        try {
            Connection connection = DBManager.getConnection();
            Statement stm  = connection.createStatement();
            String tabelName = EntityUtils.getTableName(entityClass);
            List<ColumnInfo> columns = EntityUtils.getColumns(entityClass);
            List<Field> fileds = EntityUtils.getFieldsByAnnotations(entityClass,Id.class);
            Condition condition = new Condition();
            condition.setColumnName(fileds.get(0).getAnnotation(Id.class).name());
            condition.setValue(id);
            QueryBuilder queryBuilder = new QueryBuilder();
            queryBuilder.setTableName(tabelName);
            queryBuilder.addQueryColumns(columns);
            queryBuilder.setQueryType(QueryType.SELECT);
            queryBuilder.addCondition(condition);
            String string = queryBuilder.createQuery();
            //create a resultSet object using Statement and execute the query obtained above;
            ResultSet  resultSets = stm.executeQuery(queryBuilder.createQuery());
            if(resultSets.next()){
               T instance  = entityClass.newInstance();
               for(ColumnInfo columnInfo : columns){
                   Field f = instance.getClass().getDeclaredField(columnInfo.getColumnName());
                    f.setAccessible(true);
                    f.set(instance,EntityUtils.castFromSqlType(columnInfo.getValue(),columnInfo.getColumnType()));
               }
               return instance;
            }



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public long getNextIdVal(String tableName, String columnIdName) {


        try {
            Connection connection = DBManager.getConnection();
            Statement stm = connection.createStatement();
            String  q = "SELECT MAX("+columnIdName+") FROM " +tableName;
            ResultSet resultSet =  stm.executeQuery(q);
            long l = resultSet.getLong(columnIdName)+1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public <T> Object insert(T entity) {
        Connection connection = DBManager.getConnection();
        String tabelName = EntityUtils.getTableName((Class) entity);
        List<ColumnInfo> list = EntityUtils.getColumns((Class) entity);
        for(ColumnInfo columnInfo: list){
            if(columnInfo.isId()){
                columnInfo.setValue(getNextIdVal(tabelName,columnInfo.getDbColumnName()));
            }else{

            }
        }
        return null;
    }

    @Override
    public <T> List<T> findAll(Class<T> entityClass) {
        return null;
    }
}
