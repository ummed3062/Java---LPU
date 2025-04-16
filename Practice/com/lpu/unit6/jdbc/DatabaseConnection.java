package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

