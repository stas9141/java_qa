package com.addressbook.tests;

import com.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.contact().isThereAContact()) {
            app.contact().createContact(new ContactData("name", "lastname",
                    "test1", "Israel, Haifa",
                    "050123456", "dbrmlsky@gmail.com"), true);
        }
    }

    @Test
    public void testContactModification(){
         List<ContactData> before = app.contact().getContactList();
        //app.contact().selectContact(before.size()-1);
        app.contact().initContactModification(before.size()-1);//vsegda modif posl element
        ContactData contact = new ContactData(before.get(before.size()-1).getId(),"name", "lastname",
                null,  "Israel, Haifa","050123456", "dbrmlsky@gmail.com");
        app.contact().fillContactForm(contact, false);
        app.contact().submitContactModification();
        app.goTo().gotoHomePage();

        List<ContactData> after = app.contact().getContactList();
        Assert.assertEquals(after.size(),before.size());
        //modificaciya starogo spiska - udalyem posl element
        before.remove(before.size()-1);
        //i dobavlyaem tot kotoriy doljen poyavitsa after modifikacii
        before.add(contact);

        //vizovem method sort dlya pervogo spiska i sravnivat' budem po id
        //lambda(na vhode 2 parametera 2 groups kotorie budem sravnivat' i viponyaet sravnenie id
        Comparator<? super ContactData> byId = (c1,c2) -> Integer.compare(c1.getId(),c2.getId());
        before.sort(byId);
        after.sort(byId);
        //proverka - sravnenie spiskov yporyadochennih po moim pravilam odinakovo poetomy hashset ne nujen
        Assert.assertEquals(before,after);
        //Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));


    }
}
