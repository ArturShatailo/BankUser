package com.example.brick4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class LoginData {
    @FXML
    private TextField EmailValue;

    @FXML
    private TextField PasswordValue;

    @FXML
    private Label MessageValue;

    @FXML
    private Button loginButton;

    @FXML
    protected void loginButton() {

        for(int i=0; i<CreateUser.getUsersArray().size(); i++){

            //Check if the email is equal to anyone User's email in database
            if (CreateUser.getUsersArray().get(i).getEmail().equals(EmailValue.getText())){

                //Check if the password suits the email
                if(CreateUser.getUsersArray().get(i).getPassword().equals(PasswordValue.getText())){

                    //when User is online, the status goes to true
                    CreateUser.getUsersArray().get(i).status = true;
                    Stage currentStage = (Stage) loginButton.getScene().getWindow();

                    //open a personal area window
                    Tech.NewAreaWindow(getClass().getResource("personal-area.fxml"), "personal-area", CreateUser.getUsersArray().get(i), currentStage);
                    System.out.println("/////////\n"+CreateUser.getUsersArray().toString());
                    break;

                }else{
                        MessageValue.setText("Wrong password or email");
                }

            }else{
                MessageValue.setText("Wrong password or email");
            }
        }
    }

    public void loginBackButton() {

        //back to main page
        Stage currentStage = (Stage) MessageValue.getScene().getWindow();
        Tech.NewWindow(getClass().getResource("main.fxml"), "Home page", currentStage);

    }
}