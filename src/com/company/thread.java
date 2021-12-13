package com.company;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class thread extends Thread {
    int nbrC;
    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(9999);
            System.out.println("waiting for clients!");
            while(true) {
                Socket s = ss.accept();
                ++nbrC;
                new Conversation(s, nbrC).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } }
    class Conversation extends Thread{
        private Socket socket;
        private int numC;
        public Conversation(Socket socket, int numC) {
            super();
            this.socket = socket;
            this.numC = numC; }
        @Override
        public void run() {
            System.out.println("Connexion du client numero: "+nbrC); }}
    public static void main(String[] args) {
        new thread().start(); }}