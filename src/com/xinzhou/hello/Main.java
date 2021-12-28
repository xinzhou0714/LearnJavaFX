package com.xinzhou.hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

        Label label = new Label("Hallo Word");
        BorderPane pane =new BorderPane(label);

        Scene scene = new Scene(pane ,600,480);


        stage.setScene(scene);
        stage.setTitle("JavaFX Demo");
        stage.show();

    }
}


