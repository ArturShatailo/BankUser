package com.example.brick4;

import java.util.ArrayList;

public class Bot extends User{

    public Bot(String email, String password, boolean status, String name, Object cardNumber, Double cardBalance, TransactionsHistory transactionsHistory) {
        super(email, password, status, name, cardNumber, cardBalance, transactionsHistory);
    }

    public static void CreateBot(String email, String password, String name){
        Transaction tr = new Transaction("9087", "04/02/2030", email, email, "email@email.com", "1000");
        CardNumber cardNumber = new CardNumber("8890", CardNumber.numberCreator(), email);
        ArrayList tl = Transaction.createTransactionsList();
        tl.add(tr);
        TransactionsHistory transactionsHistory = new TransactionsHistory(email, tl);
        Bot bot = new Bot(email, password, false, name, cardNumber, 5000.0, transactionsHistory);
        CreateUser.getUsersArray().add(bot);
    }

}
