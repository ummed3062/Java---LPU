package com.lpu.unit5;

import java.sql.*;

public class DatabaseReadExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/micro_hotel", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM hotel");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

