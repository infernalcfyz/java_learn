package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactEditTests extends TestBase{

    @Test

    public void testContactEdit () {
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm (new ContactData("11", "Olegovich", "Markin", "RaccoonCfyz", "qwe", "rty", "123", "456", "0987", "hasbeendone", "killmepls", null), false);
        app.getContactHelper().submitContactEdit();
        app.getNavigationHelper().returnToHomePage();
        app.getNavigationHelper().Logout();
    }
}
