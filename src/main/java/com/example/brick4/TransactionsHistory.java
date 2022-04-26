package com.example.brick4;

import java.util.ArrayList;

public class TransactionsHistory {

    private String userLogin;
    private ArrayList transactionsHistory;

    public TransactionsHistory(String userLogin, ArrayList transactionsHistory) {
        this.userLogin = userLogin;
        this.transactionsHistory = transactionsHistory;
    }

    @Override
    public String toString(){
        return "History: "+transactionsHistory;
    }

}
