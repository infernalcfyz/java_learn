package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


    public NavigationHelper(WebDriver wd) {
        super (wd);
    }

    public void returnToHomePage() {
      click(By.linkText("home page"));
    }

    public void gotoGroupPage() {
      click(By.linkText("groups"));
    }

    public void Logout() {
      click(By.linkText("Logout"));
    }
    public void gotoNewContact() {
        click(By.linkText("add new"));
    }
}
