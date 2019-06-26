package com.cyberobserver.tests;


import org.testng.annotations.Test;


public class GroupDeletionTests extends TestBase {

  @Test(enabled = false)
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoToolsConfigurationPage();
    app.getNavigationHelper().gotoGroupsPage();
    app.getGroupHelper().deleteGroups();
    app.getGroupHelper().submitGroupDeletion();
    //wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[12]/following::button[1]")).click();
  }

}