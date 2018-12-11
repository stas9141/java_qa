package com.addressbook.tests;

import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();

         //proverka predysloviya "if not exist any group
        if (!app.getGroupHelper().isThereAGroup()) {  //method proverki nalichiya elementa (group)
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3")); //to create group
        }

        //spisok group do dobavleniya
        List<GroupData> before = app.getGroupHelper().getGroupList();


        app.getGroupHelper().selectGroup(before.size() -1);  //0 - esli perviy element  or before -1 esli poslednyy
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();

        //spisok group after dobavleniya
        List<GroupData> after = app.getGroupHelper().getGroupList();

        //proverka, sravnivayem razmeru spiskov
        Assert.assertEquals(after.size(),before.size()-1);

        //pered tem kak sravnivat' spiski nujno lishniy element ydalit'
        before.remove(before.size()-1);
        //proverka, sravnivayem spiski group do ydaleniya i posle
        Assert.assertEquals(before,after);

    }

}
