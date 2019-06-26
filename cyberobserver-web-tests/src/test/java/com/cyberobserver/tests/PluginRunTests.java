package com.cyberobserver.tests;

import com.jcraft.jsch.JSch;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PluginRunTests extends TestBase {

    @Test(enabled = true)
    public void testPluginRun() {
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


        File Serverlog = new File("");

        try {
            Scanner scan = new Scanner(Serverlog);

            while (scan.hasNextLine()){
                String nextToken = scan.next();
                if(nextToken.equalsIgnoreCase("Error"))
                    System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



}
