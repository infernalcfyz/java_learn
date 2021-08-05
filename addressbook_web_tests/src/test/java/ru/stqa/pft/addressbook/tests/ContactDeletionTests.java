package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase{

    @Test

    public void testContactDeletion() {
        app.getNavigationHelper().returnToHomePage();
        if (! app.getContactHelper().isThereAGroup()) {
            app.getContactHelper().createContact (new ContactData("11", null, "33", "44", "55", "66",
                    "77", "88", "99", "1010", "1234", "11"), true);
            app.getNavigationHelper().returnToHomePage();
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteContact();
        app.getNavigationHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size() - 1);
        app.getNavigationHelper().Logout();
    }
}
