package com.cyberobserver.tests;


import com.cyberobserver.Jsch.Jsch;
import org.testng.annotations.Test;

import java.io.IOException;

public class PluginRunTests extends TestBase {

    @Test(enabled = true)
    public void testPluginRun() throws IOException {

        app.getNavigationHelper().gotoToolsConfigurationPage();
        app.getNavigationHelper().gotoAD();
        app.getNavigationHelper().gotoPluginsTab();
        app.getExecutePluginHelper().executePluginAllComputers();
        app.getExecutePluginHelper().executePluginAllUsers();
        app.getExecutePluginHelper().executePluginAllUsersAccum();
        app.getExecutePluginHelper().executePluginDomainPolicies();
        app.getExecutePluginHelper().executePluginEmptyGroups();
        app.getExecutePluginHelper().executePluginGroups();
        app.getExecutePluginHelper().executePluginPasswordPolicy();
        app.getNavigationHelper().gotoAirWatch();
        app.getExecutePluginHelper().executePluginAirWatch();
        app.getNavigationHelper().gotoAs400();

        try {
            Jsch exe = new Jsch();
            String logFile = exe.getData("cat  /opt/wildfly/standalone/log/server.log | grep -i error '");
            System.out.println(logFile);
        } catch (Exception e) {
            System.out.println(e);
        }

//        Shell shell = new Ssh("10.0.0.152", 22, "cyberobserver", "C0DBLocal!");
//        String stdout = new Shell.Plain(shell).exec("java -version");

    }


}
