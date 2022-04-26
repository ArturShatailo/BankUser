package com.example.brick4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 540);
        stage.setTitle("Home page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Bot.CreateBot("email@email.com", "123qwe", "Arnold");
        Bot.CreateBot("user@email.com", "qwerty", "Boris");
        Bot.CreateBot("myemail@email.com", "C234f45trDWE", "Max");

        launch();
    }
}
