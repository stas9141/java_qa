package com.cyberobserver.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd, WebDriverWait wait, Actions act) {
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

    public void gotoToolsPage() {
        if(isElementPresent(By.xpath("//h4[@class='ng-binding'][text() = 'tools score']"))) {
            return;
        }
        act.moveToElement(wd.findElement(By.linkText("TOOLS"))).doubleClick().build().perform();

    }

    public void gotoSMG() {
        wait.until(ExpectedConditions.elementToBeClickable(By.
                //visibilityOfElementLocated(By.
                xpath("(//img[contains(@src,'https://10.0.0.203/observer/media/tools/symantec.png')])[4]"))).click();

    }

    public void gotoVenafi() {

        wait.until(ExpectedConditions.elementToBeClickable(By.
                xpath("//img[@src='https://10.0.0.152/observer/media/tools/venafi.png']"))).click();
    }

    public void gotoTabAll() {
        wait.until(visibilityOfElementLocated(By.
                xpath("//a[contains(text(),'All')]"))).click();

    }

    public void gotoPreviousPage() {
        wd.navigate().back();
    }


}

