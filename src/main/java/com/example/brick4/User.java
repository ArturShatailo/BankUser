package com.example.brick4;

import java.util.ArrayList;

public class User extends Persona{

    private String name;
    private Object cardNumber;
    private Double cardBalance;
    private ArrayList<Transaction> transactionsHistory;


    public User(String email, String password, boolean status, String name, Object cardNumber, Double cardBalance, ArrayList transactionsHistory) {
        super(email, password, status);
        this.name = name;
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
        this.transactionsHistory = transactionsHistory;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Object cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(Double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public ArrayList<Transaction> getTransactionsHistory() {
        return transactionsHistory;
    }

    public void setTransactionsHistory(ArrayList<Transaction> transactionsHistory) {
        this.transactionsHistory = transactionsHistory;
    }

    @Override
    public String toString(){
        return "email: "+ getEmail() + "\npassword: "+getPassword()+"\nname: "+name+"\ncard number: "+ cardNumber+"\nbalance: "+ cardBalance+"\ntransaction history: "+ transactionsHistory;
    }


}
