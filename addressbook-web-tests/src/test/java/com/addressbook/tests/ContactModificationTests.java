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
        if (app.contact().list().size() == 0) {//isThereAContact()) {
            app.contact().createContact(new ContactData().withFirstname("name").withLastname("lastname"), true);
            //"test", "Israel, Haifa", "050123456", "dbrmlsky@gmail.com"), true);
        }
    }

    @Test
    public void testContactModification() {
        List<ContactData> before = app.contact().list();
        //app.contact().selectContact(before.size()-1);
        int index = before.size() - 1;
        ContactData contact = new ContactData().withId(before.get(index).getId()).withFirstname("name")
                .withLastname("lastname").withGroup("test").withAddress("Israel, Haifa")
                .withTelephone("050123456").withEmail("dbrmlsky@gmail.com");
        app.contact().modify(index, contact);

        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size());
        //modificaciya starogo spiska - udalyem posl element
        before.remove(index);
        //i dobavlyaem tot kotoriy doljen poyavitsa after modifikacii
        before.add(contact);

        //vizovem method sort dlya pervogo spiska i sravnivat' budem po id
        //lambda(na vhode 2 parametera 2 groups kotorie budem sravnivat' i viponyaet sravnenie id
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        //proverka - sravnenie spiskov yporyadochennih po moim pravilam odinakovo poetomy hashset ne nujen
        Assert.assertEquals(before, after);
        //Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));


    }


}
