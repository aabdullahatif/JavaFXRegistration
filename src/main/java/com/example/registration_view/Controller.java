package com.example.registration_view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {
    @FXML
    private TableView<Person> attendeesTV;  // Updated naming

    @FXML
    private TableColumn<Person, String> firstNameColumn;
    @FXML
    private TableColumn<Person, String> lastNameColumn;
    @FXML
    private TableColumn<Person, String> emailColumn;
    @FXML
    private TableColumn<Person, String> dobColumn;
    @FXML
    private TableColumn<Person, String> registrationIDColumn;  // Updated naming

    private ObservableList<Person> attendeesList = FXCollections.observableArrayList();

    public void initialize() {
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        emailColumn.setCellValueFactory(cellData -> cellData.getValue().emailProperty());
        dobColumn.setCellValueFactory(cellData -> cellData.getValue().dobProperty());
        registrationIDColumn.setCellValueFactory(cellData -> cellData.getValue().registrationIDProperty());
    }

    public void setAttendeesList(ObservableList<Person> attendeesData) {
        this.attendeesList = attendeesData;
        attendeesTV.setItems(attendeesList);
    }
}
