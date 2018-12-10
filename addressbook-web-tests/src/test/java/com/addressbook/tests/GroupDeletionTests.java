package com.addressbook.tests;

import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();

        //method pozvolyaushiy yznat' kol-vo group do udaleniya
        int before = app.getGroupHelper().getGroupCount();

         //proverka predysloviya "if not exist any group
        if (!app.getGroupHelper().isThereAGroup()) {  //method proverki nalichiya elementa (group)
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3")); //to create group
        }
        app.getGroupHelper().selectGroup(before -1);  //0 - esli perviy element  or before -1 esli poslednyy
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();

        int after = app.getGroupHelper().getGroupCount(); //posle dobavleniya
        //proverka
        Assert.assertEquals(after,before-1);
    }

}
