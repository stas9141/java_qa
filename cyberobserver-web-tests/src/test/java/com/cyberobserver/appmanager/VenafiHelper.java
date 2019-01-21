package com.cyberobserver.appmanager;

import com.cyberobserver.model.GroupData;
import com.cyberobserver.model.IncludeParameterData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VenafiHelper extends HelperBase {

    public VenafiHelper(WebDriver wd, WebDriverWait wait, Actions act) {
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

    public void fillSetIncludeParametersWindow(IncludeParameterData includeParameterData) {
        wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='Include Installations'])[1]/following::input[1]")).click();
                //cssSelector("td.breakDesc > input.ng-pristine.ng-untouched.ng-valid")).click();
        wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='Include Installations'])[1]/following::input[1]")).clear();
        wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='Include Installations'])[1]/following::input[1]")).
                sendKeys("1");

        type(By.xpath("//tbody//tr[3]//td[2]//input[1]"),includeParameterData.getValidto());
        type(By.xpath("//tbody//tr[4]//td[2]//input[1]"),includeParameterData.getDnname());
        type(By.xpath("//tbody//tr[6]//td[2]//input[1]"),includeParameterData.getStatus());
        type(By.xpath("//tbody//tr[8]//td[2]//input[1]"),includeParameterData.getApprover());
        type(By.xpath("//tbody//tr[10]//td[2]//input[1]"),includeParameterData.getName());
        type(By.xpath("//tbody//tr[12]//td[2]//input[1]"),includeParameterData.getComname());
        type(By.xpath("//tbody//tr[14]//td[2]//input[1]"),includeParameterData.getParentdn());
        type(By.xpath("//tbody//tr[16]//td[2]//input[1]"),includeParameterData.getIssuer());
        type(By.xpath("//tbody//tr[18]//td[2]//input[1]"),includeParameterData.getValidstate());
        type(By.xpath("//tbody//tr[20]//td[2]//input[1]"),includeParameterData.getManualcsr());
        type(By.xpath("//tbody//tr[22]//td[2]//input[1]"),includeParameterData.getCountry());
        type(By.xpath("//tbody//tr[24]//td[2]//input[1]"),includeParameterData.getSignalg());
        type(By.xpath("//tbody//tr[26]//td[2]//input[1]"),includeParameterData.getOrganization());
        type(By.xpath("//tbody//tr[28]//td[2]//input[1]"),includeParameterData.getManagtype());
        type(By.xpath("//tbody//tr[30]//td[2]//input[1]"),includeParameterData.getKeysize());
        type(By.xpath("//tbody//tr[32]//td[2]//input[1]"),includeParameterData.getDescription());
        type(By.xpath("//tbody//tr[34]//td[2]//input[1]"),includeParameterData.getEllipticcurve());
        type(By.xpath("//tbody//tr[36]//td[2]//input[1]"),includeParameterData.getKeyalg());
        type(By.xpath("//tbody//tr[38]//td[2]//input[1]"),includeParameterData.getRisk());
        type(By.xpath("//tbody//tr[40]//td[2]//input[1]"),includeParameterData.getDevice());

        wd.findElement(By.xpath("//div[@class ='modal-content']//button[@type='submit'][contains(text(),'Save')]")).click();
    }
}

