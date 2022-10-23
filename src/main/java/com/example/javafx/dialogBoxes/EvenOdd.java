package com.example.javafx.dialogBoxes;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class EvenOdd extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        boolean doAnother = true;

        while(doAnother){
            TextInputDialog inputDialog = new TextInputDialog();
            inputDialog.setHeaderText(null);
            inputDialog.setTitle(null);
            inputDialog.setContentText("Enter an integer: ");
            Optional<String> numString = inputDialog.showAndWait();

            if(numString.isPresent()){
                int num = Integer.parseInt(numString.get());

                String result = "That number is " +
                        ((num % 2 == 0) ? "even." : "odd.");
                Alert answerDialog = new Alert(Alert.AlertType.INFORMATION);
                answerDialog.setHeaderText(null);
                answerDialog.setContentText(result);
                answerDialog.showAndWait();

                Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION);
                confirmDialog.setHeaderText(null);
                confirmDialog.setContentText("Do Another?");
                Optional<ButtonType> another = confirmDialog.showAndWait();

                if(another.get() != ButtonType.OK)
                    doAnother = false;
            }
            else
                doAnother = false;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
