package com.cyberobserver.appmanager;

import com.cyberobserver.model.ExclParamToVenafi1CscData;
import com.cyberobserver.model.InclParamToVenafi1CscData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

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

    public void fillSetIncludeParametersWindow(InclParamToVenafi1CscData inclParamToVenafi1CscData) {
        type(By.xpath("//tbody//tr[1]//td[2]//input[1]"), inclParamToVenafi1CscData.getInstallation());
        type(By.xpath("//tbody//tr[3]//td[2]//input[1]"), inclParamToVenafi1CscData.getValidto());
        type(By.xpath("//tbody//tr[4]//td[2]//input[1]"), inclParamToVenafi1CscData.getDnname());
        type(By.xpath("//tbody//tr[6]//td[2]//input[1]"), inclParamToVenafi1CscData.getStatus());
        type(By.xpath("//tbody//tr[8]//td[2]//input[1]"), inclParamToVenafi1CscData.getApprover());
        type(By.xpath("//tbody//tr[10]//td[2]//input[1]"), inclParamToVenafi1CscData.getName());
        type(By.xpath("//tbody//tr[12]//td[2]//input[1]"), inclParamToVenafi1CscData.getComname());
        type(By.xpath("//tbody//tr[14]//td[2]//input[1]"), inclParamToVenafi1CscData.getParentdn());
        type(By.xpath("//tbody//tr[16]//td[2]//input[1]"), inclParamToVenafi1CscData.getIssuer());
        type(By.xpath("//tbody//tr[18]//td[2]//input[1]"), inclParamToVenafi1CscData.getValidstate());
        type(By.xpath("//tbody//tr[20]//td[2]//input[1]"), inclParamToVenafi1CscData.getManualcsr());
        type(By.xpath("//tbody//tr[22]//td[2]//input[1]"), inclParamToVenafi1CscData.getCountry());
        type(By.xpath("//tbody//tr[24]//td[2]//input[1]"), inclParamToVenafi1CscData.getSignalg());
        type(By.xpath("//tbody//tr[26]//td[2]//input[1]"), inclParamToVenafi1CscData.getOrganization());
        type(By.xpath("//tbody//tr[28]//td[2]//input[1]"), inclParamToVenafi1CscData.getManagtype());
        type(By.xpath("//tbody//tr[30]//td[2]//input[1]"), inclParamToVenafi1CscData.getKeysize());
        type(By.xpath("//tbody//tr[32]//td[2]//input[1]"), inclParamToVenafi1CscData.getDescription());
        type(By.xpath("//tbody//tr[34]//td[2]//input[1]"), inclParamToVenafi1CscData.getEllipticcurve());
        type(By.xpath("//tbody//tr[36]//td[2]//input[1]"), inclParamToVenafi1CscData.getKeyalg());
        type(By.xpath("//tbody//tr[38]//td[2]//input[1]"), inclParamToVenafi1CscData.getRisk());
        type(By.xpath("//tbody//tr[40]//td[2]//input[1]"), inclParamToVenafi1CscData.getDevice());

        click(By.xpath("//div[@class ='modal-content']//button[@type='submit'][contains(text(),'Save')]"));

    }

    public void fillSetExcludeParametersWindow(ExclParamToVenafi1CscData exclParamToVenafi1CscData) {
        type(By.xpath("//tbody//tr[2]//td[2]//input[1]"), exclParamToVenafi1CscData.getInstallation());
        type(By.xpath("//tbody//tr[3]//td[2]//input[1]"), exclParamToVenafi1CscData.getValidto());
        type(By.xpath("//tbody//tr[5]//td[2]//input[1]"), exclParamToVenafi1CscData.getDnname());
        type(By.xpath("//tbody//tr[7]//td[2]//input[1]"), exclParamToVenafi1CscData.getStatus());
        type(By.xpath("//tbody//tr[9]//td[2]//input[1]"), exclParamToVenafi1CscData.getApprover());
        type(By.xpath("//tbody//tr[11]//td[2]//input[1]"), exclParamToVenafi1CscData.getName());
        type(By.xpath("//tbody//tr[13]//td[2]//input[1]"), exclParamToVenafi1CscData.getComname());
        type(By.xpath("//tbody//tr[15]//td[2]//input[1]"), exclParamToVenafi1CscData.getParentdn());
        type(By.xpath("//tbody//tr[17]//td[2]//input[1]"), exclParamToVenafi1CscData.getIssuer());
        type(By.xpath("//tbody//tr[19]//td[2]//input[1]"), exclParamToVenafi1CscData.getValidstate());
        type(By.xpath("//tbody//tr[21]//td[2]//input[1]"), exclParamToVenafi1CscData.getManualcsr());
        type(By.xpath("//tbody//tr[23]//td[2]//input[1]"), exclParamToVenafi1CscData.getCountry());
        type(By.xpath("//tbody//tr[25]//td[2]//input[1]"), exclParamToVenafi1CscData.getSignalg());
        type(By.xpath("//tbody//tr[27]//td[2]//input[1]"), exclParamToVenafi1CscData.getOrganization());
        type(By.xpath("//tbody//tr[29]//td[2]//input[1]"), exclParamToVenafi1CscData.getManagtype());
        type(By.xpath("//tbody//tr[31]//td[2]//input[1]"), exclParamToVenafi1CscData.getKeysize());
        type(By.xpath("//tbody//tr[33]//td[2]//input[1]"), exclParamToVenafi1CscData.getDescription());
        type(By.xpath("//tbody//tr[35]//td[2]//input[1]"), exclParamToVenafi1CscData.getEllipticcurve());
        type(By.xpath("//tbody//tr[37]//td[2]//input[1]"), exclParamToVenafi1CscData.getKeyalg());
        type(By.xpath("//tbody//tr[39]//td[2]//input[1]"), exclParamToVenafi1CscData.getRisk());
        type(By.xpath("//tbody//tr[41]//td[2]//input[1]"), exclParamToVenafi1CscData.getDevice());

        click(By.xpath("//div[@class ='modal-content']//button[@type='submit'][contains(text(),'Save')]"));
    }

    public void gotoViewOfCsc1(){
        if(isElementPresent(By.xpath("//h4[@class='ng-binding'][text() = 'tools score']"))) {
            return;
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.
                xpath("//*[text() = 'Number of certificates in status managed with risk all']//..//a[@class ='domains_alert_url ng-scope']"))).click();
        //wd.findElement(By.xpath("//*[text() = 'Number of certificates in status managed with risk all']//..//a[@class ='domains_alert_url ng-scope']")).click();

    }
}

