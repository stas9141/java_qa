package com.addressbook.tests;


import com.addressbook.model.GroupData;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();

    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));


  }


}
