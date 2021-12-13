package com.company;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class clientObject {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        System.out.println("Connected!");
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Hello from the other side!"));
        messages.add(new Message("How are you doing?"));
        messages.add(new Message("What time is it?"));
        messages.add(new Message("Hi hi hi hi."));
        System.out.println("Sending messages to the ServerSocket");
        objectOutputStream.writeObject(messages);
        System.out.println("Closing socket and terminating program.");
        socket.close();
    }
}
