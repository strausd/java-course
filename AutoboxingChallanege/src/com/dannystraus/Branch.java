package com.dannystraus;

import java.util.ArrayList;

/**
 * Created by dstraus on 3/23/17.
 */
public class Branch {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private String name;

    public Branch(String name){
        this.name = name;
    }

    public void addCustomer(String customerName, double startingAmount) {
        if(findCustomer(customerName) < 0) {
            customers.add(new Customer(customerName, startingAmount));
        } else {
            System.out.println("Customer already exists.");
        }
    }

    public void addTransactionDeposit(String customerName, double amount) {
        if(findCustomer(customerName) < 0) {
            System.out.println("Customer does not exist.");
        } else {
            getCustomer(customerName).deposit(amount);
        }
    }

    public void addTransactionWithdraw(String customerName, double amount) {
        if(findCustomer(customerName) < 0) {
            System.out.println("Customer does not exist.");
        } else {
            getCustomer(customerName).withdraw(amount);
        }
    }

    public int findCustomer(String customerName) {
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public Customer getCustomer(String name) {
        int i = findCustomer(name);
        if(i < 0) {
            System.out.println("Customer does not exist");
            return null;
        } else {
            return customers.get(i);
        }
    }

    public String getName(){
        return this.name;
    }

    public void showCustomers() {
        for(int i = 0; i < customers.size(); i++){
            System.out.println("Customer " + (i+1) + ": " + customers.get(i).getName());
        }
    }

}
