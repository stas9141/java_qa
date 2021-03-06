package com.addressbook.tests;


import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Comparator;
import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.goTo().groupPage();
        //spisok group do dobavleniya
        List<GroupData> before = app.group().list();
        //videlyem peremennuyu
        GroupData group = new GroupData().withName("test").withFooter("test").withHeader("test");
        app.group().create(group);
        //spisok group after dobavleniya
        List<GroupData> after = app.group().list();
        //proverka, sravnivaem razmeri spiskov
        Assert.assertEquals(after.size(), before.size() + 1);
        //sredi all elements from the list, find with maxId - ojidaemiy id new group
       // int max = 0;
        //for (GroupData g : after) {
          //  if (g.getId() > max) {
            //    max = g.getId();
            //}
        //}
        //lambda function dlya vichisleniya max id
        group.withId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        //dobavlyaem group kotoruyu sozdali v app
        before.add(group);

        Comparator<? super GroupData> byId = (g1,g2) -> Integer.compare(g1.getId(),g2.getId());
        //sortiruem yporyadochuvaem stariy spisok
        before.sort(byId);
        //sortiruem noviy spisok
        after.sort(byId);
        //sravnivaem spiski kotorie tolko yporyadochili sami                   //sravnivaem mnojestva
        Assert.assertEquals(before,after);          //(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
