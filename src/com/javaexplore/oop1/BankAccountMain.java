package com.javaexplore.oop1;

class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        // Another use of "this" keyword: In case we would like to call another constructor within a constructor,
        // we can use this(<params>). Normally used if we have to set default values for objects with no parameters.
        // NOTE: this() should always be the first statement of the constructor block.
        this("00000", 2000.00, "John Doe", "johndoe@yopmail.com", "09234454353");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(final double fund) {

        if (customerName == null) {
            System.out.println("Customer name not found. Please enter customer name first.");
        } else {
            balance += fund;
            System.out.println(customerName + " has deposited " + fund + "Php in his/her account. " +
                    "His/her account balance is now " + balance + "Php.");
        }
    }

    public void withdrawFunds(final double fund) {

        if (customerName == null) {
            System.out.println("Customer name not found. Please enter customer name first.");
        } else {
            if (balance < fund) {
                System.out.println("Insufficient balance.");
            } else if (fund < 0) {
                System.out.println("Invalid amount.");
            } else {
                balance -= fund;
                System.out.println(customerName + " has withdrawn " + fund + "Php from his/her account. " +
                        "His/her account balance is now " + balance + "Php.");
            }
        }
    }
}

public class BankAccountMain {

    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount("123435", 5000.0, "Glenn Sabales",
//                "glenn.sabales@gmail.com", "09266495270");

        // Created object with default values by calling constructor with parameters by this().
        BankAccount bankAccount = new BankAccount();

        bankAccount.withdrawFunds(100);
        bankAccount.depositFunds(50);
        bankAccount.withdrawFunds(100);
        bankAccount.depositFunds(51);
        bankAccount.withdrawFunds(100);
    }

}
