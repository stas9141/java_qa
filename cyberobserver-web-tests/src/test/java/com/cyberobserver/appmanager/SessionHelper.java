package com.cyberobserver.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SessionHelper extends HelperBase {

    private WebDriverWait wait;
    private Actions act;

    public SessionHelper(ChromeDriver wd, WebDriverWait wait, Actions act) {
        super(wd, wait, act);

    }

    public void login(String username, String password) {
        type(By.name("j_username"), username);
        type(By.name("j_password"), password);
        click(By.xpath("//button[@type='submit']"));
    }

}
