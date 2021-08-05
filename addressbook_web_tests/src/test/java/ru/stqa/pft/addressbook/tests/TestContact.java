package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class TestContact extends TestBase {

  @Test
  public void testContact() {
    app.getNavigationHelper().returnToHomePage();
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().gotoNewContact();
    app.getContactHelper().fillContactForm (new ContactData("11", null, "33", "44", "55", "66", "77", "88", "99", "1010", "1234", "11"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after,before + 1);
    app.getNavigationHelper().Logout();
  }

}
