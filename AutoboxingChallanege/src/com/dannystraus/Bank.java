package com.dannystraus;

import java.util.ArrayList;

/**
 * Created by dstraus on 3/23/17.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name, String firstBranch) {
        this.name = name;
        this.branches.add(new Branch(firstBranch));
    }

    public void addBranch(String branchName) {
        if(findBranch(branchName) < 0) {
            this.branches.add(new Branch(branchName));
        } else {
            System.out.println("Branch already exists");
        }

    }

    public void addCustomer(Branch branch, String name, double amount) {
        if(findBranch(branch) < 0) {
            System.out.println("Branch does not exist");
        } else {
            branch.addCustomer(name, amount);
        }
    }

    public Branch getBranch(String name) {
        int i = findBranch(name);
        if(i < 0) {
            System.out.println("Branch does not exist");
            return null;
        } else {
            return branches.get(i);
        }
    }

    public ArrayList<Branch> getBranches() {
        return this.branches;
    }

    private int findBranch(Branch branch){
        return branches.indexOf(branch);
    }

    private int findBranch(String name) {
        for(int i = 0; i < branches.size(); i++) {
            if(branches.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
