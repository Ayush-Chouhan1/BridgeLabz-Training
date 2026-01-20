package com.digicontact;


import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        while (true) {
            System.out.println("\n--- DigiContact Address Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();

                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    int zip = sc.nextInt();

                    Contact contact = new Contact(fn, ln, email, phone, city, state, zip);
                    manager.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter First Name to Edit: ");
                    String editName = sc.nextLine();

                    System.out.print("New Last Name: ");
                    String newLast = sc.nextLine();

                    System.out.print("New Email: ");
                    String newEmail = sc.nextLine();
                    System.out.print("New Phone: ");
                    String newPhone = sc.nextLine();

                    manager.editContact(editName, newLast, newEmail, newPhone);
                    break;

                case 3:
                    System.out.print("Enter First Name to Delete: ");
                    String delName = sc.nextLine();

                    manager.deleteContact(delName);
                    break;

                case 4:
                    manager.displayAll();
                    break;

                case 5:
                    System.out.println("Exiting Address Book...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
