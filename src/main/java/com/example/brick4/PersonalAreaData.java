package com.example.brick4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.text.BreakIterator;

public class PersonalAreaData {

    @FXML
    private static Label MessageAreaValue;

    @FXML
    private static Label TransactionsAreaLabel;

    @FXML
    private static Label NameAreaLabel;

    @FXML
    private static Label CardAreaLabel;

    @FXML
    private static Label EmailAreaLabel;

    @FXML
    private static Label BalanceAreaLabel;

    @FXML
    protected static void PersonalArea(User user) {

        Tech.NewWindow(AreaApplication.class.getResource("personal-area.fxml"), "personal-area");
        NameAreaLabel.setText(user.getName());
        EmailAreaLabel.setText(user.getEmail());
        CardAreaLabel.setText(user.getCardNumber().toString());
        BalanceAreaLabel.setText(user.getCardBalance().toString());
        TransactionsAreaLabel.setText(user.getCardBalance().toString());

    }


}
