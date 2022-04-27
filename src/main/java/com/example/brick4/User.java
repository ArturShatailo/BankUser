package com.example.brick4;

import java.util.ArrayList;

public class User extends Persona{

    private String name;
    private ArrayList<Card> cards;
    private TransactionsHistory transactionsHistory;


    public User(String email, String password, boolean status, String name, ArrayList<Card> cards, TransactionsHistory transactionsHistory) {
        super(email, password, status);
        this.name = name;
        this.cards = cards;
        this.transactionsHistory = transactionsHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList cards) {
        this.cards = cards;
    }

    public TransactionsHistory getTransactionsHistory() {
        return transactionsHistory;
    }

    public void setTransactionsHistory(TransactionsHistory transactionsHistory) {
        this.transactionsHistory = transactionsHistory;
    }

    @Override
    public String toString(){
        return "email: "+ getEmail() + "\npassword: "+getPassword()+"\nname: "+name+"\ncards: "+ cards.toString()+"\ntransaction history: "+ transactionsHistory+ "\nstatus: "+ status+"\n\n";
    }


}
