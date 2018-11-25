package com.addressbook;


import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation()  {

        gotoContactPage();
        fillContactForm(new ContactData("name", "lastname", "Israel, Haifa",
                "050123456", "dbrmlsky@gmail.com"));
        submitContactCreation();
        returnToHomePage();

    }


}
