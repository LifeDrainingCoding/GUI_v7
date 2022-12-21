module com.example.labpracticum11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labpracticum11 to javafx.fxml;
    exports com.example.labpracticum11;
}