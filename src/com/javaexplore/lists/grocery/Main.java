package com.javaexplore.lists.grocery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        printInstructions();
        getInput();
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void getInput() {
        boolean quit = false;
        int choice;

        while(!quit) {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0: printInstructions(); break;
                case 1: groceryList.printGroceryList(); break;
                case 2: addItem(); break;
                case 3: modifyItem(); break;
                case 4: removeItem(); break;
                case 5: searchItem(); break;
                case 6: quit = true; break;
                default: System.out.println("Input not found from list of options.");
            }
        }
    }

    private static void addItem() {
        System.out.print("\nEnter item you want to add: ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    private static void modifyItem() {
        String previousItem, newItem;
        System.out.print("\nEnter item you want to modify: ");
        previousItem = scanner.nextLine();
        System.out.print("Enter new item: ");
        newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(previousItem, newItem);
    }

    private static void removeItem() {
        System.out.print("getGroceryList\nEnter item you want to remove: ");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    private static void searchItem() {
        String searchItem;
        System.out.print("\nEnter item you want to find from your grocery list: ");
        searchItem = scanner.nextLine();
        if (groceryList.findGroceryItem(searchItem) != null) {
            System.out.println(searchItem + " was found from your grocery list.");
        } else {
            System.out.println(searchItem + " was not found from your grocery list.");
        }
    }

    public void processArrayList() {
        List<String> list = new ArrayList<String>();
        list.addAll(groceryList.getGroceryList());
        String[] arrayString = new String[groceryList.getGroceryList().size()];
        arrayString = groceryList.getGroceryList().toArray(arrayString);
    }
}
