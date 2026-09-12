package edu.psu.se411.lab04;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab 04");
        primaryStage.setWidth(500);
        primaryStage.setHeight(350);
        primaryStage.show();
    }
}