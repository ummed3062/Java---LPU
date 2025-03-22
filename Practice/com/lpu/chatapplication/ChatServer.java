package com.lpu.chatapplication;
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server started. Waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            output.println("Welcome to the chat!");


            BufferedReader serverMessage = new BufferedReader(new InputStreamReader(System.in));
            String message;
            while ((message = input.readLine()) != null) {
                System.out.println("Client: " + message);
                output.println("You said: " + serverMessage); // Echo back
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

