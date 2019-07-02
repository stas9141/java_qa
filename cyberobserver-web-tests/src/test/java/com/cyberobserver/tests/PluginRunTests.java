package com.cyberobserver.tests;


import com.cyberobserver.Jsch.Jsch;
import org.testng.annotations.Test;

import java.io.IOException;

public class PluginRunTests extends TestBase {

    @Test(enabled = true)
    public void testPluginRun() throws IOException {


//        try {
//            Jsch exe = new Jsch();
//            String logFile = exe.getData("tail -f  /opt/wildfly/standalone/log/server.log | grep -i error ");
//            System.out.println(logFile);
//        } catch (Exception e) {
//            System.out.println(e);
//        }


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
        app.getExecutePluginHelper().executePluginAs400();
        app.getNavigationHelper().gotoAws();
        app.getExecutePluginHelper().executePluginAws();
        app.getNavigationHelper().gotoAzure();
        app.getExecutePluginHelper().executePluginAzure();
        app.getNavigationHelper().gotoBigfix();
        app.getExecutePluginHelper().executePluginBigfix();
        app.getNavigationHelper().gotoCbResponse();
        app.getExecutePluginHelper().executePluginCbResponse();
        app.getNavigationHelper().gotoCheckpointR77();
        app.getExecutePluginHelper().executePluginCheckpointR77();
        app.getNavigationHelper().gotoCheckpointR80();
        app.getExecutePluginHelper().executePluginCheckpointR80();
        app.getNavigationHelper().gotoCheckpointIpsR77();
        app.getExecutePluginHelper().executePluginCheckpointIpsR77();
        app.getNavigationHelper().gotoCheckpointIpsR80();
        app.getExecutePluginHelper().executePluginCheckpointIpsR80();
        app.getNavigationHelper().gotoCiscoAnyConnect();
        app.getExecutePluginHelper().executePluginCiscoAnyConnect();
        app.getNavigationHelper().gotoCiscoAsa();
        app.getExecutePluginHelper().executePluginCiscoAsa();
        app.getNavigationHelper().gotoCiscoCloud();
        app.getExecutePluginHelper().executePluginCiscoCloudEmail();
        app.getExecutePluginHelper().executePluginCiscoCloudEmailReports();
        app.getNavigationHelper().gotoF5apm();
        app.getExecutePluginHelper().executePluginF5apm();
        app.getNavigationHelper().gotoF5asm();
        app.getExecutePluginHelper().executePluginF5asm();
        app.getNavigationHelper().gotoF5ltm();
        app.getExecutePluginHelper().executePluginF5ltm();



//        Shell shell = new Ssh("10.0.0.152", 22, "cyberobserver", "C0DBLocal!");
//        String stdout = new Shell.Plain(shell).exec("java -version");

    }


}
