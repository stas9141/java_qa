package com.cyberobserver.tests;

import org.testng.annotations.Test;

public class GroupCopyTests extends TestBase {

    @Test(enabled = false)
    public void testGroupModification (){
        app.getNavigationHelper().gotoToolsConfigurationPage();
        app.getNavigationHelper().gotoGroupsPage();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().initCopyGroup();
        app.getGroupHelper().fillCopyGroupForm();


    }
}
