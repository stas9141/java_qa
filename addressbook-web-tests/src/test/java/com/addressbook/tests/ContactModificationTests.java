package com.addressbook.tests;

import com.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){

        if(!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("name", "lastname",
                    "test1","Israel, Haifa",
                    "050123456", "dbrmlsky@gmail.com"), true);
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("name", "lastname",
                null,  "Israel, Haifa",
                "050123456", "dbrmlsky@gmail.com"), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();


    }
}
