package com.addressbook.tests;


import com.addressbook.model.ContactData;
import com.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation()  {

        //spisok contacts do dobavleniya
        List<ContactData> before = app.getContactHelper().getContactList();

        ContactData contact = new ContactData("name", "lastname",
                "test1","Israel, Haifa",
                "050123456", "dbrmlsky@gmail.com");
        app.getContactHelper().createContact(contact,true);

        //spisok contacts do dobavleniya
        List<ContactData> after = app.getContactHelper().getContactList();

        //sravnivaem razmery novogo i starogo spiska
        Assert.assertEquals(after.size(),before.size()+1);


        int max = 0;
        for(ContactData c : after){
            if(c.getId()>max){
                max = c.getId();
            }
        }
        contact.setId(max);
        before.add(contact);
        Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
    }


}
