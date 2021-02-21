package com.javaexplore.lists.mobile_phone;

import java.util.Objects;

public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true
        if (this == o) return true;

        // Check if o is an instance of Contacts or not. Null instance also returns false.
        if (!(o instanceof Contacts)) return false;

        // Typecast o to Contacts to compare data properties
        Contacts contacts = (Contacts) o;
        return getName().equals(contacts.getName()) &&
                getPhoneNumber().equals(contacts.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
