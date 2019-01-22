package com.cyberobserver.tests;

import org.testng.annotations.Test;

public class RestoreAllParamForVenafi1CscTests extends TestBase {

    @Test(enabled = false)
    public void testRestoreAllParamForVenafi1Csc() {
        app.getNavigationHelper().gotoToolsPage();
        app.getNavigationHelper().gotoVenafi();
        app.getNavigationHelper().gotoTabAll();
        app.getVenafiHelper().selectVenafiControl();
        app.getVenafiHelper().openSetParametrsWindow();

    }
}