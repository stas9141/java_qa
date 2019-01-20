package com.cyberobserver.appmanager;

import com.cyberobserver.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VenafiHelper extends HelperBase {

    public VenafiHelper(ChromeDriver wd, WebDriverWait wait, Actions act) {
        super(wd, wait, act);
    }

    public void selectVenafiControl() {
        act.moveToElement(wd.findElement(By.
                xpath("//tr/td[text()='Number of certificates in status managed with risk all']"))).click().build().perform();
    }

    public void openSetParametrsWindow() {
        act.moveToElement(wd.findElement(By.
                cssSelector("i.pointer.text-white.fa.fa-pencil-square-o.mr5.ng-scope"))).click().build().perform();
    }

    public void fillSetParametersWindow() {
        wd.findElement(By.xpath("(//input[@type ='text']/..//tr/td[text() = 'Include Installations'])")).click();
        wd.findElement(By.xpath("(//input[@type ='text']/..//tr/td[text() = 'Include Installations'])")).clear();
        wd.findElement(By.
                xpath("(//input[@type ='text']/..//tr/td[text() = 'Include Installations'])")).sendKeys("11111");


        wd.findElement(By.xpath("(//button[text()='Save'])")).click();
    }
}

