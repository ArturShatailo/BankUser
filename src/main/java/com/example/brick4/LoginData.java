package com.example.brick4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class LoginData {
    @FXML
    private TextField EmailValue;

    @FXML
    private TextField PasswordValue;

    @FXML
    private Label MessageValue;


    @FXML
    protected void loginButton() {

        for(int i=0; i<CreateUser.getUsersArray().size(); i++){

            if (CreateUser.getUsersArray().get(i).getEmail().equals(EmailValue.getText())){

                if(CreateUser.getUsersArray().get(i).getPassword().equals(PasswordValue.getText())){

                    PersonalAreaData.PersonalArea(CreateUser.getUsersArray().get(i));
                    break;

                }else{
                        MessageValue.setText("Wrong password or email");
                        break;
                }

            }else{
                MessageValue.setText("Wrong password or email");
                break;
            }

        }
    }
}