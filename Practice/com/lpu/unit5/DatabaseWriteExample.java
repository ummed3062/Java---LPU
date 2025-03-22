package com.lpu.unit5;

import java.sql.*;
public class DatabaseWriteExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/micro_hotel", "root", "root");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO hotel (hotel_id, name, about, location) VALUES (?, ?, ?, ?)");
            pstmt.setInt(1, 20);
            pstmt.setString(2, "City Palace");
            pstmt.setString(3, "Located in udaipur");
            pstmt.setString(4, "Udaipur");
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

