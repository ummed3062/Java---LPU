package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteData {
    public static void main(String[] args) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setFloat(1, 3);
            pstmt.executeUpdate();
            System.out.println("Data Deleted Successfully");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//{ 2: 'id' }
