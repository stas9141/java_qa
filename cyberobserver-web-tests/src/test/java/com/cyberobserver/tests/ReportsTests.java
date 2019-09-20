package com.cyberobserver.tests;

import org.testng.annotations.Test;

import java.io.IOException;

public class ReportsTests extends TestBase {

    @Test(enabled = true)
    public void testPluginRun() throws IOException {

        app.getNavigationHelper().gotoReportsPage();
        app.getNavigationHelper().gotoToolsReport();

    }
}