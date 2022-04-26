package com.example.brick4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class MainData {


    @FXML
    private Button startRegistrationButton;


    @FXML
    protected void startRegistrationButton() {

        Tech.NewWindowStage(getClass().getResource("register-page.fxml"), "Registration page");

    }

    @FXML
    protected void startLoginButton() {

        Tech.NewWindowStage(getClass().getResource("login-page.fxml"), "Login page");

    }

}