package com.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
    private ChromeDriver wd;

    public NavigationHelper(ChromeDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupPage() {
      wd.findElement(By.linkText("Groups")).click();
    }

    public void returnToHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }

    public void gotoContactPage() {
        wd.findElement(By.linkText("Add new")).click();
    }
}
