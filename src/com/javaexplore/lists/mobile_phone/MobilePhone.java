package com.javaexplore.lists.mobile_phone;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private List<Contacts> contactsList = new ArrayList<>();

    public List<Contacts> getContactsList() {
        Contacts contacts = new Contacts("Glenn","12345");
        Contacts contacts2 = new Contacts("Glenn","12345");
        System.out.println(contacts2.equals(contacts));

        return contactsList;
    }

    public void printContactList() {
        System.out.format("\n%-30s%-30s\n", "NAME", "MOBILE NO.");

        contactsList.forEach(contacts -> {
            int itemNumber = contactsList.indexOf(contacts) + 1;
            System.out.format("" +
                    "%-30s%-30s\n",
                    itemNumber + ". " + contacts.getName(),
                    contacts.getPhoneNumber());
        });
    }

    private void addContact(Contacts newContact) {
        contactsList.add(newContact);
        System.out.println(newContact.getName() + " with mobile number " + newContact.getPhoneNumber() +
                " is added to your contact list.");
    }

    public void addContact(String name, String mobileNumber) {

        if (getContactByName(name) == null) {
            Contacts contacts = new Contacts(name, mobileNumber);
            addContact(contacts);
        } else {
            System.out.println(name + " already exists in your contact list.");
        }
    }


    public void updateContacts(String currentContactName, String name, String mobileNumber) {
        Contacts currentContact = getContactByName(currentContactName);
        Contacts newContact = new Contacts(name, mobileNumber);
        int index = contactsList.indexOf(currentContact);

        // Null check
        if (currentContact == null && index < 0) {
            System.out.println(currentContactName + " is not existing in your contacts list.");
            return;
        }

        // Duplicate check
        Contacts duplicateContact = contactsList.stream().filter(newContact::equals)
                .findAny().orElse(null);

        if (duplicateContact != null) {
            System.out.println("Error updating record. " + newContact.getName() + " already exists in your contacts list.");
            return;
        }

        contactsList.set(index, newContact);
        System.out.println(currentContactName + " from your contacts list is updated to " + newContact.getName() +
                " with mobile no. " + newContact.getPhoneNumber());
    }

    public void deleteContact(String name) {
        Contacts currentContact = getContactByName(name);

        if (currentContact != null) {
            contactsList.remove(currentContact);
            System.out.println(name + " is deleted from your contacts list.");
        } else {
            System.out.println(name + " is not existing in your contacts list.");
        }
    }

    public void searchContact(String name) {
        Contacts searchedContact = getContactByName(name);

        if (searchedContact != null) {
            System.out.println(name + " is existing in your contacts list.");
            System.out.printf("Contact: %-30s%-30s", searchedContact.getName(), searchedContact.getPhoneNumber());
        } else {
            System.out.println(name + "is not existing in your contacts list.");
        }
    }

    public Contacts getContactByName(String contactName) {
        return contactsList.stream().filter(contacts -> contactName.equals(contacts.getName()))
                .findAny().orElse(null);
    }

}
