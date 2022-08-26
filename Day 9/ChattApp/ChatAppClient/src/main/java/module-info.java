module com.chatappclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.chatappclient to javafx.fxml;
    exports com.chatappclient;
}