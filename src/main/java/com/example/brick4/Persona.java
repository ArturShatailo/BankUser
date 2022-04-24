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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static void main(String[] args) {
        
    }

    public static Boolean ToSignIn(boolean status){
        status = true;
        return status;
    }

    public static Boolean ToSignOut(boolean status){
        status = false;
        return status;
    }

}


