package com.example.labpracticum11;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.time.format.DateTimeFormatter;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        Label label = new Label();
        Button btn = new Button("show choosen path");
        btn.setPrefSize(100,100);
        btn.setOnAction((event) ->{
            fileChooser.setTitle("title");
            label.setText(file.getAbsolutePath());
                });
        root.getChildren().addAll(label,btn);
        Scene scene = new Scene(root, 1980, 1080);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
