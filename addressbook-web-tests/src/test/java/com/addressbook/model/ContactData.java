package com.addressbook.model;

import java.util.Objects;

public class ContactData {
    private int id;
    private  String firstname;
    private final String lastname;
    private String group;
    private final String address;
    private final String telephone;
    private final String email;

    public ContactData(String firstname, String lastname, String group, String address, String telephone, String email) {
        this.id = 0;
        this.firstname = firstname;
        this.lastname = lastname;
        this.group = group;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public ContactData(int id, String firstname, String lastname, String group, String address, String telephone, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.group = group;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }
}
