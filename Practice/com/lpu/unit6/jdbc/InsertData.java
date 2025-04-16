package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
public class InsertData {
    public static void main(String[] args) {
        try {
            Connection con = DatabaseConnection.getConnection();

            String query = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Ayush");
            pstmt.setInt(3, 24);
            pstmt.executeUpdate();
            System.out.println("Data Inserted Successfully");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

