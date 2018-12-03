package com.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
      click(By.linkText("GROUPS"));
    }

    public void gotoHomePage() {
        click(By.linkText("HOME"));
    }

    public void gotoAddNewContactPage() {
        click(By.linkText("ADD_NEW"));
    }
}
