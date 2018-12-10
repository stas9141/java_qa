package com.addressbook.tests;


import com.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation()  {
        
        //method pozvolyaushiy yznat' kol-vo group do dobavleniya
        int before = app.getContactHelper().getContactCount();

        //app.getNavigationHelper().gotoAddNewContactPage();
        app.getContactHelper().createContact(new ContactData("name", "lastname",
                "test1","Israel, Haifa",
                "050123456", "dbrmlsky@gmail.com"), true);

        //method pozvolyaushiy yznat' kol-vo group posle dobavleniya
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);


    }


}
