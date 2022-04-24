package com.example.brick4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginData {
    @FXML
    private TextField EmailValue;

    @FXML
    private TextField PasswordValue;

    @FXML
    protected void loginButton() {

        System.out.println(CreateUser.usersArray.toString());

    }
}