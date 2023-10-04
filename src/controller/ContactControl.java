/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Contact;
import repository.ContactManager;
import repository.IContactManager;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class ContactControl extends Menu {

    private ArrayList<Contact> contactList;
    IContactManager mn;
    static String[] mc = {"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};

    public ContactControl() {
        super("Contact Program", mc);
        mn = new ContactManager();
        contactList = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 ->
                mn.addContact(contactList);
            case 2 ->
                mn.showAll(contactList);
            case 3 ->
                mn.deleteContact(contactList);
            case 4 ->
                System.exit(0);
        }
    }

}
