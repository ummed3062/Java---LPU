package com.lpu.chatapplication;

import java.io.*;
import java.net.*;


public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {


            System.out.println("Connected to server.");
            System.out.println("Server: " + input.readLine());


            String message;
            while ((message = userInput.readLine()) != null) {
                output.println(message);
                System.out.println("Server: " + input.readLine()); // Receive response
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

