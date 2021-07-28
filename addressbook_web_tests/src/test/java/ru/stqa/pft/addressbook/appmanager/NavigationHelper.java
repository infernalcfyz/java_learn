package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void returnToHomePage() {
      wd.findElement(By.linkText("home page")).click();
    }

    public void gotoGroupPage() {
      wd.findElement(By.linkText("groups")).click();
    }

    public void Logout() {
      wd.findElement(By.linkText("Logout")).click();
    }
    public void gotoNewContact() {
        wd.findElement(By.linkText("add new")).click();
    }
}
