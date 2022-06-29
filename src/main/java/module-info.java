module com.example.sofka.ejerciciojava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sofka.ejerciciojava to javafx.fxml;
    exports com.example.sofka.ejerciciojava;
}