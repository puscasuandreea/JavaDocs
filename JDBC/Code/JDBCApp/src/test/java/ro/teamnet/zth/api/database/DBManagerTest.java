package ro.teamnet.zth.api.database;


import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Andreea.Puscasu on 7/13/2017.
 */

public class DBManagerTest {

    @Test
    public void testGetConnection(){
    Connection connection = DBManager.getConnection();
    boolean res = true;
    assertEquals(res, DBManager.checkConnection(connection));
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
