module com.example.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ashilovich.client to javafx.fxml;
    exports com.ashilovich.client;
    exports com.ashilovich.client.forms;
    opens com.ashilovich.client.forms to javafx.fxml;
}