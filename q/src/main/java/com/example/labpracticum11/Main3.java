package com.example.labpracticum11;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main3 extends Application {
    public Main3() {
    }

    public void start(Stage stage) throws IOException {
        Spinner<Integer> spInt = new Spinner(-100, 100, 0);
        spInt.setStyle("-fx-font-size: 30px");
        spInt.setPrefWidth(170);

        Spinner<Double> spDouble = new Spinner(-100.0, 100.0, 1.0, 0.1);
        spDouble.setEditable(true);
        spDouble.setStyle("-fx-font-size: 30px");
        spDouble.setPrefWidth(170);

        Label label = new Label();
        label.setFont(Font.font(30));
        label.setPrefSize(400, 100);

        Button btn = new Button();
        btn.setText("Ok");
        btn.setFont(Font.font(30));
        btn.setOnAction((event) -> {
            label.setText("integer spinner: "+spInt.getValue()+"\ndouble spinner: "+spDouble.getValue());
        });

        VBox vBox = new VBox(20);
        vBox.setPadding(new Insets(50, 100, 50, 100));
        vBox.getChildren().addAll(spInt, spDouble, btn, label);
        Scene scene = new Scene(vBox);
        stage.setTitle("Spinner");
        stage.setScene(scene);
        stage.show();
    }
}