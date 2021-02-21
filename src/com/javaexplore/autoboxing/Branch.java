package com.javaexplore.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Searchable{
    private String name;
    private List<Searchable> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    public List<Searchable> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
//        if (findCustomer(customerName) == null) {
        if (Utility.findItemFromList(customers, customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String customerName) {
        return (Customer) customers
                .stream()
                .filter(customer -> customerName.equals(customer.getName()))
                .findFirst()
                .orElse(null);
    }
}
