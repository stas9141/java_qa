package com.cyberobserver.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SessionHelper {

   private ChromeDriver wd;
    private WebDriverWait wait;
    private Actions act;

    public SessionHelper(ChromeDriver wd, WebDriverWait wait, Actions act) {
        this.wd = wd;
        this.act = act;
        this.wait = wait;
    }

    public void login(String username, String password) {
        wd.findElement(By.name("j_username")).click();
        wd.findElement(By.name("j_username")).clear();
        wd.findElement(By.name("j_username")).sendKeys(username);
        wd.findElement(By.name("j_password")).click();
        wd.findElement(By.name("j_password")).clear();
        wd.findElement(By.name("j_password")).sendKeys(password);
        wd.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
