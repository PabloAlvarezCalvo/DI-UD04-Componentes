package com.example.diud04componentes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RelatoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}