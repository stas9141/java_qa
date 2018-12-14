package com.addressbook.appmanager;

import com.addressbook.model.ContactData;
import com.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }


    public void returnToHomePage() {
        click(By.linkText("HOME"));
    }

    public void gotoAddNewContactPage() {
        click(By.linkText("ADD_NEW"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getTelephone());
        type(By.name("email"), contactData.getEmail());

        //method proverki nalichiya ili otsutstviya elementov
        if (creation) {
            //vibor elementa iz vipadayushego spiska
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void initContactModification() {
        click(By.cssSelector("img[alt='EDIT']"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void selectContact(int index) { //prinimaet v kachestve parametera index elementa
        //nahodim vse elements po locatory i sredi etih elements vibiraem nujniy po indexy i click
        wd.findElements(By.name("selected[]")).get(index).click();
         }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='DELETE']"));
    }

    public void submitContactDeletion() {
        //isAlertPresent();
        wd.switchTo().alert().accept();
    }

    public void createContact(ContactData contact, boolean b) {
        gotoAddNewContactPage();
        fillContactForm(contact, true);
        submitContactCreation();
        returnToHomePage();

    }
    //method proverki nalichiya elementa
    public boolean isThereAContact() {
        return(isElementPresent(By.name("selected[]")));
    }

    ////method podscheta kol-va contactov
    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getContactList() {
        //sozdaem spisok kotoriy budem zapolnyat' objectami
        List<ContactData> contacts = new ArrayList<ContactData>();
        //poluchaem spisok objectov type of WebElement
        List<WebElement> elements = wd.findElements(By.cssSelector("tr[name=entry]"));//find all elements with tag span & class group
        //idem po etim elementam v cycle
        for(WebElement element : elements){
            String name = element.getText(); // polychaem text - the group name
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));//ishem element vnutri drugogo elementa
            //sozdaem object type of groupdate
            ContactData contact = new ContactData(id,name,null,null,null,null,null);
            //add just created object to list
            contacts.add(contact);
        }
        return contacts;
    }
}


