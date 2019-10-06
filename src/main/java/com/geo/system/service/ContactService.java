package com.geo.system.service;

import com.geo.system.dao.ContactDAO;
import com.geo.system.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactDAO contactDAO;

    public Contact insert(Contact contact) {
        return contactDAO.save(contact);
    }

    public Iterable<Contact> getAll() {
        return contactDAO.findAll();
    }

    public void deleteById(Integer id) {
        contactDAO.deleteById(id);
    }

    public Contact update(Integer id, Contact contact) {
        return contactDAO.updateContact(id, contact);
    }
}
