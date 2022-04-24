package com.example.brick4;

import java.util.ArrayList;

public class CreateUser {

    static ArrayList<User> usersArray = new ArrayList <>();

    public static void createUser(String email, String password, boolean status, String name){

        ArrayList<Transaction> transactionsHistory = new ArrayList <>();

        CardNumber cardNumber = new CardNumber("8890", CardNumber.numberCreator(), email);

        User user = new User(email, password, status, name, cardNumber, 0.0, transactionsHistory);

        usersArray.add(user);
    }

}
