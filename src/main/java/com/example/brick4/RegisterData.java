package com.example.brick4;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    protected void registrationButton() {
        System.out.println("ok");

        Transaction tr1 = new Transaction("9087", "04/02/2030", "email@email.com", "user@email.com", "email@email.com", "1000");
        CardNumber cardNumber1 = new CardNumber("8890", CardNumber.numberCreator(), "email@email.com");
        ArrayList tl1 = Transaction.createTransactionsHistory();
        tl1.add(tr1);
        TransactionsHistory transactionsHistory1 = new TransactionsHistory("email@email.com", tl1);
        User user1 = new User("email@email.com", "123qwe", true, "Name", cardNumber1, 2000.0, transactionsHistory1);
        CreateUser.getUsersArray().add(user1);

        Transaction tr2 = new Transaction("9087", "04/02/2030", "user@email.com", "user@email.com", "email@email.com", "500");
        CardNumber cardNumber2 = new CardNumber("8890", CardNumber.numberCreator(), "user@email.com");
        ArrayList tl2 = Transaction.createTransactionsHistory();
        tl2.add(tr2);
        TransactionsHistory transactionsHistory2 = new TransactionsHistory("email@email.com", tl2);
        User user2 = new User("user@email.com", "qwerty", true, "Steven King", cardNumber2, 1000.0, transactionsHistory2);
        CreateUser.getUsersArray().add(user2);

        if (PasswordRegValue.getText().equals(PasswordRegConfirmValue.getText())){

            /*for(int i=0; i<CreateUser.getUsersArray().size(); i++) {

                if (CreateUser.getUsersArray().get(i).getEmail().equals(EmailRegValue.getText())) {

                    MessageRegValue.setText("Set another email");
                    break;

                }else{

                    CreateUser.createUser(EmailRegValue.getText(), PasswordRegValue.getText(), true, NameRegValue.getText());
                    System.out.println(CreateUser.getUsersArray().toString());
                    Tech.NewWindow(LoginApplication.class.getResource("login-page.fxml"), "Login page");
                    break;
                }
            }*/

            //NEED TO BE ADJUSTED
            CreateUser.createUser(EmailRegValue.getText(), PasswordRegValue.getText(), true, NameRegValue.getText());
            System.out.println(CreateUser.getUsersArray().toString());
            Tech.NewWindow(LoginApplication.class.getResource("login-page.fxml"), "Login page");


        }else{
            PasswordLabel.setText("Your password is not equal to password confirm field. Re-enter please.");
        }
    }
}