package com.javaexplore.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Searchable{
    private String name;
    private List<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    @Override
    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
