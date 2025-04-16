package com.lpu.unit6.jdbc;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class ReadData {
    public static void main(String[] args) {
        try {
            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

