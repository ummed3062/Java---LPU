package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Type3JDBCExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:net://middleware-server:1521/mydb", "user", "password");
            System.out.println("Connected using Type 3 Driver");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

