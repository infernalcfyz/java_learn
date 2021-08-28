package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class TestContact extends TestBase {

  @Test
  public void testContact() {
    app.goTo().login("admin", "secret");
    app.goTo().returnToHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    ContactData contact = new ContactData("44", null, "33", null, null,
            null, null, null, null, null, null, "11");
    app.goTo().gotoNewContact();
    app.getContactHelper().fillContactForm (contact, true);
    app.getContactHelper().submitContactCreation();
    app.goTo().returnToHomePage();
    List<ContactData> after= app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() + 1);

    contact.setId(after.stream().max( (o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
    app.goTo().Logout();
  }

}
