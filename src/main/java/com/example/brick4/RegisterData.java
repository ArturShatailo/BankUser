package com.example.brick4;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class RegisterData {
    @FXML
    private Label MessageRegValue;
    @FXML
    private TextField NameRegValue;
    @FXML
    private TextField EmailRegValue;
    @FXML
    private TextField PasswordRegValue;
    @FXML
    private TextField PasswordRegConfirmValue;
    @FXML
    public Label PasswordLabel;


    @FXML
    protected void registrationButton() {

        Bot.CreateBot("email@email.com", "123qwe", "Arnold");
        Bot.CreateBot("user@email.com", "qwerty", "Boris");
        Bot.CreateBot("myemail@email.com", "C234f45trDWE", "Max");


        //Validation system that I created is not perfect :)

        boolean validator = true;
        if (PasswordRegValue.getText().equals(PasswordRegConfirmValue.getText())){

            for(int i=0; i<CreateUser.getUsersArray().size(); i++) {

                if (CreateUser.getUsersArray().get(i).getEmail().equals(EmailRegValue.getText())) {

                    MessageRegValue.setText("Set another email");
                    validator = false;
                    break;

                }else{ validator = true; }
            }
        }else{
            PasswordLabel.setText("Your password is not equal to password confirm field. Re-enter please.");
            validator = false;
        }
        if(validator){

            CreateUser.createUser(EmailRegValue.getText(), PasswordRegValue.getText(), false, NameRegValue.getText());
            Tech.NewWindow(getClass().getResource("login-page.fxml"), "Login page");

        }
    }
}