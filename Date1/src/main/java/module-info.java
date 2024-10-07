module com.mycompany.date {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.date to javafx.fxml;
    exports com.mycompany.date;
}
