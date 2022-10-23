module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
    exports com.example.javafx.shapes;
    exports com.example.javafx.Image;
    exports com.example.javafx.GUI;
    exports com.example.javafx.picker;
    exports com.example.javafx.dialogBoxes;
    exports com.example.javafx.FileChoosers;

    opens com.example.javafx.shapes to javafx.fxml;
}