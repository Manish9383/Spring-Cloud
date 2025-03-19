package com.contact.entity;

public class Contact {

    private Long cID;
    private String name;
    private String email;
    private Long userID;

    public Long getcID() {
        return cID;
    }

    public void setcID(Long cID) {
        this.cID = cID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Contact() {
    }
    public Contact(Long cID, String name, String email, Long userID) {
        this.cID = cID;
        this.name = name;
        this.email = email;
        this.userID = userID;
    }
}
