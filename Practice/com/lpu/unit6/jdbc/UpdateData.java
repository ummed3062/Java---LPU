package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
public class UpdateData {
    public static void main(String[] args) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String query = "UPDATE students SET age = ? WHERE id = 100";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 24);
//            pstmt.setInt(2, 100);
            pstmt.executeUpdate();
            System.out.println("Data Updated Successfully");
            con.close();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
