package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class TestContact extends TestBase {

  @Test
  public void testContact() {
    app.gotoNewContact();
    app.getContactHelper().fillContactForm (new ContactData("11", "22", "33", "44", "55", "66", "77", "88", "99", "1010", "1234"));
    app.getNavigationHelper().returnToHomePage();
    app.getNavigationHelper().Logout();
  }

}
