module org.ensup {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.ensup to javafx.fxml;
    exports org.ensup;
}