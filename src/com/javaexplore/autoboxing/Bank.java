package com.javaexplore.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Searchable> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addNewBranch(String branchName) {
//        if (findBranch(branchName) == null) {
        if (Utility.findItemFromList(branches, branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addNewCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null ) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        return (Branch) branches
                .stream()
                .filter(branch -> branchName.equals(branch.getName()))
                .findAny()
                .orElse(null);
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            List<Searchable> branchCustomers = branch.getCustomers();

            System.out.println("\nCustomer details for " + branch.getName() + " branch");

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = (Customer) branchCustomers.get(i);

                System.out.printf("\nCustomer %d: %s\n", (i + 1), branchCustomer.getName());

                if (showTransactions) {
                    List<Double> transactions = branchCustomer.getTransactions();

                    System.out.println("Transactions: ");
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.printf("[%d] Amount: %f\n", (j + 1), transactions.get(j));
                    }
                }
            }
            return true;
        }

        return false;
    }
}
