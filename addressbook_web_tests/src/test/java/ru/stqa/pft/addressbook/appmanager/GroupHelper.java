package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    private WebDriver wd;
    public GroupHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void submitGroupCreation() {
      wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm() {
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys("11");
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys("22");
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys("33");
    }

    public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
    }
}
