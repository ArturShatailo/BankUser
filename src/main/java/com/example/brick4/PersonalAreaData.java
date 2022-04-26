package com.example.brick4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

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
    private Label BalanceAreaLabel;

     public void PersonalArea(User user) {

         NameAreaLabel.setText(user.getName());
         CardAreaLabel.setText(user.getCardNumber().toString());
         EmailAreaLabel.setText(user.getEmail());
         BalanceAreaLabel.setText(user.getCardBalance().toString());
         TransactionsAreaLabel.setText(user.getTransactionsHistory().toString());

    }

}
