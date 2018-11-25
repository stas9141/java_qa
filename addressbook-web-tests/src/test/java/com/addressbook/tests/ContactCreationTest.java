package com.addressbook.tests;


import com.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation()  {

        app.gotoContactPage();
        app.fillContactForm(new ContactData("name", "lastname", "Israel, Haifa",
                "050123456", "dbrmlsky@gmail.com"));
        app.submitContactCreation();
        app.returnToHomePage();

    }


}
