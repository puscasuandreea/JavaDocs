package ro.teamnet.zth.api.database;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

/**
 * Created by Andreea.Puscasu on 7/13/2017.
 */
public class DBManager {
    public static final String CONNECTION_STRING = "jdbc:oracle:thin:@" + DBProperties.IP + ":"+DBProperties.PORT +":xe";

    private DBManager(){
        throw  new UnsupportedOperationException();
    }
    private static void registerDriver(){
        try {
            Class.forName(DBProperties.DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: unable to load driver class!");
            e.printStackTrace();
        }
    }
    public  static Connection getConnection(){
        Connection c = null;
        try {
           c = DriverManager.getConnection(CONNECTION_STRING ,DBProperties.USER , DBProperties.PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }
    public  static boolean checkConnection(Connection connection){

        try {
            Statement stm = connection.createStatement();
            boolean rs = stm.execute("SELECT 1 FROM  DUAL");
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}



