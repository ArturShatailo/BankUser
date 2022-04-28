package com.example.brick4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tech {


    //Method for new Scene open in the same window (Stage)
    public static void NewWindow(URL application, String title, Stage stage){

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(application);
            Scene scene = new Scene(fxmlLoader.load(), 520, 540);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }


    //Method for new Stage open with new Scene
    public static void NewWindowStage(URL application, String title){

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(application);
            Scene scene = new Scene(fxmlLoader.load(), 520, 540);
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }

    //Method for new Scene of Personal Area open with custom method using for uploading data from "database" into fxml
    public static void NewAreaWindow(URL application, String title, User user, Stage stage){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(application);
            Scene scene = new Scene(fxmlLoader.load(), 520, 540);
            stage.setTitle(title);
            stage.setScene(scene);
            PersonalAreaData personalArea = fxmlLoader.getController();
            personalArea.PersonalArea(user);
            stage.show();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }

    //Method for new Scene of Send Funds open with custom method using for uploading data from "database" into fxml
    public static void NewSendWindow(URL application, String title, User user, Stage stage){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(application);
            Scene scene = new Scene(fxmlLoader.load(), 520, 640);
            stage.setTitle(title);
            stage.setScene(scene);
            SendFundsData sendFunds = fxmlLoader.getController();
            sendFunds.SendFundsInfo(user);
            stage.show();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }


    //"GetInputFunction" is a scanner of input that returns integer number entered by user

    //Method that adds set(specific) Objects into a set(specific) List and returns this completed List back.
    public static List addToList(Object objectName, List listName){
        listName.add(objectName);
        return listName;
    }

    //"getRandom" is a generator of random figure with set parameters of minimum and maximum of diapason.
    //The website with examples that I used to create a generator:
    //https://vertex-academy.com/tutorials/ru/generaciya-sluchajnyx-chisel-v-java/
    public static int getRandom(int min, int max){

        //int random = min + (int) ( Math.random() * (max+1) );
        int random = (int) (Math.random()*(max-min))+min;
        //System.out.println("Random: "+ random+" min: "+min+" max: "+max);
        return random;
    }

}
