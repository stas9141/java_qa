package com.addressbook.tests;

import com.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ContactDeletionTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (app.contact().list().size()==0){//isThereAContact()) {
            app.contact().createContact(new ContactData("name", "lastname",
                    "test", "Israel, Haifa",
                    "050123456", "dbrmlsky@gmail.com"), true);
        }
    }

    @Test
    public void testContactDeletion() {
        List<ContactData> before = app.contact().list();
        //vibor elementa po index (v nachale, v konce, v seredine, proizvolno....)
        int index = before.size() - 1;
        app.contact().delete(index);
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size() - 1);//sravnivaem razmeri spiskov

        //t.k.stariy spisok soderjit na 1 element bolshe, poetomy pered
        // sravneniem spiskov nujno lishniy element ydalit'
        before.remove(index); //teper 2 odinakovih spiska

        Assert.assertEquals(before, after);//sravnivaem 2 spiska do udaleniya i posle


    }

}
