package com.addressbook.tests;


import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
        //spisok group do dobavleniya
        List<GroupData> before = app.getGroupHelper().getGroupList();

        //videlyem peremennuyu
        GroupData group = new GroupData("test1", "null", "null");
        app.getGroupHelper().createGroup(group);

        //spisok group after dobavleniya
        List<GroupData> after = app.getGroupHelper().getGroupList();
        //proverka, sravnivaem razmeri spiskov
        Assert.assertEquals(after.size(), before.size() + 1);

        //sredi all elements from the list, find with maxId - ojidaemiy id new group

        int max = 0;
        for(GroupData g : after){
            if(g.getId()>max){
                max = g.getId();
            }
        }
        group.setId(max);
        //dobavlyaem group kotoruyu sozdali v app
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));

    }


}
