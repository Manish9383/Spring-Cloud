package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long userID;
    private String name;
    private String phone;

    List<Contact> contacts = new ArrayList<>();

    public User(Long userID, String name, String phone) {
        this.userID = userID;
        this.name = name;
        this.phone = phone;
    }

    public User(Long userID, String name, String phone, List<Contact> contacts) {
        this.userID = userID;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public User() {}

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
