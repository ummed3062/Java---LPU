package com.lpu.unit5;

import java.io.*;
import java.net.*;
public class NetworkReadExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://ums.lpu.in/lpuums/LoginNew.aspx");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
