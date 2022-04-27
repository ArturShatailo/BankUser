package com.example.brick4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MainData {


    @FXML
    private Button startRegistrationButton;

    @FXML
    private Button startLoginButton;


    @FXML
    protected void startRegistrationButton() {

        Stage currentStage = (Stage) startRegistrationButton.getScene().getWindow();
        Tech.NewWindow(getClass().getResource("register-page.fxml"), "Registration page", currentStage);

    }

    @FXML
    protected void startLoginButton() {

        Stage currentStage = (Stage) startLoginButton.getScene().getWindow();
        Tech.NewWindow(getClass().getResource("login-page.fxml"), "Login page", currentStage);

    }

}