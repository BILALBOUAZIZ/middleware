package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class clientthread {

    public static void main(String[] args) {
        try {
            Socket sock = new Socket("localhost" , 9999);

            OutputStream os = sock.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            Scanner scan = new Scanner(System.in);
            System.out.print("saisir une chaine:");
            String str = scan.nextLine();
            pw.println(str);

            InputStream is = sock.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}