package com.example.javafx.GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PushCounter extends Application {

    private int count;
    private Text countText;

    @Override
    public void start(Stage stage) throws Exception {
        count = 0;
        countText = new Text("Pushes: 0");

        Button push = new Button("Push Me !");
        push.setOnAction(this::processButtonPress);
        // Instead, a separate class can be used which implements
        // EventHandler<ActionEvent>

        // or could use lambda expressions
       /* push.setOnAction((event) -> {
            count++;
            countText.setText("Pushes: " + count);
        });*/

        FlowPane pane = new FlowPane(push, countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: grey");

        Scene scene = new Scene(pane, 300, 100);

        stage.setTitle("Push Counter");
        stage.setScene(scene);
        stage.show();
    }

    public void processButtonPress(ActionEvent event){
        count++;
        countText.setText("Pushes: " + count);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
