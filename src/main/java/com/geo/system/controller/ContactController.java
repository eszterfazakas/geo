package com.geo.system.controller;

import com.geo.system.entity.Contact;
import com.geo.system.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    public Contact insert(Contact contact) {
        return contactService.insert(contact);
    }

    public Iterable<Contact> getAll() {
        return contactService.getAll();
    }

    public void deleteById(Integer id) {
        contactService.deleteById(id);
    }

    public Contact update(Integer id, Contact contact) {
        return contactService.update(id, contact);
    }

}
