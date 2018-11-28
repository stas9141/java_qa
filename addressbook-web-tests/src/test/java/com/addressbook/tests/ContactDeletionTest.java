package com.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion(){
        app.getContactHelper().selectContact();
        //app.getContactHelper().initContactModification();
        app.getContactHelper().deleteContact();
        app.getContactHelper().submitContactDeletion();
        app.getNavigationHelper().gotoHomePage();




    }
}
