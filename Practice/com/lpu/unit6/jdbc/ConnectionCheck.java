package com.lpu.unit6.jdbc;

import java.sql.Connection;

public class ConnectionCheck {

    public static void main(String[] args) {

        try {
            Connection con1 = DatabaseConnection.getConnection();
            System.out.println(con1.hashCode());

            Connection con2 = DatabaseConnection.getConnection();
            System.out.println(con2.hashCode());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
