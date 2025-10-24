package Jdbc;

import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {

    public void createTable() {
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
            String query = "create table student (sid int(3), sname varchar(200), smail varchar(200))";

            // statement execution
            stm.execute(query);
            System.out.println("table created ");

            //connection cloase
            conn.close();
        }catch (Exception e){e.printStackTrace();}
    }
}