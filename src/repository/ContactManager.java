/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.ContactDao;
import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author ASUS
 */
public class ContactManager implements IContactManager{

    @Override
    public void addContact(ArrayList<Contact> contactList) {
        ContactDao.Instance().createContact(contactList);
    }
    @Override
    public void deleteContact(ArrayList<Contact> contacList) {
        ContactDao.Instance().deleteContact(contacList);
    }
    @Override
    public void showAll(ArrayList<Contact> contactList) {
        ContactDao.Instance().showAll(contactList);
    }
    
}
