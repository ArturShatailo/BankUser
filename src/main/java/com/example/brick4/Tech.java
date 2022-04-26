package com.example.brick4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Tech {


    public static void NewWindow(URL application, String title){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(application);
            Scene scene = new Scene(fxmlLoader.load(), 520, 540);
            Stage loginStage = new Stage();
            loginStage.setTitle(title);
            loginStage.setScene(scene);
            loginStage.show();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public static void NewAreaWindow(URL application, String title, User user){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(application);
            Scene scene = new Scene(fxmlLoader.load(), 520, 540);
            Stage loginStage = new Stage();
            loginStage.setTitle(title);
            loginStage.setScene(scene);
            PersonalAreaData personalArea = fxmlLoader.getController();
            personalArea.PersonalArea(user);
            loginStage.show();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }


    //"GetInputFunction" is a scanner of input that returns integer number entered by user
    public static int GetInputFunction(){
        Scanner scan = new Scanner(System.in);
        int inputData = scan.nextInt();
        return inputData;
    }

    //"GetInputFunction" is a scanner of input that returns String entered by user
    public static String GetInputStringFunction(){
        Scanner scan = new Scanner(System.in);
        String inputData = scan.nextLine();
        return inputData;
    }

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
