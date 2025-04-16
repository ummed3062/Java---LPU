package com.lpu.unit6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class TransactionExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/micro_hotel", "root", "root");
            con.setAutoCommit(false); // Disable auto-commit


            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO hotel (hotel_id, name, about, location) VALUES (?, ?, ?, ?)");
            stmt.executeUpdate("INSERT INTO students (id, name, age) VALUES (2, 'Alice', 21)");


            con.commit(); // Commit transaction
            System.out.println("Transaction committed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


//CREATE PROCEDURE getStudent(IN studentID INT)
//BEGIN
//SELECT * FROM students WHERE id = studentID;
//END;


