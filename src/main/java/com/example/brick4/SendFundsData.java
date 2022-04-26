package com.example.brick4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    private static User currentUser;

     public void SendFundsInfo(User user) {

         CardSendLabel.setText("your card  "+user.getCardNumber().toString());
         BalanceSendLabel.setText("with balance  USD"+user.getCardBalance().toString());
         TransactionsSendLabel.setText("Transactions history:\n"+user.getTransactionsHistory().toString());

         currentUser = user;
    }

    @FXML
    public void doSendFundsButton() {
        Double amount = Double.parseDouble(AmountRegValue.getText());
        Transaction transaction = new Transaction("12", java.time.LocalDate.now().toString(), currentUser.getEmail(), currentUser.getEmail(), CardResRegValue.getText(), amount);

        boolean sendValidator = true;

        if(amount<=currentUser.getCardBalance()) {

            for (int i = 0; i < CreateUser.getUsersArray().size(); i++) {
                if (CreateUser.getUsersArray().get(i).getCardNumber().toString().equals(CardResRegValue.getText())) {
                    sendValidator = true;
                    break;
                } else {
                    sendValidator = false;
                }
            }
        }else{
            sendValidator = false;
        }
        if (!sendValidator) {
            MessageSendValue.setText("Check the amount or receiver's card");
        }else{
            for(int i=0; i<CreateUser.getUsersArray().size(); i++){
                if (CreateUser.getUsersArray().get(i).getEmail().equals(currentUser.getEmail())){

                    CreateUser.getUsersArray().get(i).getTransactionsHistory().getTransactionsHistory().add(transaction);
                    CreateUser.getUsersArray().get(i).setCardBalance(currentUser.getCardBalance()-amount);

                    for(int j=0; j<CreateUser.getUsersArray().size(); j++){
                        if (CreateUser.getUsersArray().get(j).getCardNumber().toString().equals(CardResRegValue.getText())) {
                            CreateUser.getUsersArray().get(j).setCardBalance(CreateUser.getUsersArray().get(j).getCardBalance()+amount);
                        }
                    }


                    System.out.println("/////////\n"+CreateUser.getUsersArray().toString());

                }
            }
        }






    }
}
