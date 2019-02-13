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
                xpath("//td[@title='Number of certificates in status managed with risk all']"))).click().build().perform();
    }

    public void openSetParametersWindow() {
        if (isElementPresent(By.
                xpath("//tr[@class='ng-scope even row_selected']//i[@title='Set parameters']"))) {
            click(By.xpath("//tr[@class='ng-scope even row_selected']//i[@title='Set parameters']"));
        } else {
            act.moveToElement(wd.findElement(By.
                    xpath("//tr[@class='ng-scope odd row_selected']//i[@title='Set parameters']"))).click().build().perform();
        }
    }

    public void fillSetIncludeParametersWindow(InclParamToVenafi1CscData inclParamToVenafi1CscData) {
        type(By.xpath("//td[text() = 'Include Installations']//..//input[@type='text']"), inclParamToVenafi1CscData.getInstallation());
        type(By.xpath("//td[text() = 'Valid to']//..//input[@type='text']"), inclParamToVenafi1CscData.getValidto());
        type(By.xpath("//td[text() = 'Include distinguished name']//..//input[@type='text']"), inclParamToVenafi1CscData.getDnname());
        //type(By.xpath("//td[text() = 'Include status']//..//input[@type='text']"), inclParamToVenafi1CscData.getStatus());
        type(By.xpath("//td[text() = 'Include approver']//..//input[@type='text']"), inclParamToVenafi1CscData.getApprover());
        type(By.xpath("//td[text() = 'Include name']//..//input[@type='text']"), inclParamToVenafi1CscData.getName());
        type(By.xpath("//td[text() = 'Include common name']//..//input[@type='text']"), inclParamToVenafi1CscData.getComname());
        type(By.xpath("//td[text() = 'Include parent dn']//..//input[@type='text']"), inclParamToVenafi1CscData.getParentdn());
        type(By.xpath("//td[text() = 'Include issuer']//..//input[@type='text']"), inclParamToVenafi1CscData.getIssuer());
        type(By.xpath("//td[text() = 'Include validation state']//..//input[@type='text']"), inclParamToVenafi1CscData.getValidstate());
        type(By.xpath("//td[text() = 'Include manual CSR']//..//input[@type='text']"), inclParamToVenafi1CscData.getManualcsr());
        type(By.xpath("//td[text() = 'Include country']//..//input[@type='text']"), inclParamToVenafi1CscData.getCountry());
        type(By.xpath("//td[text() = 'Include signature algorithm']//..//input[@type='text']"), inclParamToVenafi1CscData.getSignalg());
        type(By.xpath("//td[text() = 'Include organization']//..//input[@type='text']"), inclParamToVenafi1CscData.getOrganization());
        type(By.xpath("//td[text() = 'Include management type']//..//input[@type='text']"), inclParamToVenafi1CscData.getManagtype());
        type(By.xpath("//td[text() = 'Include key size']//..//input[@type='text']"), inclParamToVenafi1CscData.getKeysize());
        type(By.xpath("//td[text() = 'Include description']//..//input[@type='text']"), inclParamToVenafi1CscData.getDescription());
        type(By.xpath("//td[text() = 'Include elliptic curve']//..//input[@type='text']"), inclParamToVenafi1CscData.getEllipticcurve());
        type(By.xpath("//td[text() = 'Include key algorithm']//..//input[@type='text']"), inclParamToVenafi1CscData.getKeyalg());
        //type(By.xpath("//td[text() = 'Include Risk']//..//input[@type='text']"), inclParamToVenafi1CscData.getRisk());
        type(By.xpath("//td[text() = 'Include device']//..//input[@type='text']"), inclParamToVenafi1CscData.getDevice());

        click(By.xpath("//div[@class ='modal-content']//button[@type='submit'][contains(text(),'Save')]"));

    }

    public void fillSetExcludeParametersWindow(ExclParamToVenafi1CscData exclParamToVenafi1CscData) {
        type(By.xpath("//td[text() = 'Exclude installations']//..//input[@type='text']"), exclParamToVenafi1CscData.getInstallation());
        type(By.xpath("//td[text() = 'Valid to']//..//input[@type='text']"), exclParamToVenafi1CscData.getValidto());
        type(By.xpath("//td[text() = 'Exclude distinguished name']//..//input[@type='text']"), exclParamToVenafi1CscData.getDnname());
        type(By.xpath("//td[text() = 'Exclude status']//..//input[@type='text']"), exclParamToVenafi1CscData.getStatus());
        type(By.xpath("//td[text() = 'Exclude approver']//..//input[@type='text']"), exclParamToVenafi1CscData.getApprover());
        type(By.xpath("//td[text() = 'Exclude name']//..//input[@type='text']"), exclParamToVenafi1CscData.getName());
        type(By.xpath("//td[text() = 'Exclude common name']//..//input[@type='text']"), exclParamToVenafi1CscData.getComname());
        type(By.xpath("//td[text() = 'Exclude parent dn']//..//input[@type='text']"), exclParamToVenafi1CscData.getParentdn());
        type(By.xpath("//td[text() = 'Exclude issuer']//..//input[@type='text']"), exclParamToVenafi1CscData.getIssuer());
        type(By.xpath("//td[text() = 'Exclude validation state']//..//input[@type='text']"), exclParamToVenafi1CscData.getValidstate());
        type(By.xpath("//td[text() = 'Exclude manual CSR']//..//input[@type='text']"), exclParamToVenafi1CscData.getManualcsr());
        type(By.xpath("//td[text() = 'Exclude country']//..//input[@type='text']"), exclParamToVenafi1CscData.getCountry());
        type(By.xpath("//td[text() = 'Exclude signature algorithm']//..//input[@type='text']"), exclParamToVenafi1CscData.getSignalg());
        type(By.xpath("//td[text() = 'Exclude organization']//..//input[@type='text']"), exclParamToVenafi1CscData.getOrganization());
        type(By.xpath("//td[text() = 'Exclude management type']//..//input[@type='text']"), exclParamToVenafi1CscData.getManagtype());
        type(By.xpath("//td[text() = 'Exclude key size']//..//input[@type='text']"), exclParamToVenafi1CscData.getKeysize());
        type(By.xpath("//td[text() = 'Exclude description']//..//input[@type='text']"), exclParamToVenafi1CscData.getDescription());
        type(By.xpath("//td[text() = 'Exclude elliptic curve']//..//input[@type='text']"), exclParamToVenafi1CscData.getEllipticcurve());
        type(By.xpath("//td[text() = 'Exclude key algorithm']//..//input[@type='text']"), exclParamToVenafi1CscData.getKeyalg());
        type(By.xpath("//td[text() = 'Exclude risk']//..//input[@type='text']"), exclParamToVenafi1CscData.getRisk());
        type(By.xpath("//td[text() = 'Exclude device']//..//input[@type='text']"), exclParamToVenafi1CscData.getDevice());

        click(By.xpath("//div[@class ='modal-content']//button[@type='submit'][contains(text(),'Save')]"));
    }

    public void gotoViewOfCsc1() {
        if (isElementPresent(By.
                xpath("//tr[@class='ng-scope odd row_selected']//a[@class='domains_alert_url ng-scope'][contains(text(),'View')]"))) {
            click(By.xpath("//tr[@class='ng-scope odd row_selected']//a[@class='domains_alert_url ng-scope'][contains(text(),'View')]"));
        } else {
            act.moveToElement(wd.findElement(By.
                    xpath("//tr[@class='ng-scope even row_selected']//a[@class='domains_alert_url ng-scope'][contains(text(),'View')]"))).click().build().perform();
        }
    }

    public void restoreParamFor1Csc(){
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include Installations']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude installations']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Valid to']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include distinguished name']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude distinguished name']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        //act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include status']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude status']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include approver']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude approver']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include name']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude name']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include common name']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude common name']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include parent dn']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude parent dn']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include issuer']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude issuer']//..//i[@title ='Restore tool param value']]"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include validation state']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude validation state']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include manual CSR']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude manual CSR']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include country']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude country']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include signature algorithm']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude signature algorithm']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include organization']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude organization']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include management type']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude management type']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include key size']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude key size']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include description']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude description']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include elliptic curve']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude elliptic curve']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include key algorithm']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude key algorithm']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();
        //act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include Risk']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude risk']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Include device']//..//i[@title ='Restore tool param value']"))).click().build().perform();
        act.moveToElement(wd.findElement(By.xpath("//td[text() = 'Exclude device']//..//i[@class ='pointer text-white fa fa-check-circle mr5 ng-scope']"))).click().build().perform();

        act.moveToElement(wd.findElement(By.xpath("//div[@class ='modal-content']//button[@type='submit'][contains(text(),'Save')]"))).click().build().perform();
    }
}

