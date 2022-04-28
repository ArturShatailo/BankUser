package com.example.brick4;

import java.util.ArrayList;

public class CreateUser {


    //This ArrayList of Users is created instead of Database and includes all created User and Bot Objects
    private static ArrayList<User> usersArray = new ArrayList <>();

    public static ArrayList<User> getUsersArray() {
        return usersArray;
    }

    public static void createUser(String email, String password, boolean status, String name){

        TransactionsHistory transactionsHistory = new TransactionsHistory(email, Transaction.createTransactionsList());
        CardNumber cardNumberU = new CardNumber("8890", CardNumber.numberCreator(), email);
        CardNumber cardNumberE = new CardNumber("2490", CardNumber.numberCreator(), email);
        Card cardU = new Card(cardNumberU.toString(), "USD", 0.0, email);
        Card cardE = new Card(cardNumberE.toString(), "EUR", 0.0, email);
        MyArrayList cards =  Card.CreateCardList(cardU, cardE);

        User user = new User(email, password, status, name, cards, transactionsHistory);

        usersArray.add(user);
    }

}
