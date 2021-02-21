package com.javaexplore.oop1;

class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String email;

    public VipCustomer(String customerName, double creditLimit, String email) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "username@yopmail.com");
    }

    public VipCustomer() {
        this("Glenn Sabales", 1000, "glenn.sabales@gmail.com");
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

public class VipCustomerMain {
    public static void main(String[] args) {
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println("------- CUSTOMER 1 -------");
        System.out.printf("Customer name: %s\n", vipCustomer1.getCustomerName());
        System.out.printf("Credit Limit: %.2f\n", vipCustomer1.getCreditLimit());
        System.out.printf("Email: %s\n\n", vipCustomer1.getEmail());

        VipCustomer vipCustomer2 = new VipCustomer("Eren Jaeger", 5000);
        System.out.println("------- CUSTOMER 2 -------");
        System.out.printf("Customer name: %s\n", vipCustomer2.getCustomerName());
        System.out.printf("Credit Limit: %.2f\n", vipCustomer2.getCreditLimit());
        System.out.printf("Email: %s\n\n", vipCustomer2.getEmail());

        VipCustomer vipCustomer3 = new VipCustomer("Jim Halpert", 3000, "jhalpert@office.com");
        System.out.println("------- CUSTOMER 3 -------");
        System.out.printf("Customer name: %s\n", vipCustomer3.getCustomerName());
        System.out.printf("Credit Limit: %.2f\n", vipCustomer3.getCreditLimit());
        System.out.printf("Email: %s\n\n", vipCustomer3.getEmail());
    }
}
