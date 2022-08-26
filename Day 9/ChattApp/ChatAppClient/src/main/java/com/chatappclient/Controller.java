package com.chatappclient;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ScrollPane scrollP;

    @FXML
    private Button sendButton;

    @FXML
    private VBox vBoxMessages;

    @FXML
    private TextField messageTF;

    private Client client;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            client = new Client(new Socket("localhost", 1234));
            System.out.println("Connected to server");
        }catch(IOException e){
            e.printStackTrace();
        }

        vBoxMessages.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                scrollP.setVvalue((Double) newValue);
            }
        });

        client.receiveMessageFromServer(vBoxMessages);

        sendButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String messageToSend = messageTF.getText();
                if(!messageToSend.isEmpty()) {
                    HBox horizontalB = new HBox();
                    horizontalB.setAlignment(Pos.CENTER_RIGHT);
                    horizontalB.setPadding(new Insets(5, 5, 5, 10));

                    Text text = new Text(messageToSend);
                    TextFlow tFlow = new TextFlow(text);

                    tFlow.setStyle("-fx-color: rgb(239,242,255); " + "-fx-background-color: rgb(15,125,242);" + " -fx-background-radius: 20px");

                    tFlow.setPadding(new Insets(5, 10, 5, 10));
                    text.setFill(Color.color(0.934, 0.945, 0.996));

                    horizontalB.getChildren().add(tFlow);
                    vBoxMessages.getChildren().add(horizontalB);

                    client.sendMessageToServer(messageToSend);
                    messageTF.clear(); // clear the text
                }
            }
        });
}

    public static void addLabel(String messageFromServer, VBox vBox){
        HBox horizontalB = new HBox();
        horizontalB.setAlignment(Pos.CENTER_LEFT);
        horizontalB.setPadding(new Insets(5, 5, 5, 10));

        Text text = new Text(messageFromServer);
        TextFlow tFlow = new TextFlow(text);

        tFlow.setStyle("-fx-background-color: rgb(233,233,235)" + " ;-fx-background-radius: 20px");

        tFlow.setPadding(new Insets(5, 10, 5, 10));

        horizontalB.getChildren().add(tFlow);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                vBox.getChildren().add(horizontalB);
            }
        });
    }
}