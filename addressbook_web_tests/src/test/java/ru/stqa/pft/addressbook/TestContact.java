package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestContact {
  private WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testContact() throws Exception {
    wd.get("http://localhost/addressbook/");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys("admin");
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.xpath("//input[@value='Login']")).click();
    wd.findElement(By.linkText("add new")).click();
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("11");
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys("22");
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("33");
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys("44");
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys("55");
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys("66");
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys("77");
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys("88");
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys("99");
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys("1010");
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys("1111");
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys("1234");
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys("93847");
    wd.findElement(By.name("email3")).clear();
    wd.findElement(By.name("email3")).sendKeys("098765");
    wd.findElement(By.name("homepage")).clear();
    wd.findElement(By.name("homepage")).sendKeys("1235546");
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText("25");
    wd.findElement(By.xpath("//option[@value='25']")).click();
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText("March");
    wd.findElement(By.xpath("//option[@value='March']")).click();
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys("1111");
    wd.findElement(By.name("aday")).click();
    new Select(wd.findElement(By.name("aday"))).selectByVisibleText("3");
    wd.findElement(By.xpath("(//option[@value='3'])[2]")).click();
    wd.findElement(By.name("bmonth")).click();
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("amonth")).click();
    new Select(wd.findElement(By.name("amonth"))).selectByVisibleText("May");
    wd.findElement(By.xpath("(//option[@value='May'])[2]")).click();
    wd.findElement(By.name("ayear")).click();
    wd.findElement(By.name("ayear")).clear();
    wd.findElement(By.name("ayear")).sendKeys("1234");
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("new_group")).click();
    new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("11");
    wd.findElement(By.xpath("(//option[@value='6'])[3]")).click();
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys("mjnhgfbv");
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys("fdvfghgf");
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys("hgfgfhgfhfgh");
    wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    wd.findElement(By.xpath("//div[@id='content']/div")).click();
    wd.findElement(By.linkText("home page")).click();
    wd.findElement(By.linkText("Logout")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys("admin");
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
