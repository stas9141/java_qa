package com.addressbook.tests;

import com.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion(){

        if(!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("name", "lastname",
                    "test1","Israel, Haifa",
                    "050123456", "dbrmlsky@gmail.com"), true);
        }

        app.getContactHelper().selectContact();
        //app.getContactHelper().initContactModification();
        app.getContactHelper().deleteContact();
        app.getContactHelper().submitContactDeletion();
        app.getNavigationHelper().gotoHomePage();




    }
}
