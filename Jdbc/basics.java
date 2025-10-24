package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class basics {
// java database connectivity
// steps:
// driver load
// connection (conn) establish
// statement create
// execute - query
// connection (conn) close
        public static void main(String[] args ) {
            // driver load

            //connection establish
            try{
                //url includes: driver:server://localhost:port/databaseName
                String url = "jdbc:mysql://localhost:3306/shivam";
                String userName = "root";
                String password = "1234";
                //connection create
                Connection conn = DriverManager.getConnection(url,userName,password);
                System.out.println("Connected Successfully");

                // statement create
                Statement stm = conn.createStatement();
                String query = "create database db";

                // statement execution
                stm.execute(query);
                System.out.println("database created ");

                //connection close
                conn.close();
            }catch (Exception e){e.printStackTrace();}


        }
}
