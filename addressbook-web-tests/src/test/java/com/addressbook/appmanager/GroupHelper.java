package com.addressbook.appmanager;

import com.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {

        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
      click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());


    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {

        click(By.name("delete"));
    }


    public void selectGroup(int index) {   //prinimaet v kachestve parametera index elementa
        //nahodim vse elements po locatory i sredi etih elements vibiraem nujniy po indexy i click
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }
    public void modifyGroup(int index, GroupData group) {
        selectGroup(index);  //0 - esli perviy element  or before -1 esli poslednyy);
        initGroupModification();
        fillGroupForm(group);
        submitGroupModification();
        returnToGroupPage();
    }
//method proverki nalichiya elementa
    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    //method podscheta group
    public int getGroupCount() {
        return wd.findElements(By.name("selected[]")).size();

    }

    public List<GroupData> getGroupList() {
        //sozdaem spisok kotoriy budem zapolnyat' objectami
        List<GroupData> groups = new ArrayList<GroupData>();
        //poluchaem spisok objectov type of WebElement
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));//find all elements with tag span & class group
        //idem po etim elementam v cycle
        for(WebElement element : elements){
            String name = element.getText(); // polychaem the group name
            //preobrazovivayem string v int
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));//ishem element vnutri drugogo elementa
            //sozdaem object type of groupdate
            GroupData group = new GroupData(id, name,null,null);
            //add just created object to list
            groups.add(group);
        }
        return groups;
    }
}
