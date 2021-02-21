package com.javaexplore.lists.grocery;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private List<String> groceryList = new ArrayList<>();

    public void addGroceryList(String item) {
        groceryList.add(item);
        System.out.println(item + " added to your grocery list.");
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        groceryList.forEach(item -> {
            int index = groceryList.indexOf(item);
            System.out.println( (index + 1) + ". " + groceryList.get(index));
        });
    }

    public void modifyGroceryItem(String previousItem, String newItem) {
        int index = groceryList.indexOf(previousItem);
        if (index >= 0) {
            groceryList.set(index, newItem);
            System.out.println(previousItem + " was replaced with " + newItem);
        } else {
            System.out.println(previousItem + " not found from your grocery list.");
        }

    }

    public void removeGroceryItem(String item) {
        groceryList.remove(item);
        System.out.println(item + " was removed from the grocery list.");
    }

    public String findGroceryItem(String item) {
        int index = groceryList.indexOf(item);

        return (index >= 0) ? groceryList.get(index) : null;
    }

    public List<String> getGroceryList() {
        return groceryList;
    }
}
