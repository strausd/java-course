package com.dannystraus;

public class Main {

    public static void main(String[] args) {
//        BankAccount dannysAccount = new BankAccount(123, 500, "Danny Straus", "strausd@me.com", "469-443-8771");
        BankAccount dannysAccount = new BankAccount();

//        dannysAccount.setAccountNumber(123);
//        dannysAccount.setBalance(500);
//        dannysAccount.setCustomerName("Danny Straus");
//        dannysAccount.setEmail("strausd@me.com");
//        dannysAccount.setPhoneNumber(2144986335);
        System.out.println(dannysAccount.getAccountNumber());
        System.out.println(dannysAccount.getBalance());
        System.out.println(dannysAccount.getEmail());

        dannysAccount.deposit(100);

        dannysAccount.withdraw(1000);
        dannysAccount.withdraw(5);

        VipCustomer afton = new VipCustomer("Afton Straus", 100000, "afton.straus@icloud.com");

        System.out.println(afton.getName());
        System.out.println(afton.getCreditLimit());
        System.out.println(afton.getEmail());

        VipCustomer unknown = new VipCustomer();

        System.out.println(unknown.getName());
        System.out.println(unknown.getCreditLimit());
        System.out.println(unknown.getEmail());

        VipCustomer danny = new VipCustomer("Danny Straus", 5);

        System.out.println(danny.getName());
        System.out.println(danny.getCreditLimit());
        System.out.println(danny.getEmail());

    }
}
