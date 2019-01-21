package com.cyberobserver.appmanager;

import com.cyberobserver.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroupHelper extends HelperBase {


    public GroupHelper(WebDriver wd, WebDriverWait wait, Actions act) {
        super(wd, wait, act);

    }

    public void submitGroupCreation() {
        click(By.xpath("(//button[@type='submit'])[2]"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.id("name"), groupData.getName());
        wd.findElement(By.id("description")).clear();
        wd.findElement(By.id("description")).sendKeys(groupData.getDescription());
    }

    public void deleteGroups() {
        act.moveToElement(wd.findElement(By.xpath("(.//*[@title ='Delete'])"))).click().build().perform();
    }

    public void submitGroupDeletion() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Delete')]"))).click();
        try {
            Thread.sleep(6000);//wd.findElement(By.xpath("//button[contains(text(),'x')]")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void initGroupModification() {
        act.moveToElement(wd.findElement(By.xpath("(.//*[@title ='Edit'])"))).click().build().perform();
    }

    public void initCopyGroup() {
        act.moveToElement(wd.findElement(By.
                xpath("//div[@class ='form-group']//..//button[contains(text(),'Copy')]"))).click().build().perform();
    }

    public void fillCopyGroupForm() {

    }
}
