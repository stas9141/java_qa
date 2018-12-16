package com.addressbook.tests;

import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {

    @BeforeMethod  //pered kajdim testovim methodom doljna vipolnyatsa proverka predusloviy
    public void ensurePreconditions(){
        app.getNavigationHelper().gotoGroupPage();

        if(!app.getGroupHelper().isThereAGroup()){  ///method proverki nalichiya elementa (group)
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        }
    }

    @Test
    public void testGroupModification(){
        //spisok group do dobavleniya
        List<GroupData> before = app.getGroupHelper().getGroupList();

        //index group which need to modify
        int index = before.size()-1;
        GroupData group = new GroupData(before.get(index).getId(),"test1", "test2", "test3");
        app.getGroupHelper().modifyGroup(index, group);

        //spisok group after dobavleniya
        List<GroupData> after = app.getGroupHelper().getGroupList();

        //proverka razmerov spiskov
        Assert.assertEquals(after.size(),before.size());

        before.remove(index);
        before.add(group);

        //vizovem method sort dlya pervogo spiska i sravnivat' budem po id
        //lambda(na vhode 2 parametera 2 groups kotorie budem sravnivat' i viponyaet sravnenie id
        Comparator<? super GroupData> byId = (g1,g2) -> Integer.compare(g1.getId(),g2.getId());
        before.sort(byId);
        //sort dlya 2-go spiska
        after.sort(byId);
        //proverka - sravnenie spiskov yporyadochennih po moim pravilam i yporyadocheni odinakovo poetomy hashset ne nujen
        Assert.assertEquals(before,after);//(new HashSet<Object>(before),new HashSet<Object>(after));

    }


}
