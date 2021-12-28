package com.xinzhou.hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

        System.out.println("start()...");

        Button button = new Button("Open Website");
        BorderPane pane =new BorderPane(button);

        button.setOnAction( event -> {
            getHostServices().showDocument("https://www.google.de/");
        });

        Scene scene = new Scene(pane ,600,480);


        stage.setScene(scene);
        stage.setTitle("JavaFX Demo");
        stage.show();

    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("init()..."); // for example here we can start connection to database
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("stop()..."); // for example here we can close connection to database
    }
}


