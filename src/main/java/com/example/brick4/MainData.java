package com.example.brick4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainData {

    @FXML
    protected void startRegistrationButton() {

        Tech.NewWindow(getClass().getResource("register-page.fxml"), "Registration page");

    }

    @FXML
    protected void startLoginButton() {

        Tech.NewWindow(getClass().getResource("login-page.fxml"), "Login page");

    }

}