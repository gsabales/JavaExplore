package com.javaexplore.lists.mobile_phone;

import java.util.Scanner;

public class Main {
    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printActions();
        getInput();
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress\n");
        System.out.println("\t 0 - To shutdown");
        System.out.println("\t 1 - Print contact list");
        System.out.println("\t 2 - Add new contact");
        System.out.println("\t 3 - Update existing contact");
        System.out.println("\t 4 - Delete contact");
        System.out.println("\t 5 - Search contact");
        System.out.println("\t 6 - To show available actions");
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void getInput() {
        boolean quit = false;
        int choice;

        while(!quit) {
            System.out.print("\nChoose your action: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true; break;
                case 1: printContactList(); break;
                case 2: addContacts(); break;
                case 3: updateContacts(); break;
                case 4: deleteContact(); break;
                case 5: searchContact(); break;
                case 6: printActions(); break;
                default:
                    System.out.println("Input is not in the options list.");
            }
        }
    }

    private static void printContactList() {
        System.out.println("You have " + mobilePhone.getContactsList().size() + " contacts in you contacts list.");
        mobilePhone.printContactList();
    }

    private static void addContacts() {
        String name, mobileNumber;
        boolean quit = false;

        while (!quit) {
            System.out.print("Enter contact name: ");
            name = scanner.nextLine();
            System.out.print("Enter contact no: ");
            mobileNumber = scanner.nextLine();

            mobilePhone.addContact(name, mobileNumber);
            mobilePhone.printContactList();

            System.out.print("\nWould you like to add another contact? (Y/N): ");
            quit = scanner.nextLine().trim().equalsIgnoreCase("N");
        }


    }

    private static void updateContacts() {
        String currentContactName, name, mobileNumber;

        System.out.print("Enter existing contact name: ");
        currentContactName = scanner.nextLine();

        if (mobilePhone.getContactByName(currentContactName) == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        name = scanner.nextLine();
        System.out.print("Enter new contact no: ");
        mobileNumber = scanner.nextLine();

        mobilePhone.updateContacts(currentContactName, name, mobileNumber);
        mobilePhone.printContactList();
    }

    public static void deleteContact() {
        System.out.print("Enter contact name to be deleted: ");
        mobilePhone.deleteContact(scanner.nextLine());
        mobilePhone.printContactList();
    }

    public static void searchContact() {
        System.out.print("Search contact name: ");
        mobilePhone.searchContact(scanner.nextLine());
    }
}
