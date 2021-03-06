package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);

    }
    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNick());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getJob());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("work"), contactData.getWork());
        type(By.name("email"), contactData.getEmail());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void selectAllContact () {click(By.id("MassCB"));}

    public void submitContactCreation () {click(By.name("submit"));}

    public void deleteContact () {
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void selectContact (int index ) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void editContact (int index) {

        wd.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
    }

    public void submitContactEdit () {
        click(By.name("update"));
    }

    public void createContact(ContactData contact, boolean b) {
        click(By.linkText("add new"));
        fillContactForm (contact, true);
        submitContactCreation();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getContactList() {
        List <ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements((By.name("entry")));
        for (WebElement element : elements) {
            String firstname = element.findElements(By.xpath("./child::*")).get(2).getText();
            String lastname = element.findElements(By.xpath("./child::*")).get(1).getText();
            ContactData contact = new ContactData(firstname,null,lastname,null,null,null,null,null,null,
                    null,null,null);
            contacts.add(contact);
        }
        return contacts;
    }
}
