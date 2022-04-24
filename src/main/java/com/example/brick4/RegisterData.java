package com.example.brick4;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegisterData {
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

        if (PasswordRegValue.getText().equals(PasswordRegConfirmValue.getText())){
            CreateUser.createUser(EmailRegValue.getText(), PasswordRegValue.getText(), true, NameRegValue.getText());
            System.out.println(CreateUser.usersArray.toString());

            LoginApplication login = new LoginApplication();
            //login.start();

        }else{
            PasswordLabel.setText("Your password is not equal to password confirm field. Re-enter please.");
        }


    }
}