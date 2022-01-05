module com.example.coinflipper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coinflipper to javafx.fxml;
    exports com.example.coinflipper;
}