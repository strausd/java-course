package com.dannystraus;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Bank chase = new Bank("Chase", "Texas");
	    Branch texasBranch = chase.getBranch("Texas");
	    texasBranch.addCustomer("Danny", 500);
	    texasBranch.addCustomer("Afton", 500);
        Customer danny = texasBranch.getCustomer("Danny");
        System.out.println(danny.getBalance());
        danny.deposit(100);
        danny.withdraw(200);
        System.out.println(danny.getBalance());
        danny.showTransactions();
        texasBranch.showCustomers();
        texasBranch.addTransactionDeposit("Danny", 500);
        texasBranch.addTransactionWithdraw("Danny", 100);
        texasBranch.addTransactionWithdraw("Danny", 1000);
        System.out.println(danny.getBalance());
        danny.showTransactions();
    }
}
