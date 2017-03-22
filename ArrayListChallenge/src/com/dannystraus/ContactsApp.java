package com.dannystraus;

import java.util.ArrayList;

/**
 * Created by dstraus on 3/22/17.
 */
public class ContactsApp {

    private ArrayList<Contact> allContacts;

    public ContactsApp() {
        this.allContacts = new ArrayList<Contact>();
    }

    public boolean createContact(String name, String number) {
        if(findContact(name) >= 0) {
            System.out.println("Contact name already in use.");
            return false;
        } else {
            allContacts.add(new Contact(name, number));
            return true;
        }

    }

    public void listContacts() {
        for(int i = 0; i < allContacts.size(); i++) {
            System.out.println(allContacts.get(i).getName() + ": " + allContacts.get(i).getNumber());
        }
        System.out.println("What would you like to do now?");
    }

    public void editContact(String name, String number, int i) {
        allContacts.get(i).setNumber(number);
    }

    public void deleteContact(int i) {
        allContacts.remove(i);
    }

    public void queryContact(int i) {
        String name = allContacts.get(i).getName();
        String number = allContacts.get(i).getNumber();

        System.out.println(name + ": " + number);
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
