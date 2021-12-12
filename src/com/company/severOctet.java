package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class severOctet {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(9999);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        int nb = is.read();
        int rep = nb * 2 ;
        os.write(rep);





    }
}
