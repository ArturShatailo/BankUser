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

        //Get the current Stage
        Stage currentStage = (Stage) startRegistrationButton.getScene().getWindow();
        //Call a NewWindow method with set parameters of the necessary page
        Tech.NewWindow(getClass().getResource("register-page.fxml"), "Registration page", currentStage);

    }

    @FXML
    protected void startLoginButton() {

        //Get the current Stage
        Stage currentStage = (Stage) startLoginButton.getScene().getWindow();
        //Call a NewWindow method with set parameters of the necessary page
        Tech.NewWindow(getClass().getResource("login-page.fxml"), "Login page", currentStage);

    }

}