package com.lpu.unit5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(12345);

            System.out.println("server started. waiting for client....");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            output.println("Welcome to the chat");

            String message;
            while ((message = input.readLine()) != null){

                System.out.println("Client: " + message);
                output.println("You said: "+ message);
            }



        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
