package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

public class TestGroup4 extends TestBase {

  @Test
  public void testGroup4() {
    app.goTo().login("admin", "secret");
    app.goTo().GroupPage();
    Set<GroupData> before = app.group().all();
    GroupData group = new GroupData().withName("test 2");
    app.group().create(group);

    Set<GroupData> after = app.group().all();
    Assert.assertEquals(after.size(),before.size() + 1);

    group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
    before.add(group);
    Assert.assertEquals(before, after);

    app.goTo().Logout();
  }

}
