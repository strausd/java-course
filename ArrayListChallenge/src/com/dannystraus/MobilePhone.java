package com.dannystraus;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dstraus on 3/22/17.
 */
public class MobilePhone {
    private static Scanner scan = new Scanner(System.in);
    private String myNumber;
    private String name;
    private ContactsApp contacts = new ContactsApp();

    public MobilePhone(String myNumber, String name) {
        this.myNumber = myNumber;
        this.name = name;
    }

    public void createContact() {
        System.out.print("New contact name: ");
        String newName = scan.nextLine();
        System.out.print("New contact phone number: ");
        String newNumber = scan.nextLine();
        if(this.contacts.createContact(newName, newNumber)) {
            System.out.println("New contact created");
        } else {
            System.out.println("Contact already exists");
        }
        System.out.println("What would you like to do now?");
    }

    public void listContacts() {
        contacts.listContacts();
    }

    public void editContact() {
        System.out.print("Name of contact to edit: ");
        String name = scan.nextLine();
        int i = contacts.findContact(name);
        if(i == -1) {
            System.out.println("Contact does not exist.");
            System.out.println("What would you like to do now?");
        } else {
            System.out.print("New phone number for " + name + ": ");
            String number = scan.nextLine();
            contacts.editContact(name, number, i);
            System.out.println("What would you like to do now?");
        }
    }

    public void deleteContact() {
        System.out.print("Name of contact to delete: ");
        String name = scan.nextLine();
        int i = contacts.findContact(name);
        if(i == -1) {
            System.out.println("Contact does not exist.");
            System.out.println("What would you like to do now?");
        } else {
            contacts.deleteContact(i);
            System.out.println(name + " deleted.");
            System.out.println("What would you like to do now?");
        }
    }

    public void queryContact() {
        System.out.print("Name of contact to find: ");
        String name = scan.nextLine();
        int i = contacts.findContact(name);
        if(i == -1) {
            System.out.println("Contact does not exist.");
            System.out.println("What would you like to do now?");
        } else {
            contacts.queryContact(i);
            System.out.println("What would you like to do now?");
        }
    }


    public void displayOptions() {
        System.out.println("0. Show options");
        System.out.println("1. List contacts");
        System.out.println("2. Create contact");
        System.out.println("3. Edit contact");
        System.out.println("4. Delete contact");
        System.out.println("5. Search for contact");
        System.out.println("6. Exit");
    }

}
