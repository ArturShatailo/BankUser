package com.example.brick4;
import java.util.ArrayList;

public class Card {

    protected String cardNumber;
    protected String cardCurrency;
    protected Double funds;
    private String owner;

    public Card(String cardNumber, String cardCurrency, Double funds, String owner) {
        this.cardNumber = cardNumber;
        this.cardCurrency = cardCurrency;
        this.funds = funds;
        this.owner = owner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString(){
        return "\n#"+ cardNumber + ", Currency: "+cardCurrency+", Balance: "+funds;
    }


    //Object User has card list that include all Cards of this User. This method created 2 cards initially during the registration
    public static MyArrayList CreateCardList(Card cardU, Card cardE){
        MyArrayList cards = new MyArrayList();
        cards.add(cardU);
        cards.add(cardE);
        return cards;
    }

}
