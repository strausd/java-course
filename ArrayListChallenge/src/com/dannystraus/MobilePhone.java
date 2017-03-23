package com.dannystraus;

import java.util.ArrayList;

/**
 * Created by dstraus on 3/22/17.
 */
public class MobilePhone {
    private String myNumber;
    private String name;
    private ContactsApp contacts = new ContactsApp();

    public MobilePhone(String myNumber, String name) {
        this.myNumber = myNumber;
        this.name = name;
    }

    public void createContact() {
        this.contacts.createContact();
    }

    public void listContacts() {
        contacts.listContacts();
    }

    public void editContact() {
        contacts.editContact();

    }

    public void deleteContact() {
        contacts.deleteContact();

    }

    public void queryContact() {
        contacts.queryContact();

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
