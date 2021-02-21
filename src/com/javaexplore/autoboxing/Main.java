package com.javaexplore.autoboxing;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of Paradis");
        bank.addNewBranch("Shiganshina");
        bank.addNewCustomer("Shiganshina", "Eren Jaeger", 144.00);
        bank.addNewCustomer("Shiganshina", "Mikasa Ackerman", 244.00);
        bank.addNewCustomer("Shiganshina", "Armin Arlert", 344.00);

        bank.addNewBranch("Trost");
        bank.addNewCustomer("Trost", "Sasha Blouse", 544.45);

        bank.addCustomerTransaction("Shiganshina", "Eren Jaeger", 25.89);
        bank.addCustomerTransaction("Shiganshina", "Eren Jaeger", 14.56);
        bank.addCustomerTransaction("Shiganshina", "Eren Jaeger", 2.8);

        bank.listCustomers("Shiganshina", true);
        bank.listCustomers("Trost", true);

        bank.addNewBranch("Stohess");
        if (!bank.addNewCustomer("Stohess", "Annie Leonhart", 23.45)) {
            System.out.println("Error, branch does not exist");
        }

    }
}
