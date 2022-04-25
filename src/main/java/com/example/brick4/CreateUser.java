package com.example.brick4;

import java.util.ArrayList;

public class CreateUser {

    private static ArrayList<User> usersArray = new ArrayList <>();

    public static ArrayList<User> getUsersArray() {
        return usersArray;
    }


    public static void createUser(String email, String password, boolean status, String name){

        TransactionsHistory transactionsHistory = new TransactionsHistory(email, Transaction.createTransactionsHistory());

        CardNumber cardNumber = new CardNumber("8890", CardNumber.numberCreator(), email);

        User user = new User(email, password, status, name, cardNumber, 0.0, transactionsHistory);

        usersArray.add(user);
    }

}
