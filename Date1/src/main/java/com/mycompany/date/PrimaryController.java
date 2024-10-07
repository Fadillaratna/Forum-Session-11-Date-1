package com.mycompany.date;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class PrimaryController {

    @FXML
    private DatePicker datePicker;

    @FXML
    public void initialize() {
        // Contoh LocalDate, bisa diganti dengan java.sql.Date sesuai kebutuhan
        LocalDate selectedDate = LocalDate.now();

        // Format tanggal
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateString = selectedDate.format(formatter);

        // Atur tanggal terformat ke dalam DatePicker
        datePicker.setValue(LocalDate.parse(dateString, formatter));
    }
}
