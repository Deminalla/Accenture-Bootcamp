package com.chatapp;

import javafx.scene.layout.VBox;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket; // listens to incoming connections and if it gets one, it will create a serversocket
    private Socket socket;
    private BufferedReader buffReader;
    private BufferedWriter buffWriter;

    public Server(ServerSocket serverSocket) {
        try {
        this.serverSocket = serverSocket;
        this.socket = serverSocket.accept(); // program will halt until a client connects to us

        this.buffReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.buffWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        } catch (IOException e) {
            System.out.println("Error creating server");
            e.printStackTrace();
            closeAll(socket, buffReader, buffWriter);
        }
    }

    public void sendMessageToClient(String messageToClient){
        try{
            buffWriter.write(messageToClient);
            buffWriter.newLine(); // this shows that it's the end of the message
            buffWriter.flush();
        }catch(IOException e){
            System.out.println("Error when sending message to client");
            e.printStackTrace();
            closeAll(socket, buffReader, buffWriter);
        }
    }

    public void receiveMessageFromClient(VBox vBox){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (socket.isConnected()){
                    try {
                        String messageFromClient = buffReader.readLine();
                        Controller.addLabel(messageFromClient, vBox);
                    } catch (IOException e) {
                        System.out.println("Error when receiving message from client");
                        e.printStackTrace();
                        closeAll(socket, buffReader, buffWriter);
                    }
                }
            }
        }).start();
    }

    public void closeAll(Socket socket, BufferedReader buffR, BufferedWriter buffW){
        try{
            if(buffR != null){
                buffR.close();
            }
            if(buffW != null){
                buffW.close();
            }
            if(socket != null){
                socket.close();
            }
        }catch(IOException e){

        }
    }
}
