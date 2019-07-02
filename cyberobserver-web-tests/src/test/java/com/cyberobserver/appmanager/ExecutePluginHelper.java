package com.cyberobserver.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExecutePluginHelper extends HelperBase {

    public ExecutePluginHelper(WebDriver wd, WebDriverWait wait, Actions act) {
        super(wd, wait, act);
    }

    public void executePluginAllComputers() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='all_computers'])[1]/following::i[3]"))).click().build().perform();

    }
    public void executePluginAllUsers() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='all_users'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginAllUsersAccum() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='all_users_accum'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginDomainPolicies() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='domain_policies'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginEmptyGroups() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='empty_groups'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginGroups() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='groups'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginPasswordPolicy() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='password_policy'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginAirWatch() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='AirWatch_1'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginAs400() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='as400'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginAws() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='aws'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginAzure() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='azure1'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginBigfix() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='bigfix1'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginCbResponse() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='carbonblack_ir'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginCheckpointR77() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='checkpointr77fw'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginCheckpointR80() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='checkpointr80fw1'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginCheckpointIpsR77() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='checkpointips'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginCheckpointIpsR80() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='checkpointr80ips'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginCiscoAnyConnect() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='Any_Connect'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginCiscoAsa() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cisco_ASA'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginCiscoCloudEmail() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='CiscoCloudEmail'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginCiscoCloudEmailReports() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='CiscoCloudEmailReports'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginF5apm() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='F5_APM1'])[1]/following::i[3]"))).click().build().perform();
    }

    public void executePluginF5asm() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='F5_ASM1'])[1]/following::i[3]"))).click().build().perform();
    }
    public void executePluginF5ltm() {
        act.moveToElement(wd.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='F5_LTM1'])[1]/following::i[3]"))).click().build().perform();
    }
}
