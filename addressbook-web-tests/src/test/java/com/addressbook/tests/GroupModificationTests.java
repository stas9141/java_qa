package com.addressbook.tests;

import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class GroupModificationTests extends TestBase {

    @BeforeMethod  //pered kajdim testovim methodom doljna vipolnyatsa proverka predusloviy
    public void ensurePreconditions(){
        app.goTo().groupPage();
        if(app.group().list().size()==0){  ///method proverki nalichiya elementa (group) isThereAGroup
            app.group().create(new GroupData("test", "test", "test"));
        }
    }

    @Test
    public void testGroupModification(){
        //spisok group do dobavleniya
        List<GroupData> before = app.group().list();

        //index group which need to modify
        int index = before.size()-1;
        GroupData group = new GroupData(before.get(index).getId(),"test", "test", "test");
        app.group().modify(index, group);
        //spisok group after dobavleniya
        List<GroupData> after = app.group().list();
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
