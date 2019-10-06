package com.geo.system.restcontroller;

import com.geo.system.controller.ContactController;
import com.geo.system.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ContactRestController {
    @Autowired
    ContactController contactController;

    @PostMapping(path = "/insertContact")
    public Contact insert(@RequestBody @Valid Contact contact) {
        return contactController.insert(contact);
    }

    @GetMapping(path = "/getAllContact")
    public @ResponseBody
    Iterable<Contact> getAll() {
        return contactController.getAll();
    }

    @DeleteMapping(path = "/deleteContact/{id}")
    public void deleteById(@PathVariable Integer id) {
        contactController.deleteById(id);
    }

    @GetMapping(path = "updateContact/{id}")
    public Contact update(@PathVariable Integer id, @RequestBody @Valid Contact contact) {
        return contactController.update(id, contact);
    }
}
