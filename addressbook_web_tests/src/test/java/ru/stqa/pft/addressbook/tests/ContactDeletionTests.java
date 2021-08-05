package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase{

    @Test

    public void testContactDeletion() {
        app.getNavigationHelper().returnToHomePage();
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAGroup()) {
            app.getContactHelper().createContact (new ContactData("11", null, "33", "44", "55", "66",
                    "77", "88", "99", "1010", "1234", "11"), true);
            app.getNavigationHelper().returnToHomePage();
        }
        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().deleteContact();
        app.getNavigationHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before - 1);
        app.getNavigationHelper().Logout();
    }
}
