package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class TestGroup4 extends TestBase {

  @Test
  public void testGroup4() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm (new GroupData("11", "22", "33"));
    app.getGroupHelper().submitGroupCreation();
    app.getNavigationHelper().Logout();
  }

}
