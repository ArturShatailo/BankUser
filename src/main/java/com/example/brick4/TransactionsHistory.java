package com.example.brick4;

import java.util.ArrayList;

public class TransactionsHistory {

    private String userLogin;
    private MyArrayList transactionsHistory;

    public TransactionsHistory(String userLogin, MyArrayList transactionsHistory) {
        this.userLogin = userLogin;
        this.transactionsHistory = transactionsHistory;
    }

    public MyArrayList getTransactionsHistory() {
        return transactionsHistory;
    }

    @Override
    public String toString(){
        return transactionsHistory+"\n";
    }

}
