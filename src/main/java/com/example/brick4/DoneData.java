package com.example.brick4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class DoneData {

    @FXML
    private Button doneCloseButton;

    @FXML
    private Label MessageDoneValue;

    @FXML
    protected void doneCloseButton() {

        Stage currentStage = (Stage) MessageDoneValue.getScene().getWindow();
        currentStage.close();

    }

}