package com.digicontact;

public class Contact {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address address;

    public Contact(String firstName, String lastName, String email, String phoneNumber,
                   String city, String state, int zip) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = new Address(city, state, zip);
    }

    public void displayContact() {
        System.out.println("Name - " + firstName + " " + lastName);
        System.out.println("Email - " + email + "  Number - " + phoneNumber);
        System.out.println("Address - " + address);
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
