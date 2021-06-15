package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class TestContact extends TestBase {

  @Test
  public void testContact() throws Exception {
    gotoNewContact();
    fillContactForm(new ContactData("11", "22", "33", "44", "55", "66", "77", "88", "99", "1010", "1234"));
    returnToHomePage();
    Logout();
  }

}
