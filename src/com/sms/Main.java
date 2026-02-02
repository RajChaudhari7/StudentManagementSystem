package com.sms;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Button goBtn = new Button("Go to Student Management");

        goBtn.setOnAction(e -> StudentController.show(stage));

        VBox root = new VBox(15, goBtn);
        root.setStyle("-fx-padding: 20");

        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Login Screen");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
