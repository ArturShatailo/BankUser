package com.example.brick4;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    public Button registrationButton;

    @FXML
    protected void registrationButton() {

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

            //Creating a new User with all set data. After that, this User will be added to Array (database)
            CreateUser.createUser(EmailRegValue.getText(), PasswordRegValue.getText(), false, NameRegValue.getText());
            //Get a current Stage
            Stage currentStage = (Stage) registrationButton.getScene().getWindow();
            //Open a Scene with Login page
            Tech.NewWindow(getClass().getResource("login-page.fxml"), "Login page", currentStage);

        }
    }
}