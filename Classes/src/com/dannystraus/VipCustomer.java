package com.dannystraus;

/**
 * Created by dstraus on 3/21/17.
 */
public class VipCustomer {
    String name;
    double creditLimit;
    String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("No name", 0, "No email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "No name");
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
