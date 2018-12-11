package com.addressbook.tests;

import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
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
        GroupData group = new GroupData(before.get(before.size()-1).getId(),"test1", "test2", "test3");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();

        //spisok group after dobavleniya
        List<GroupData> after = app.getGroupHelper().getGroupList();

        //proverka razmerov spiskov
        Assert.assertEquals(after.size(),before.size());

        before.remove(before.size()-1);
        before.add(group);
        //proverka spiskov
        Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));

    }
}
