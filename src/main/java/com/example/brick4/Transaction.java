package com.example.brick4;

import java.util.ArrayList;

public class Transaction {

    private String number;
    private String date;
    private String userLogin;
    private String from;
    private String to;
    private String amount;

    public Transaction(String number, String date, String userLogin, String from, String to, String amount) {
        this.number = number;
        this.date = date;
        this.userLogin = userLogin;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "#"+ number + ", date: "+date+", from "+from+" to "+ to +", amount: "+ amount+"\n";
    }

    public static ArrayList createTransactionsList(){
        ArrayList<Transaction> transactionsHistory = new ArrayList <>();
        return transactionsHistory;
    }

}
