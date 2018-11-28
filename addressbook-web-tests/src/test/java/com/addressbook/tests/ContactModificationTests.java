package com.addressbook.tests;

import com.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("name", "lastname", "Israel, Haifa",
                "050123456", "dbrmlsky@gmail.com"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();


    }
}