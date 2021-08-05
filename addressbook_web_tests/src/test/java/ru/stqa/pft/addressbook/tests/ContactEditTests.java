package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactEditTests extends TestBase{

    @Test

    public void testContactEdit () {
        app.getNavigationHelper().returnToHomePage();
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAGroup()) {
            app.getContactHelper().createContact (new ContactData("11", null, "33", "44", "55", "66",
                    "77", "88", "99", "1010", "1234", "11"), true);
            app.getNavigationHelper().returnToHomePage();
        }
        app.getContactHelper().editContact(before - 1);
        app.getContactHelper().fillContactForm (new ContactData("11", "Olegovich", "Markin", "RaccoonCfyz", "qwe", "rty", "123", "456", "0987", "hasbeendone", "killmepls", null), false);
        app.getContactHelper().submitContactEdit();
        app.getNavigationHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before);
        app.getNavigationHelper().Logout();
    }
}
