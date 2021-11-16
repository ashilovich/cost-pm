package com.ashilovich.client.forms;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SmetaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}