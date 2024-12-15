package com.example.registration_view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        Label firstNameLabel = new Label("First Name:");
        TextField firstNameField = new TextField();
        firstNameField.setPromptText("Enter first name");
        grid.add(firstNameLabel, 0, 0);
        grid.add(firstNameField, 1, 0);

        Label lastNameLabel = new Label("Last Name:");
        TextField lastNameField = new TextField();
        lastNameField.setPromptText("Enter last name");
        grid.add(lastNameLabel, 0, 1);
        grid.add(lastNameField, 1, 1);

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        emailField.setPromptText("Enter Farmingdale email");
        grid.add(emailLabel, 0, 2);
        grid.add(emailField, 1, 2);

        Label dobLabel = new Label("Date of Birth:");
        TextField dobField = new TextField();
        dobField.setPromptText("MM/DD/YYYY");
        grid.add(dobLabel, 0, 3);
        grid.add(dobField, 1, 3);

        Label zipLabel = new Label("Zip Code:");
        TextField zipField = new TextField();
        zipField.setPromptText("Enter ZIP code");
        grid.add(zipLabel, 0, 4);
        grid.add(zipField, 1, 4);

        Button submitButton = new Button("Submit");
        grid.add(submitButton, 1, 5);
        submitButton.setOnAction(e -> {
            if (validateInput(firstNameField, lastNameField, emailField, dobField, zipField)) {
                System.out.println("Registration Successful");
            } else {
                System.out.println("Validation Failed");
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean validateInput(TextField firstName, TextField lastName, TextField email, TextField dob, TextField zip) {
        String firstNameRegex = "^[a-zA-Z]{2,25}$";
        String lastNameRegex = "^[a-zA-Z]{2,25}$";
        String emailRegex = "^[a-zA-Z0-9._%+-]+@farmingdale\\.edu$";
        String dobRegex = "^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/(19|20)\\d\\d$";
        String zipRegex = "^\\d{5}$";

        boolean valid = true;
        if (!firstName.getText().matches(firstNameRegex)) {
            firstName.setStyle("-fx-border-color: red;");
            valid = false;
        } else {
            firstName.setStyle("");
        }
        if (!lastName.getText().matches(lastNameRegex)) {
            lastName.setStyle("-fx-border-color: red;");
            valid = false;
        } else {
            lastName.setStyle("");
        }
        if (!email.getText().matches(emailRegex)) {
            email.setStyle("-fx-border-color: red;");
            valid = false;
        } else {
            email.setStyle("");
        }
        if (!dob.getText().matches(dobRegex)) {
            dob.setStyle("-fx-border-color: red;");
            valid = false;
        } else {
            dob.setStyle("");
        }
        if (!zip.getText().matches(zipRegex)) {
            zip.setStyle("-fx-border-color: red;");
            valid = false;
        } else {
            zip.setStyle("");
        }

        return valid;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
