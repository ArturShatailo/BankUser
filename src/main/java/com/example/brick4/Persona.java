package com.example.brick4;

import java.util.ArrayList;

public class Persona {

    private String email;
    private String password;
    public boolean status;
    
    public Persona(String email, String password, boolean status) {
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        
    }

}


