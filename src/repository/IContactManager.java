/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author ASUS
 */
public interface IContactManager {
    void addContact(ArrayList<Contact> contactList);
    void deleteContact(ArrayList<Contact> contacList);
    void showAll(ArrayList<Contact> contactList);
}
