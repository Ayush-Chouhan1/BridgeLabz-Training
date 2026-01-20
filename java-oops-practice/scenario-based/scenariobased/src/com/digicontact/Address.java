package com.digicontact;

public class Address {

    private String city;
    private String state;
    private int zip;

    public Address(String city, String state, int zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    
    public String toString() {
        return city + ", " + state + " - " + zip;
    }
}
