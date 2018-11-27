package com.addressbook.appmanager;

import com.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(ChromeDriver wd) {
        super(wd);
    }


    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getTelephone());
        type(By.name("email"), contactData.getEmail());
    }
}
