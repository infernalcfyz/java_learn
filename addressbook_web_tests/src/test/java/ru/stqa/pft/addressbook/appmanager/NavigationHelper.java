package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


    public NavigationHelper(WebDriver wd) {
        super (wd);
    }

    public void returnToHomePage() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
      click(By.linkText("home"));
    }

    public void gotoGroupPage() {
      if (isElementPresent(By.tagName("h1"))
              && wd.findElement(By.tagName("h1")).getText().equals("Groups")
              && isElementPresent(By.name("new"))) {
          return;
        }
        click(By.linkText("groups"));
    }

    public void Logout() {
      click(By.linkText("Logout"));
    }
    public void gotoNewContact() {
        click(By.linkText("add new"));
    }

    public void login(String username, String password) {
        type (By.name("user"),username);
        type (By.name("pass"),password);
        click(By.xpath("//input[@value='Login']"));
    }

}
