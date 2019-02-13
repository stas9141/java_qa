package com.cyberobserver.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private final Properties properties;
    WebDriver wd;
    WebDriverWait wait;
    Actions act;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private String browser;//
    private VenafiHelper venafiHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
        properties = new Properties();
    }

    public void init() throws IOException {
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));

        if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else wd = new InternetExplorerDriver();

        wait = new WebDriverWait(wd, 10);
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        act = new Actions(wd);
        wd.get(properties.getProperty("web.baseUrl"));

        groupHelper = new GroupHelper(wd, wait, act);
        navigationHelper = new NavigationHelper(wd, wait, act);
        sessionHelper = new SessionHelper(wd, wait, act);
        sessionHelper.login(properties.getProperty("web.adminLogin"),properties.getProperty("web.adminPassword"));
        venafiHelper = new VenafiHelper(wd, wait, act);
    }

    public void stop() {
       // logout();
        wd.quit();
    }

    public void logout() {
        act.moveToElement(wd.
                findElement(By.cssSelector("div.admin_holder_toggle.ng-binding"))).click().build().perform();
        wait.until(ExpectedConditions.
                elementToBeClickable(By.
                        xpath("//div[@class = 'admin_holder clearfix']//..//..//..//a[contains(text(),'Logout')]"))).click();
        }


    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public VenafiHelper getVenafiHelper() {
        return venafiHelper;
    }
}
