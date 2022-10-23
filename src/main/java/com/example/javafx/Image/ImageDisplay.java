package com.example.javafx.Image;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageDisplay extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // Couldn't use the image in the folder to run this program
        Image img = new Image("https://img.freepik.com/free-photo/top-view-unrecognizable-hacker-performing-cyberattack-night_1098-18706.jpg?w=2000");
        ImageView imgView = new ImageView(img);
        imgView.setViewport(new Rectangle2D(0, 500, 1000, 1500));

        StackPane pane = new StackPane(imgView);
        pane.setStyle("-fx-background-color: cornsilk");

        Scene scene = new Scene(pane, 1000, 1350);

        stage.setTitle("Image Display");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
