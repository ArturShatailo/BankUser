package com.example.brick4;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class SendFundsData {

    @FXML
    private Label MessageSendValue;

    @FXML
    private Label CardSendLabel;

    @FXML
    private Label BalanceSendLabel;

    @FXML
    private TextField CardResRegValue;

    @FXML
    private Label TransactionsSendLabel;

    @FXML
    private TextField AmountRegValue;

    @FXML
    private Button doSendFundsButton;

    @FXML
    private Button backButton;

    @FXML
    private ChoiceBox CardsListSelect;
    @FXML


    private static User currentUser;
    private static Card currentCard;

     public void SendFundsInfo(User user) {

         currentUser = user;

         TransactionsSendLabel.setText("Transactions history:\n"+user.getTransactionsHistory().toString());

         final String[] currencySelector = {""};
         CardsListSelect.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
             @Override
             public void changed(ObservableValue<? extends String> observableValue, String value, String t1) {
                 currencySelector[0] = t1;

                 for (int i = 0; i < user.getCards().size(); i++) {
                     if (user.getCards().get(i).cardCurrency.equals(currencySelector[0])) {
                         currentCard = user.getCards().get(i);
                         CardSendLabel.setText("your card:  "+currentCard.cardNumber);
                         BalanceSendLabel.setText("with balance "+currentCard.cardCurrency + currentCard.funds);
                         break;
                     }
                 }
             }
         });
    }

    @FXML
    public void backButton() {
        Stage currentStage = (Stage) MessageSendValue.getScene().getWindow();
        Tech.NewAreaWindow(getClass().getResource("personal-area.fxml"), "personal-area", currentUser, currentStage);
    }

    @FXML
    public void doSendFundsButton() {
        Double amount = Double.parseDouble(AmountRegValue.getText());
        Transaction transaction = new Transaction("12", LocalDate.now().toString(), currentUser.getEmail(), currentUser.getEmail(), CardResRegValue.getText(), amount);


        boolean sendValidator;
        if(amount<=currentCard.funds) {
                    sendValidator = true;
                } else {
                    sendValidator = false;
                }

        if (!sendValidator) {
            MessageSendValue.setText("Check funds amount on your card");
        }else{
            for(int i=0; i<CreateUser.getUsersArray().size(); i++){
                if (CreateUser.getUsersArray().get(i).getEmail().equals(currentUser.getEmail())){

                    CreateUser.getUsersArray().get(i).getTransactionsHistory().getTransactionsHistory().add(transaction);

                    for(int k=0; k<CreateUser.getUsersArray().get(i).getCards().size(); k++){
                        if (CreateUser.getUsersArray().get(i).getCards().get(k).cardNumber.equals(currentCard)) {
                            CreateUser.getUsersArray().get(i).getCards().get(k).funds -= (currentCard.funds-amount);
                        }
                    }
                }
            }

            for(int j=0; j<CreateUser.getUsersArray().size(); j++){

                for(int m=0; m<CreateUser.getUsersArray().get(j).getCards().size(); m++){
                    if (CreateUser.getUsersArray().get(j).getCards().get(m).cardNumber.equals(CardResRegValue.getText())) {
                        CreateUser.getUsersArray().get(j).getCards().get(m).funds += amount;
                        CreateUser.getUsersArray().get(j).getTransactionsHistory().getTransactionsHistory().add(transaction);
                    }
                }
            }

            //System.out.println("/////////\n"+CreateUser.getUsersArray());
        }
    }

}
