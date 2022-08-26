package com.chatappclient;

import javafx.scene.layout.VBox;

import java.io.*;
import java.net.Socket;

public class Client {

    private Socket socket;
    private BufferedReader buffReader;
    private BufferedWriter buffWriter;

    public Client(Socket socket) {
        try {
            this.socket = socket; // program will halt until a client connects to us
            this.buffReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.buffWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        } catch (IOException e) {
            System.out.println("Error creating client");
            e.printStackTrace();
            closeAll(socket, buffReader, buffWriter);
        }
    }

    public void sendMessageToServer(String messageToServer){
        try{
            buffWriter.write(messageToServer);
            buffWriter.newLine(); // this shows that it's the end of the message
            buffWriter.flush();
        }catch(IOException e){
            System.out.println("Error when sending message to server");
            e.printStackTrace();
            closeAll(socket, buffReader, buffWriter);
        }
    }

    public void receiveMessageFromServer (VBox vBox){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (socket.isConnected()){
                    try {
                        String messageFromServer = buffReader.readLine();
                        Controller.addLabel(messageFromServer, vBox);
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
