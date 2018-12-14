package com.addressbook.tests;

import com.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){

        if(!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("name", "lastname",
                    "test1","Israel, Haifa",
                    "050123456", "dbrmlsky@gmail.com"), true);
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size()-1);
        app.getContactHelper().initContactModification();
        ContactData contact = new ContactData(before.get(before.size()-1).getId(),"name", "lastname",
                null,  "Israel, Haifa",
                "050123456", "dbrmlsky@gmail.com");
        app.getContactHelper().fillContactForm(contact, false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();

        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size());

        //modificaciya starogo spiska - udalyem posl element
        before.remove(before.size()-1);
        //i dobavlyaem tot kotoriy doljen poyavitsa after modifikacii
        before.add(contact);
        Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));


    }
}
