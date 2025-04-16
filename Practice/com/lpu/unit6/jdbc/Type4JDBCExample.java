package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
public class Type4JDBCExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL Thin Driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
            System.out.println("Connected using Type 4 Driver");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

