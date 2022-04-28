package com.example.brick4;

import java.util.ArrayList;

public class TransactionsHistory {

    private String userLogin;
    private MyArrayList transactionsHistory;

    public TransactionsHistory(String userLogin, MyArrayList transactionsHistory) {
        this.userLogin = userLogin;
        this.transactionsHistory = transactionsHistory;
    }

    //This array is used instead of database. Each User has own TransactionsHistory ArrayList that includes all User's transactions
    public MyArrayList getTransactionsHistory() {
        return transactionsHistory;
    }

    @Override
    public String toString(){
        return transactionsHistory+"\n";
    }

}
