package com.example.project1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");}
        //welcomeText.setText(new println.Numeros.java()");
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("Numeros.java")); }
}