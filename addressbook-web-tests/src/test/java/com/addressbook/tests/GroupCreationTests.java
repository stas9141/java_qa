package com.addressbook.tests;


import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    //method pozvolyaushiy yznat' kol-vo group do dobavleniya
    int before = app.getGroupHelper().getGroupCount();


    app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));

    int after = app.getGroupHelper().getGroupCount(); //posle dobavleniya
    //proverka
    Assert.assertEquals(after,before+1);



  }


}
