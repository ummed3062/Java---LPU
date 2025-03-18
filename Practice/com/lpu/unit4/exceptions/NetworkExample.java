package com.lpu.unit4.exceptions;

import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
        } catch (Exception e) {
            System.out.println("Network issue: " + e.getMessage());
        }
    }
}

