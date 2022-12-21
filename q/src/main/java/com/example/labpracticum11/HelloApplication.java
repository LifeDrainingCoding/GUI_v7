package com.example.labpracticum11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
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

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox(10);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        root.setAlignment(Pos.CENTER);
        Button btn = new Button("Call alert");
        btn.setPrefSize(100, 100);
        btn.setOnAction((event) -> {
            alert.setTitle("alert title");
            alert.setHeaderText("head text");
            alert.setContentText("context text");
            alert.initModality(Modality.NONE);
            alert.getDialogPane().setMinSize(600,200);
            alert.showAndWait();

        });
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);

        Button btn1 = new Button("call alert1");
        btn1.setPrefSize(100,100);
        btn1.setOnAction((event) -> {
                   alert1.setTitle("alert");
                   alert1.setGraphic(null);
                   alert1.setContentText("Context");
                   alert1.getDialogPane().setMinSize(600,200);
                   alert1.showAndWait();
                });
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
         Button btn2 = new Button("call alert2");
        btn2.setPrefSize(100,100);
        btn2.setOnAction((event) -> {
            alert2.setTitle("call alert2");
            alert2.setHeaderText(null);
            alert2.setContentText("content text");
            alert2.getDialogPane().setMinSize(600,200);
            alert2.showAndWait();
                });
        Alert alert3 = new Alert(Alert.AlertType.WARNING);
        Button btn3 = new Button("call alert3");
        btn3.setPrefSize(100,100);
        btn3.setOnAction((event) ->{
            alert3.setTitle("warning");
            alert3.setHeaderText("head");
            alert3.setContentText("content");
            alert3.getDialogPane().setMinSize(600,200);
            alert3.showAndWait();
                });
        Alert alert4 = new Alert(Alert.AlertType.CONFIRMATION);
        Label label = new Label();
        Button btn4 =new Button("call alert4");
        btn4.setPrefSize(100,100);
        btn4.setOnAction((event) ->{
            alert4.setTitle("confirmation");
            alert4.setHeaderText("Dialog");
            alert4.setContentText("are you ok?");
            alert4.getDialogPane().setMinSize(600,200);
            alert4.getDialogPane().setMinSize(600,200);
            Optional < ButtonType> result = alert.showAndWait();
            if (result.get()== ButtonType.OK) {
                label.setText("OK");
            } else {
                label.setText("CANCER");
            }
                });
        TextInputDialog dialog = new TextInputDialog();
        Label label1 = new Label();
        Button btn5 = new Button("call dialog");
        btn5.setPrefSize(100,100);
        btn5.setOnAction((event) ->{
            dialog.setTitle("dialog");
            dialog.setHeaderText("text input");
            dialog.setContentText("enter your name");
            dialog.getDialogPane().setMinSize(600,200);
            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                label1.setText("Your name:"+ result.get());
            } else {
                label1.setText("No name");
            }
                });
        List<String> choices = new ArrayList<>();
        choices.add("cat");
        choices.add("dog");
        choices.add("horse");
        ChoiceDialog <String> dialog1 = new ChoiceDialog<>("dog", choices);
        Button btn6 = new Button("call choices");
        btn6.setPrefSize(100,100);
        btn6.setOnAction((event) ->{
            dialog1.setTitle("choice");
            dialog1.setHeaderText("choice");
            dialog1.setContentText("choose");
            dialog1.getDialogPane().setMinSize(500,200);
            Optional<String> result = dialog1.showAndWait();
            if (result.isPresent()) {
                label1.setText("Your choice:"+ result.get());
            }else {
                label1.setText("No choice");
            }
                });

        root.getChildren().addAll(btn,btn1,btn2,btn3,btn4,btn5,btn6,label,label1);
        Scene scene = new Scene(root, 1980, 1080);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}