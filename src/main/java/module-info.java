module com.example.week05 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.week05 to javafx.fxml;
    exports com.example.week05;
}