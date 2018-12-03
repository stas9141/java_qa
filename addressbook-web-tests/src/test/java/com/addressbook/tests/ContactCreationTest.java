package com.addressbook.tests;


import com.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation()  {

        app.getNavigationHelper().gotoAddNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData("name", "lastname",
                "test1","Israel, Haifa",
                "050123456", "dbrmlsky@gmail.com"), true);
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoHomePage();

    }


}
