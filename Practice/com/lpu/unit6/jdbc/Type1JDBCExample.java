package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Type1JDBCExample {
    public static void main(String[] args) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // Load JDBC-ODBC Driver
            Connection con = DriverManager.getConnection("jdbc:odbc:myDSN", "user", "password");
            System.out.println("Connected using Type 1 Driver");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

