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

     protected static void PersonalArea(User user) {

        Tech.NewWindow(AreaApplication.class.getResource("personal-area.fxml"), "personal-area");
        System.out.println(user.toString());
        /*PersonalAreaData.NameAreaLabel.setText(user.getName());
        PersonalAreaData.EmailAreaLabel.setText(user.getEmail());
        PersonalAreaData.CardAreaLabel.setText(user.getCardNumber().toString());
        PersonalAreaData.BalanceAreaLabel.setText(user.getCardBalance().toString());
        TransactionsAreaLabel.setText(user.getCardBalance().toString());*/

    }

}
