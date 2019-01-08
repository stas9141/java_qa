package com.cyberobserver.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(ChromeDriver wd, WebDriverWait wait, Actions act) {
        super(wd, wait, act);

    }

    public void gotoSystemUsersPage() {
        act.moveToElement(wd.findElement(By.linkText("SYSTEM"))).click().build().perform();
    }

    public void gotoGroupsPage() {
        WebElement button = wait.until(visibilityOfElementLocated(By.xpath("//a[contains(text(),'GROUPS')]")));
        button.click();
        //act.moveToElement(wd.findElement(By.xpath("//a[contains(text(),'GROUPS')]"))).click().build().perform();
    }
}
