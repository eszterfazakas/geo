package com.geo.system.dao;

import com.geo.system.entity.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ContactDAO extends CrudRepository<Contact, Integer> {

    ContactDAO contactDAO = null;

    default Contact updateContact(Integer id, Contact contact) {
        Optional<Contact> contactToUpdate = findById(id);
        if (contactToUpdate.isPresent()) {
            Contact contactWithIdFound = contactToUpdate.get();
            contactWithIdFound.setAddress(contact.getAddress());
            contactWithIdFound.setName(contact.getName());
            contactWithIdFound.setPhoneNumber(contact.getPhoneNumber());
            contactWithIdFound.setEmail(contact.getEmail());

            return save(contactWithIdFound);
        }
        return null;
    }
}
