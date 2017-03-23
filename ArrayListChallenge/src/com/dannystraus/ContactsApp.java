package com.dannystraus;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dstraus on 3/22/17.
 */
public class ContactsApp {

    private static Scanner scan = new Scanner(System.in);

    private ArrayList<Contact> allContacts;

    public ContactsApp() {
        this.allContacts = new ArrayList<Contact>();
    }

    public void createContact() {
        System.out.print("New contact name: ");
        String name = scan.nextLine();
        if(findContact(name) >= 0) {
            System.out.println("Contact name already in use.");
            System.out.println("What would you like to do now?");
        } else {
            System.out.print("New contact phone number: ");
            String number = scan.nextLine();
            allContacts.add(new Contact(name, number));
            System.out.println("What would you like to do now?");
        }
    }

    public void listContacts() {
        for(int i = 0; i < allContacts.size(); i++) {
            System.out.println(allContacts.get(i).getName() + ": " + allContacts.get(i).getNumber());
        }
        System.out.println("What would you like to do now?");
    }

    public void editContact() {
        System.out.print("Name of contact to edit: ");
        String name = scan.nextLine();
        int i = findContact(name);
        if(i < 0) {
            System.out.println("Contact does not exist.");
            System.out.println("What would you like to do now?");
        } else {
            System.out.print("New phone number for " + name + ": ");
            String number = scan.nextLine();
            allContacts.get(i).setNumber(number);
            System.out.println("What would you like to do now?");
        }
    }

    public void deleteContact() {
        System.out.print("Name of contact to delete: ");
        String name = scan.nextLine();
        int i = findContact(name);
        if(i < 0) {
            System.out.println("Contact does not exist.");
            System.out.println("What would you like to do now?");
        } else {
            allContacts.remove(i);
            System.out.println(name + " deleted.");
            System.out.println("What would you like to do now?");
        }

    }

    public void queryContact() {
        System.out.print("Name of contact to find: ");
        String name = scan.nextLine();
        int i = findContact(name);
        if(i < 0) {
            System.out.println("Contact does not exist.");
            System.out.println("What would you like to do now?");
        } else {
            name = allContacts.get(i).getName();
            String number = allContacts.get(i).getNumber();

            System.out.println(name + ": " + number);

            System.out.println("What would you like to do now?");
        }

    }

    public int findContact(String name) {
        for(int i = 0; i < allContacts.size(); i++) {
            Contact tempContact = allContacts.get(i);
            if(tempContact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
