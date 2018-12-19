package com.addressbook.tests;

import com.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation()  {
        //spisok contacts do dobavleniya
        List<ContactData> before = app.contact().getContactList();
        //videlyem peremennuyu contact
        ContactData contact = new ContactData("name", "lastname",
                "test","Israel, Haifa",
                "050123456", "dbrmlsky@gmail.com");
        app.contact().createContact(contact,true);
        //spisok contacts do dobavleniya
        List<ContactData> after = app.contact().getContactList();
        //sravnivaem razmery novogo i starogo spiska
        Assert.assertEquals(after.size(),before.size()+1);
        //ishem element s max id
        int max = 0;
        for(ContactData c : after){
            if(c.getId()>max){
                max = c.getId();
            }
        }
        contact.setId(max);//id novogo contacta
        before.add(contact);//dobavlyem contact kotorui sozdal
        //funcziya dlya sravneniya objectov po id
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(),c2.getId());
        //sortiruem stariy spisok
        before.sort(byId);
        //sort noviy
        before.sort(byId);
        //sravnivayem spiski,kotorie sami postroili i uporyadochili, a max id ne nujen,
        // t.k. new contact will be always the last one
        Assert.assertEquals(before,after);
        //sravnivaem stariy spisok(mnojestvo) s novim bez ucheta poryadka, mnojestva
        //Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
    }
}
