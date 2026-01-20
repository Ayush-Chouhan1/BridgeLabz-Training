package com.digicontact;

import java.util.ArrayList;
import java.util.Iterator;

public class ContactManager {

    private ArrayList<Contact> list = new ArrayList<>();

    // Add contact
    public void addContact(Contact contact) {
        list.add(contact);
        System.out.println("Contact added successfully");
    }

    // Delete contact by first name
    public void deleteContact(String firstName) {
        Iterator<Contact> it = list.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                it.remove();
                found = true;
                System.out.println("Contact removed");
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found");
        }
    }
    // Edit contact by first name
    public void editContact(String firstName, String lastName, String email, String phoneNumber) {

        boolean found = false;

        for (Contact c : list) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                c.setLastName(lastName);
                c.setEmail(email);
                c.setPhoneNumber(phoneNumber);
                found = true;
                System.out.println("Contact updated");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found");
        }
    }

    // Display all contacts
    public void displayAll() {
        for (Contact c : list) {
            c.displayContact();
            System.out.println("------------");
        }
    }
}
