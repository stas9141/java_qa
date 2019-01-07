package com.cyberobserver.appmanager;

import com.cyberobserver.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroupHelper {
    private ChromeDriver wd;
    private WebDriverWait wait;
    private Actions act;

    public GroupHelper(ChromeDriver wd, WebDriverWait wait, Actions act) {
        this.wd = wd;
        this.act = act;
        this.wait = wait;
    }

    public void submitGroupCreation() {
        wd.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        wd.findElement(By.id("name")).click();
        wd.findElement(By.id("name")).clear();
        wd.findElement(By.id("name")).sendKeys(groupData.getName());
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
}
