package com.cyberobserver.tests;

import com.cyberobserver.model.InclParamToVenafi1CscData;
import org.testng.annotations.Test;

public class AddInclParamToVenafi1CscTests extends TestBase {

    @Test(priority=2)
    public void testAddInclParamToVenafi1Csc() {
        app.getNavigationHelper().gotoToolsPage();
        app.getNavigationHelper().gotoVenafi();
        app.getNavigationHelper().gotoTabAll();
        app.getVenafiHelper().selectVenafiControl();
        app.getVenafiHelper().openSetParametersWindow();
        app.getVenafiHelper().fillSetIncludeParametersWindow(new InclParamToVenafi1CscData("1",
                "2018-01-01", "%division%", null,
                "rhreyhryheyh, %tppadmin%, %cyberobservertest%", "%bottle% |%data%| %toreta%| grad%| app% | dfg|",
                " admissions%|hipaa%|locatetv%|madkc%|joihoio|%api% | pubarchive%",
                "%external% | %internal% | ghghhhth|",
                "%digicert% | %comodo% |%cyber% |%rapid%|%trust%|%ip-10-%|InCommon%|Network%|", "failure",
                "false", "us,jp,%ua%,n/a", "sha1RSA, sha256RSA,fdgfdg",
                "%Cloudaware | Chain,Inc.% | %system% |Google%| Blue%| Cover% |itmed%|%media%|amazon|%arizona%",
                "Monitoring", "2048, 1024, 4654 ,4096", "%qa% | %desc% |fg| n/a",
                "n/a", " rsa",
                "weakkey&localdualcontrol, failedvalidation&localdualcontrol, weaksigningalgorithm, unapprovedissuer,distrustedsymantec",
                "10.0.0.1%,dfsgdfgdsfghd"));
        app.getVenafiHelper().gotoViewOfCsc1();
        app.getNavigationHelper().gotoPreviousPage();

    }
}
