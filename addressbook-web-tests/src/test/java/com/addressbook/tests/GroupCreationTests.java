package com.addressbook.tests;


import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
        //spisok group do dobavleniya
        List<GroupData> before = app.getGroupHelper().getGroupList();

        //videlyem peremennuyu
        GroupData group = new GroupData("test2", "null", "null");
        app.getGroupHelper().createGroup(group);

        //spisok group after dobavleniya
        List<GroupData> after = app.getGroupHelper().getGroupList();
        //proverka, sravnivaem razmeri spiskov
        Assert.assertEquals(after.size(), before.size() + 1);

        //sredi all elements from the list, find with maxId - ojidaemiy id new group
        int max = 0;
        for (GroupData g : after) {
            if (g.getId() > max) {
                max = g.getId();
            }
        }

        //lambda function dlya vichisleniya max id
        group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        //dobavlyaem group kotoruyu sozdali v app
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    }


}
