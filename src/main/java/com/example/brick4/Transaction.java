package com.example.brick4;

import java.util.ArrayList;

public class Transaction {

    private String number;
    private String date;
    private String userLogin;
    private String from;
    private String to;
    private Double amount;

    public Transaction(String number, String date, String userLogin, String from, String to, Double amount) {
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


    //Object user has ArrayList of its transactions that is created in the following method:
    public static MyArrayList createTransactionsList(){
        MyArrayList transactionsHistory = new MyArrayList ();
        return transactionsHistory;
    }

}
