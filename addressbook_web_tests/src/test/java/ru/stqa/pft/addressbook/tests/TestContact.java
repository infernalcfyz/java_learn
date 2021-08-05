package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class TestContact extends TestBase {

  @Test
  public void testContact() {
    app.getNavigationHelper().returnToHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getNavigationHelper().gotoNewContact();
    app.getContactHelper().fillContactForm (new ContactData("11", "22", "33", "44", "55", "66", "77", "88", "99", "1010", "1234", "11"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
    List<ContactData> after= app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() + 1);
    app.getNavigationHelper().Logout();
  }

}
