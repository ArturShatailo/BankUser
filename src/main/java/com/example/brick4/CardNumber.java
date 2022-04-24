package com.example.brick4;

public class CardNumber {

    private String prefix;
    private String personalNumber;
    private String userLogin;

    public CardNumber(String prefix, String personalNumber, String userLogin) {
        this.prefix = prefix;
        this.personalNumber = personalNumber;
        this.userLogin = userLogin;
    }

    @Override
    public String toString(){
        return prefix + personalNumber+" ("+userLogin+")";
    }

    public static String numberCreator(){

        String cardRandom = "";
        for (int i=0; i<12; i++){
            Integer random = Tech.getRandom(0, 9);
            cardRandom+=random.toString();
        }


        return cardRandom;
    }

}
