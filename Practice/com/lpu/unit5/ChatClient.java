package com.lpu.unit5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 12345);


            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Connected to server");
            System.out.println("Server: "+ input.readLine());


            String message;
            System.out.println("Please type the message: ");
            while ((message = userInput.readLine()) != null){

                output.println(message);
                System.out.println("Server: " + input.readLine());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
