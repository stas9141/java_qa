package com.cyberobserver.tests;

import org.testng.annotations.Test;

public class AddParametersTestsToVenafi extends TestBase {

    @Test
    public void addParametersTests() {
        app.getNavigationHelper().gotoToolsPage();
        app.getNavigationHelper().gotoVenafi();
        app.getNavigationHelper().gotoTabAll();
        app.getVenafiHelper().selectVenafiControl();
        app.getVenafiHelper().openSetParametrsWindow();
        app.getVenafiHelper().fillSetParametersWindow();



    }
}
