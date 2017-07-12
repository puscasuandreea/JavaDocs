package ro.teamnet.zth.api.em;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;
import ro.teamnet.zth.appl.domain.Department;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Andreea.Puscasu on 7/12/2017.
 */
public class EntityUtils {

    private EntityUtils() {
        throw new UnsupportedOperationException("Exceptie");
    }

    public static String getTableName(Class entity) {
        return ((Table) entity.getAnnotation(Table.class)).name();
    }

    public static List<ColumnInfo> getColumns(Class entity) {
        List<ColumnInfo> list = new LinkedList<>();
        Field f[] = entity.getDeclaredFields();
        for (Field f1 : f) {
            if (f1.isAnnotationPresent(Column.class) || f1.isAnnotationPresent(Id.class)) {
                ColumnInfo ci = new ColumnInfo();
                ci.setColumnName(f1.getName());
                ci.setColumnType(f1.getType());

                if (f1.isAnnotationPresent(Column.class) == true) {
                    ci.setDbColumnName(f1.getAnnotation(Column.class).name());

                    ci.setIsld(false);
                } else {
                    ci.setIsld(true);
                    ci.setDbColumnName(f1.getAnnotation(Id.class).name());

                }

                list.add(ci);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        List<ColumnInfo> l = getColumns(Department.class);
        for (ColumnInfo l1 : l) {
            System.out.println(l1.getColumnName());
            System.out.println(l1.getColumnType());
            System.out.println(l1.getDbColumnName());
            System.out.println("");
        }

        Object o = castFromSqlTable(new  BigDecimal(2.3), Integer.class);

    }

    public static Object castFromSqlTable(Object value, Class wantedType) {
        Object o;
        if (value instanceof BigDecimal) {
            System.out.println(wantedType.getCanonicalName());
        }
        return value;
        if(value instanceof BigDecimal){
            System.out.println(wantedType.);
        }
    }
}