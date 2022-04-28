package com.example.brick4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PersonalAreaData {

    @FXML
    private Label MessageAreaValue;

    @FXML
    private Label TransactionsAreaLabel;

    @FXML
    private Label NameAreaLabel;

    @FXML
    private Label CardAreaLabel;

    @FXML
    private Label EmailAreaLabel;

    @FXML
    private Button logoutButton;

    @FXML
    private Button sendFundsButton;

    private static User currentUser;

    //Method gets USer Object to fill out the fields in Personal Area information
     public void PersonalArea(User user) {

         NameAreaLabel.setText("Name:  "+user.getName());
         CardAreaLabel.setText("Card number:  "+user.getCards().toString());
         EmailAreaLabel.setText("Email:  "+user.getEmail());
         TransactionsAreaLabel.setText("Transactions history:\n"+user.getTransactionsHistory().toString());

         currentUser = user;
    }

    @FXML
    public void logoutButton() {

         //Logout with set status field in User Object with false
        for(int i=0; i<CreateUser.getUsersArray().size(); i++){
            if (CreateUser.getUsersArray().get(i).getEmail().equals(currentUser.getEmail())){
                CreateUser.getUsersArray().get(i).status = false;
            }
        }

        //Transfer to Login page
        Stage currentStage = (Stage) logoutButton.getScene().getWindow();
        Tech.NewWindow(getClass().getResource("login-page.fxml"), "Login page", currentStage);

    }

    @FXML
    public void sendFundsButton() {

         //Transfer to Send Funds page
        Stage currentStage = (Stage) sendFundsButton.getScene().getWindow();
        Tech.NewSendWindow(getClass().getResource("send-funds.fxml"), "Send funds", currentUser, currentStage);

    }

}
