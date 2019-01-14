package com.cyberobserver.appmanager;

import com.cyberobserver.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmgHelper extends HelperBase {

    public SmgHelper(ChromeDriver wd, WebDriverWait wait, Actions act) {
        super(wd, wait, act);
    }

    public void selectSmgControl() {
       act.moveToElement(wd.findElement(By.
               xpath("//table[@id='DataTables_Table_1']/tbody/tr[3]/td[3]"))).click().build().perform();
    }

    public void openSetParametrsWindow() {
        act.moveToElement(wd.findElement(By.
                xpath("//table[@id='DataTables_Table_1']/tbody/tr[3]/td[10]/span/i[6]"))).click().build().perform();
    }

    public void fillSetParameterWindow() {
        wd.findElement(By.xpath("//table[@id='DataTables_Table_4']/tbody/tr[7]/td[10]/span/i[6]")).click();
        wd.findElement(By.xpath("//input[@value='all']")).click();
       //wd.findElement(By.xpath("//input[@value='10.0.0.13, 10.0.0.47']")).clear();
        wd.findElement(By.xpath("//input[@value='10.0.0.13, 10.0.0.47']")).sendKeys("10.0.0.13, 10.0.0.47");
        wd.findElement(By.xpath("//input[@value='all']")).click();
        //wd.findElement(By.xpath("//input[@value='fgverfgreg.com']")).clear();
        wd.findElement(By.xpath("//input[@value='fgverfgreg.com']")).sendKeys("fgverfgreg.com");
        wd.findElement(By.xpath("//input[@value='30']")).click();
        //wd.findElement(By.xpath("//input[@value='250']")).clear();
        wd.findElement(By.xpath("//input[@value='250']")).sendKeys("250");
        wd.findElement(By.xpath("//input[@value='all']")).click();
        //wd.findElement(By.xpath("//input[@value='antispam']")).clear();
        wd.findElement(By.xpath("//input[@value='antispam']")).sendKeys("antispam");
        wd.findElement(By.xpath("(//button[@type='submit'])[11]")).click();
    }
}
