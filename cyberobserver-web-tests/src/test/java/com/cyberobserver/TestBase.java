package com.cyberobserver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class TestBase {
    private WebDriver wd;
    private WebDriverWait wait;
    private Actions act;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, 10);
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        act = new Actions(wd);
        wd.get("https://10.0.0.152:8443/observer/cyber/portal/#/login//");
        login("stas", "Panass5942$!");
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

    public void gotoSystemUsersPage() {
        act.moveToElement(wd.findElement(By.linkText("SYSTEM"))).click().build().perform();
    }

    public void gotoGroupsPage() {
        WebElement button = wait.until(visibilityOfElementLocated(By.xpath("//a[contains(text(),'GROUPS')]")));
        button.click();
        //act.moveToElement(wd.findElement(By.xpath("//a[contains(text(),'GROUPS')]"))).click().build().perform();
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

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
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
}
