package com.addressbook.tests;

import com.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
//proverka predysloviya "if not exist any group
    if(!app.getGroupHelper().isThereAGroup()){  //method proverki nalichiya elementa (group)
      app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3")); //to create group
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
