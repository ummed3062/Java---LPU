package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Type2JDBCExample {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // Oracle Native Driver
            Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@localhost:1521:xe", "user", "password");
            System.out.println("Connected using Type 2 Driver");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

