package com.addressbook.tests;

import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();

        if(!app.getGroupHelper().isThereAGroup()){  ///method proverki nalichiya elementa (group)
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        }

        //spisok group do dobavleniya
        List<GroupData> before = app.getGroupHelper().getGroupList();

        app.getGroupHelper().selectGroup(before.size() -1);  //0 - esli perviy element  or before -1 esli poslednyy);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();

        //spisok group after dobavleniya
        List<GroupData> after = app.getGroupHelper().getGroupList();

        //proverka
        Assert.assertEquals(after.size(),before.size());

    }
}
