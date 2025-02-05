package com.example.contact.controller;

import com.example.contact.model.Contact;
import com.example.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    // 获取所有联系人信息
    @GetMapping
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    // 提交表单
    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }
}