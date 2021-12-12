package com.company;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.io.*;
import java.net.*;

public class clientOctet {
    public static void main(String[] args) {

        final String host = "localhost";
        Socket s = null;

        {
            try {
                s = new Socket(host, 9999);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        InputStream is = null;
        try {
            is = s.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream os = null;
        try {
            os = s.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            os.write(23);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int rep = 0;
        try {
            rep = is.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(rep);

    }
}
