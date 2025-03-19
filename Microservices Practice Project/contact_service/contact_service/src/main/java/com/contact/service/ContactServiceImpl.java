package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "Manish", "Manish@gmail.com", 1331L ),
            new Contact(2L, "Raj", "Raj@gmail.com", 1332L ),
            new Contact(3L, "Arpita", "Arpita@gmail.com", 1333L )
    );


    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserID().equals(userId)).collect(Collectors.toList());
    }
}
