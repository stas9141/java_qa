package com.cyberobserver.tests;


import com.cyberobserver.model.GroupData;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test(enabled = false)
    public void testGroupCreation(){
        app.getNavigationHelper().gotoSystemUsersPage();
        app.getNavigationHelper().gotoGroupsPage();
        app.getGroupHelper().fillGroupForm(new GroupData("2group", "qa test"));
        app.getGroupHelper().submitGroupCreation();

    }

}
