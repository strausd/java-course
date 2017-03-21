package com.dannystraus;

/**
 * Created by dstraus on 3/21/17.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(000, 0, "No name", "No email", "No phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your new balance is $" + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("Your new balance is $" + this.balance);
        }
    }

}
