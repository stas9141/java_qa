package com.addressbook.tests;

import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {


    @BeforeMethod  //pered kajdim testovim methodom doljna vipolnyatsa proverka predusloviy
    public void ensurePreconditions(){
        app.goTo().groupPage();
        if(app.group().list().size()==0)
        //if(!app.group().isThereAGroup()){  ///method proverki nalichiya elementa (group)
            app.group().create(new GroupData("test1", "test2", "test3"));
        }

    @Test
    public void testGroupDeletion() {
        //spisok group do dobavleniya
        List<GroupData> before = app.group().list();
        //index udalyaemoy groupi posledney ili 0 - pervoy
        int index = before.size()-1;
        app.group().delete(index);
        //spisok group after dobavleniya
        List<GroupData> after = app.group().list();

        //proverka, sravnivayem razmeru spiskov
        Assert.assertEquals(after.size(),before.size()-1);

        //pered tem kak sravnivat' spiski nujno lishniy element ydalit'
        before.remove(index);
        //proverka, sravnivayem spiski group do ydaleniya i posle
        Assert.assertEquals(before,after);

    }



}
