package com.cyberobserver.tests;

import org.testng.annotations.Test;

public class AddParametersTestsToSMG extends TestBase {

    @Test
    public void addParametersTests() {
        app.getNavigationHelper().gotoToolsPage();
        app.getNavigationHelper().gotoSMG();
        app.getNavigationHelper().gotoTabAll();
        app.getSmgHelper().selectSmgControl();
        app.getSmgHelper().openSetParametrsWindow();



    }
}
