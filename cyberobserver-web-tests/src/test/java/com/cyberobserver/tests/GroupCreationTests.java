package com.cyberobserver.tests;


import com.cyberobserver.model.GroupData;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation(){
        app.gotoSystemUsersPage();
        app.gotoGroupsPage();
        app.fillGroupForm(new GroupData("2group", "qa test"));
        app.submitGroupCreation();
    }

}
