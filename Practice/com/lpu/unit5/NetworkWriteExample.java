package com.lpu.unit5;

import java.io.*;
import java.net.*;
public class NetworkWriteExample {
    public static void main(String[] args) {
        try (Socket socket = new Socket("example.com", 80);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
            writer.println("GET / HTTP/1.1\r\nHost: example.com\r\n\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

