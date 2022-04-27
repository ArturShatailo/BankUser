package com.example.brick4;

import java.util.ArrayList;

public class Bot extends User{

    public Bot(String email, String password, boolean status, String name, MyArrayList cards, TransactionsHistory transactionsHistory) {
        super(email, password, status, name, cards, transactionsHistory);
    }

    public static void CreateBot(String email, String password, String name){
        Transaction tr = new Transaction("9087", "04/02/2030", email, email, "456723455465446", 1000.0);
        Transaction tr1 = new Transaction("9089", "04/02/2031", email, email, "456754353243467", 300.0);
        MyArrayList tl = Transaction.createTransactionsList();
        tl.add(tr);
        tl.add(tr1);
        TransactionsHistory transactionsHistory = new TransactionsHistory(email, tl);

        CardNumber cardNumberU = new CardNumber("8890", CardNumber.numberCreator(), email);
        CardNumber cardNumberE = new CardNumber("8890", CardNumber.numberCreator(), email);
        Card cardU = new Card(cardNumberU.toString(), "USD", 5000.0, email);
        Card cardE = new Card(cardNumberE.toString(), "EUR", 4000.0, email);
        MyArrayList cards =  Card.CreateCardList(cardU, cardE);

        Bot bot = new Bot(email, password, false, name, cards, transactionsHistory);
        CreateUser.getUsersArray().add(bot);
    }

}
