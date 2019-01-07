package com.cyberobserver.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    ChromeDriver wd;
    WebDriverWait wait;
    Actions act;

    private SessionHelper sessionHelper;
    private  NavigationHelper navigationHelper;
    private  GroupHelper groupHelper;


    public void init() {
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, 10);
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        act = new Actions(wd);
        wd.get("https://10.0.0.152:8443/observer/cyber/portal/#/login//");
        groupHelper = new GroupHelper(wd,wait,act);
        navigationHelper = new NavigationHelper(wd,wait,act);
        sessionHelper = new SessionHelper(wd,wait,act);
        sessionHelper.login("stas", "Panass5942$!");
    }


    public void stop() {
        logout();
        wd.quit();
    }

    public void logout() {
        act.moveToElement(wd.findElement(By.cssSelector("div.admin_holder_toggle.ng-binding"))).click().build().perform();
        wd.findElement(By.cssSelector("a.ng-binding")).click();
    }

    private boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
