package com.example.javafx.GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;

public class ButtonHandler implements EventHandler<ActionEvent> {
    private int count;
    private Text countText;

    @Override
    public void handle(ActionEvent event) {
        count++;
        countText.setText("Pushes: " + count);
    }
}
