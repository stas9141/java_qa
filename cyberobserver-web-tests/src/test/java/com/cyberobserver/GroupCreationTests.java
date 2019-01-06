package com.cyberobserver;


import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation(){
        gotoSystemUsersPage();
        gotoGroupsPage();
        fillGroupForm(new GroupData("2group", "qa test"));
        submitGroupCreation();
    }

}
