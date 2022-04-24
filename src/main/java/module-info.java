module com.example.brick4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brick4 to javafx.fxml;
    exports com.example.brick4;
}