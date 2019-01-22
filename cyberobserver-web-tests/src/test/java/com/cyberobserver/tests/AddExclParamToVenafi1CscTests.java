package com.cyberobserver.tests;

import com.cyberobserver.model.ExclParamToVenafi1CscData;
import org.testng.annotations.Test;

public class AddExclParamToVenafi1CscTests extends TestBase {

    @Test
    public void testAddExclParamToVenafi1Csc() {
        app.getNavigationHelper().gotoToolsPage();
        app.getNavigationHelper().gotoVenafi();
        app.getNavigationHelper().gotoTabAll();
        app.getVenafiHelper().selectVenafiControl();
        app.getVenafiHelper().openSetParametrsWindow();
        app.getVenafiHelper().fillSetExcludeParametersWindow(new ExclParamToVenafi1CscData("0",
                "2018-01-01", "%division%", "issued",
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
        //app.getNavigationHelper().gotoPreviousPage();


    }
}
