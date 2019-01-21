package com.cyberobserver.tests;

import com.cyberobserver.model.GroupData;
import org.testng.annotations.Test;

public class GroupCopyTests extends TestBase {

    @Test(enabled = false)
    public void testGroupModification (){
        app.getNavigationHelper().gotoSystemUsersPage();
        app.getNavigationHelper().gotoGroupsPage();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().initCopyGroup();
        app.getGroupHelper().fillCopyGroupForm();


    }
}
