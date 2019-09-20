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

    public void gotoReportsPage() {
        act.moveToElement(wd.findElement(By.linkText("REPORTS"))).click().build().perform();
    }

    public void gotoToolsReport() {
        WebElement button = wait.until(visibilityOfElementLocated(By.xpath("//h3[@class='report_name ng-binding']" +
                "[text() = 'Current tools status']")));
        button.click();
    }

    public void gotoToolsConfigurationPage() {
        act.moveToElement(wd.findElement(By.linkText("SYSTEM"))).click().build().perform();
        //
    }


    public void gotoGroupsPage() {
        WebElement button = wait.until(visibilityOfElementLocated(By.xpath("//a[contains(text(),'GROUPS')]")));
        button.click();
        //act.moveToElement(wd.findElement(By.xpath("//a[contains(text(),'GROUPS')]"))).click().build().perform();
    }

    public void gotoToolsPage() {
        if (isElementPresent(By.xpath("//h4[@class='ng-binding'][text() = 'tools score']"))) {
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


    public void gotoAD() {
        act.moveToElement(wd.findElement(By.
                //xpath("//span[contains(.,'ad')]"))).click().build().perform();
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='ad'])[1]/following::i[3]"))).click().build().perform();
    }

    public void gotoPluginsTab() {
        act.moveToElement(wd.findElement(By.
                xpath("//a[contains(text(),'PLUGINS')]"))).click().build().perform();
    }

    public void gotoAirWatch() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'AirWatch')]"))).click().build().perform();
    }

    public void gotoAs400() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'AS400')]"))).click().build().perform();
    }

    public void gotoAws() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'AWS')]"))).click().build().perform();
    }

    public void gotoAzure() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'azure')]"))).click().build().perform();
    }

    public void gotoBigfix() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'BigFix')]"))).click().build().perform();
    }

    public void gotoCbResponse() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'Cb Response')]"))).click().build().perform();
    }

    public void gotoCheckpointR77() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'Checkpoint Firewall R77')]"))).click().build().perform();
    }

    public void gotoCheckpointR80() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'Checkpoint Firewall R80')]"))).click().build().perform();
    }

    public void gotoCheckpointIpsR77() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'Checkpoint IPS R77')]"))).click().build().perform();
    }

    public void gotoCheckpointIpsR80() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'Checkpoint IPS R80')]"))).click().build().perform();
    }

    public void gotoCiscoAnyConnect() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'Cisco AnyConnect')]"))).click().build().perform();

    }

    public void gotoCiscoAsa() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'Cisco ASA')]"))).click().build().perform();
    }

    public void gotoCiscoCloud() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'Cisco Cloud Email')]"))).click().build().perform();
    }

    public void gotoF5apm() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'F5 APM')]"))).click().build().perform();
    }

    public void gotoF5asm() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'F5 ASM')]"))).click().build().perform();
    }
    public void gotoF5ltm() {
        act.moveToElement(wd.findElement(By.
                xpath("//span[contains(.,'F5 LTM')]"))).click().build().perform();
    }
}

