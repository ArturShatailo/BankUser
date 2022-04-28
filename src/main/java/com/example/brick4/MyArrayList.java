package com.example.brick4;

import java.util.ArrayList;

class MyArrayList extends ArrayList {

    //I create a new Class with my own toString for ArrayList
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.size(); i++) {
            result += this.get(i)+"\n";
        }
        return result;
    }
}
