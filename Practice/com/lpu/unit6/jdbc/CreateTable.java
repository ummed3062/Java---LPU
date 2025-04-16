package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.Statement;
public class CreateTable {
    public static void main(String[] args) {
        try {
            Connection con = DatabaseConnection.getConnection();

            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE ADMIN (id INT PRIMARY KEY, name VARCHAR(50))";
            stmt.executeUpdate(sql);
            System.out.println("Table Created Successfully");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

