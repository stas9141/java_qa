package com.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import org.openqa.selenium.*;

public class ContactCreationTest {
    private WebDriver wd;


    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@value='LOGIN']")).click();
    }

    @Test
    public void testContactCreation() throws Exception {

        gotoContactPage();
        fillContactForm("name", "lastname", "israel, Haifa", "050123456", "dbrmlsky@gmail.com");
        wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NOTES:'])[1]/following::input[1]")).click();
        wd.findElement(By.linkText("home page")).click();
        wd.findElement(By.linkText("LOGOUT")).click();
    }

    private void fillContactForm(String firstname, String lastname, String address, String telephone, String email) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(firstname);
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(lastname);
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(address);
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(telephone);
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(email);
    }

    private void gotoContactPage() {
        wd.findElement(By.linkText("ADD_NEW")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wd.quit();
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
