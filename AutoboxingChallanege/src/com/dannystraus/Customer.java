package com.dannystraus;

import java.util.ArrayList;

/**
 * Created by dstraus on 3/23/17.
 */
public class Customer {
    private ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(String name, double startingAmount) {
        this.name = name;
        this.transactions.add(startingAmount);
    }

    public void deposit(double amount) {
        transactions.add(amount);
    }

    public void withdraw(double amount) {
        if(amount > this.getBalance()) {
            System.out.println("Insufficient funds.");
        } else {
            transactions.add(-amount);
        }
    }

    public String getName(){
        return this.name;
    }

    public double getBalance() {
        double balance = 0.0;
        for(int i = 0; i < transactions.size(); i++) {
            balance += transactions.get(i);
        }
        return balance;
    }

    public void showTransactions() {
        for(int i = 0; i < transactions.size(); i++){
            System.out.println("Transaction " + (i+1) + ": " + transactions.get(i));
        }
    }


}
