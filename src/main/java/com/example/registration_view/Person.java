package com.example.registration_view;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty email;
    private final StringProperty dob;
    private final StringProperty zip;

    public Person(String firstName, String lastName, String email, String dob, String registrationID) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.email = new SimpleStringProperty(email);
        this.dob = new SimpleStringProperty(dob);
        this.registrationID = new SimpleStringProperty(zip);
    }

    public Person() {
        this.firstName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
        this.dob = new SimpleStringProperty("");
        this.registrationID = new SimpleStringProperty("");
    }


    public String getFirstName() { return firstName.get(); }
    public void setFirstName(String firstName) { this.firstName.set(firstName); }
    public StringProperty firstNameProperty() { return firstName; }

    public String getLastName() { return lastName.get(); }
    public void setLastName(String lastName) { this.lastName.set(lastName); }
    public StringProperty lastNameProperty() { return lastName; }

    public String getEmail() { return email.get(); }
    public void setEmail(String email) { this.email.set(email); }
    public StringProperty emailProperty() { return email; }

    public String getDob() { return dob.get(); }
    public void setDob(String dob) { this.dob.set(dob); }
    public StringProperty dobProperty() { return dob; }

    public String getRegistrationID() { return zip.get(); }
    public void setRegistrationID(String zip) { this.zip.set(zip); }
    public StringProperty registrationIDProperty() { return zip; }
}
