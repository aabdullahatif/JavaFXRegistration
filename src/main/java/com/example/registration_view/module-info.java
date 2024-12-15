module org.example.registration_view {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.registration_view to javafx.fxml;
    exports com.example.registration_view;
}



