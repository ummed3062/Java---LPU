package com.lpu.revise.unit5.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class NetworkDataReadingDemo {

    public static void main(String[] args) throws IOException {

        Socket socket  = new Socket();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
}
