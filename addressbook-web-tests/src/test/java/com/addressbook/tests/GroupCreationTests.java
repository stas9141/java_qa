package com.addressbook.tests;


import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    //spisok group do dobavleniya
      List<GroupData> before = app.getGroupHelper().getGroupList();

    app.getGroupHelper().createGroup(new GroupData("test1", "null", "null"));

      //spisok group after dobavleniya
      List<GroupData> after = app.getGroupHelper().getGroupList();
    //proverka, sravnivaem razmeri spiskov
    Assert.assertEquals(after.size(),before.size()+1);



  }


}
