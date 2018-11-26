package com.addressbook.appmanager;

import com.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactHelper {

    private ChromeDriver wd;

    public ContactHelper(ChromeDriver wd) {
        this.wd = wd;
    }


    public void submitContactCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillContactForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(contactData.getTelephone());
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }
}
