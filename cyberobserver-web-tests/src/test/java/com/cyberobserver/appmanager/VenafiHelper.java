package com.cyberobserver.appmanager;

import com.cyberobserver.model.ExcludeParameterToCscData;
import com.cyberobserver.model.IncludeParameterToCscData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public void fillSetIncludeParametersWindow(IncludeParameterToCscData includeParameterToCscData) {
        type(By.xpath("//tbody//tr[1]//td[2]//input[1]"), includeParameterToCscData.getInstallation());
        type(By.xpath("//tbody//tr[3]//td[2]//input[1]"), includeParameterToCscData.getValidto());
        type(By.xpath("//tbody//tr[4]//td[2]//input[1]"), includeParameterToCscData.getDnname());
        type(By.xpath("//tbody//tr[6]//td[2]//input[1]"), includeParameterToCscData.getStatus());
        type(By.xpath("//tbody//tr[8]//td[2]//input[1]"), includeParameterToCscData.getApprover());
        type(By.xpath("//tbody//tr[10]//td[2]//input[1]"), includeParameterToCscData.getName());
        type(By.xpath("//tbody//tr[12]//td[2]//input[1]"), includeParameterToCscData.getComname());
        type(By.xpath("//tbody//tr[14]//td[2]//input[1]"), includeParameterToCscData.getParentdn());
        type(By.xpath("//tbody//tr[16]//td[2]//input[1]"), includeParameterToCscData.getIssuer());
        type(By.xpath("//tbody//tr[18]//td[2]//input[1]"), includeParameterToCscData.getValidstate());
        type(By.xpath("//tbody//tr[20]//td[2]//input[1]"), includeParameterToCscData.getManualcsr());
        type(By.xpath("//tbody//tr[22]//td[2]//input[1]"), includeParameterToCscData.getCountry());
        type(By.xpath("//tbody//tr[24]//td[2]//input[1]"), includeParameterToCscData.getSignalg());
        type(By.xpath("//tbody//tr[26]//td[2]//input[1]"), includeParameterToCscData.getOrganization());
        type(By.xpath("//tbody//tr[28]//td[2]//input[1]"), includeParameterToCscData.getManagtype());
        type(By.xpath("//tbody//tr[30]//td[2]//input[1]"), includeParameterToCscData.getKeysize());
        type(By.xpath("//tbody//tr[32]//td[2]//input[1]"), includeParameterToCscData.getDescription());
        type(By.xpath("//tbody//tr[34]//td[2]//input[1]"), includeParameterToCscData.getEllipticcurve());
        type(By.xpath("//tbody//tr[36]//td[2]//input[1]"), includeParameterToCscData.getKeyalg());
        type(By.xpath("//tbody//tr[38]//td[2]//input[1]"), includeParameterToCscData.getRisk());
        type(By.xpath("//tbody//tr[40]//td[2]//input[1]"), includeParameterToCscData.getDevice());

        click(By.xpath("//div[@class ='modal-content']//button[@type='submit'][contains(text(),'Save')]"));

    }

    public void fillSetExcludeParametersWindow(ExcludeParameterToCscData excludeParameterToCscData) {
        type(By.xpath("//tbody//tr[2]//td[2]//input[1]"), excludeParameterToCscData.getInstallation());
        type(By.xpath("//tbody//tr[3]//td[2]//input[1]"), excludeParameterToCscData.getValidto());
        type(By.xpath("//tbody//tr[5]//td[2]//input[1]"), excludeParameterToCscData.getDnname());
        type(By.xpath("//tbody//tr[7]//td[2]//input[1]"), excludeParameterToCscData.getStatus());
        type(By.xpath("//tbody//tr[9]//td[2]//input[1]"), excludeParameterToCscData.getApprover());
        type(By.xpath("//tbody//tr[11]//td[2]//input[1]"), excludeParameterToCscData.getName());
        type(By.xpath("//tbody//tr[13]//td[2]//input[1]"), excludeParameterToCscData.getComname());
        type(By.xpath("//tbody//tr[15]//td[2]//input[1]"), excludeParameterToCscData.getParentdn());
        type(By.xpath("//tbody//tr[17]//td[2]//input[1]"), excludeParameterToCscData.getIssuer());
        type(By.xpath("//tbody//tr[19]//td[2]//input[1]"), excludeParameterToCscData.getValidstate());
        type(By.xpath("//tbody//tr[21]//td[2]//input[1]"), excludeParameterToCscData.getManualcsr());
        type(By.xpath("//tbody//tr[23]//td[2]//input[1]"), excludeParameterToCscData.getCountry());
        type(By.xpath("//tbody//tr[25]//td[2]//input[1]"), excludeParameterToCscData.getSignalg());
        type(By.xpath("//tbody//tr[27]//td[2]//input[1]"), excludeParameterToCscData.getOrganization());
        type(By.xpath("//tbody//tr[29]//td[2]//input[1]"), excludeParameterToCscData.getManagtype());
        type(By.xpath("//tbody//tr[31]//td[2]//input[1]"), excludeParameterToCscData.getKeysize());
        type(By.xpath("//tbody//tr[33]//td[2]//input[1]"), excludeParameterToCscData.getDescription());
        type(By.xpath("//tbody//tr[35]//td[2]//input[1]"), excludeParameterToCscData.getEllipticcurve());
        type(By.xpath("//tbody//tr[37]//td[2]//input[1]"), excludeParameterToCscData.getKeyalg());
        type(By.xpath("//tbody//tr[39]//td[2]//input[1]"), excludeParameterToCscData.getRisk());
        type(By.xpath("//tbody//tr[41]//td[2]//input[1]"), excludeParameterToCscData.getDevice());

        click(By.xpath("//div[@class ='modal-content']//button[@type='submit'][contains(text(),'Save')]"));
    }
}

