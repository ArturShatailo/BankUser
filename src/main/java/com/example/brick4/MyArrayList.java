package com.example.brick4;

import java.util.ArrayList;

class MyArrayList extends ArrayList {

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.size(); i++) {
            result += this.get(i)+"\n";
        }
        return result;
    }
}
