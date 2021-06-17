package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class TestGroup4 extends TestBase {

  @Test
  public void testGroup4() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm();
    app.getGroupHelper().submitGroupCreation();
    app.Logout();
  }

}
