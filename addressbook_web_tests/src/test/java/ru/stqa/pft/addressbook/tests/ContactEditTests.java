package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactEditTests extends TestBase{

    @Test (enabled = false)

    public void testContactEdit () {
        app.getNavigationHelper().login("admin", "secret");
        app.getNavigationHelper().returnToHomePage();
        if (! app.getContactHelper().isThereAGroup()) {
            app.getContactHelper().createContact (new ContactData("11", null, "33", "44", "55", "66",
                    "77", "88", "99", "1010", "1234", "11"), true);
            app.getNavigationHelper().returnToHomePage();
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().editContact(before.size() - 1);
        ContactData contact = new ContactData("11", "Olegovich", "Markin", "RaccoonCfyz",
                "qwe", "rty", "123", "456", "0987", "hasbeendone", "killmepls", null);
        app.getContactHelper().fillContactForm ((contact), false);
        app.getContactHelper().submitContactEdit();
        app.getNavigationHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size());

        before.remove(before.size() - 1);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
        app.getNavigationHelper().Logout();
    }
}
