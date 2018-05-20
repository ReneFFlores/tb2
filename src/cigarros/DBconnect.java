/*Source codes of DBconnect.java*/
package Cigarros;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

/**
 *
 *
 *
 * @author Raz
 *
 */
public class DBconnect {

    public static Connection connect() throws ClassNotFoundException {

        Connection con = null;

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=tempdb;user=ReE;password=123";

        try {

            con = DriverManager.getConnection(connectionURL);
            System.out.println("Connection is successfull");

        } catch (SQLException e) {
            
            e.printStackTrace();

            System.out.println(e);

        }
        return con;
    }

    public static void main(String[] args) throws ClassNotFoundException {

        // TODO code application logic here
        //connect();

    }

}
