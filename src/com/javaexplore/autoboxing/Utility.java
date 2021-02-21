package com.javaexplore.autoboxing;

import java.util.List;

public class Utility {


    public static Searchable findItemFromList(List<Searchable> itemList, String itemName) {
        return itemList
                .stream()
                .filter(item -> itemName.equals(item.getName()))
                .findAny()
                .orElse(null);
    }

}
