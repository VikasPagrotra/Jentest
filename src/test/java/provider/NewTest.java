package provider;

/*import org.openqa.selenium.By;*/		
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
/*import org.openqa.selenium.WebElement;*/
/*import org.openqa.selenium.firefox.FirefoxDriver;*/
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

public class NewTest {
private WebDriver driver;
/*private String baseUrl;*/


/*@SuppressWarnings("null")*/

@Test
  public void ftest() {
	    driver.get("http://www.bravern-concierge.com/admin/");  
	    /*driver.get(baseUrl + "/admin/");*/
	    /*String title = driver.getTitle();*/				 
		/*WebElement notificationCheck = null;*/
		Assert.assertEquals("Bravern-Concierge Service", driver.getTitle());
		/*Assert.assertEquals("true", notificationCheck.getAttribute("checked"));
		Assert.assertEquals(true, notificationCheck.getAttribute("Bravern-Concierge Service").equals("true"));*/
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtVendorUsername")).clear();
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtVendorUsername")).sendKeys("dottechtest");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtVendorPassword")).clear();
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtVendorPassword")).sendKeys("@bravern@123");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_BtnLogin")).click();
	    driver.findElement(By.cssSelector("div.icon-bg.icon-bg2")).click();
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnMakeNewReservation")).click();
	    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlAmenity"))).selectByVisibleText("Bravern Guest Suite S-405");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_alink_Submit")).click();
	    driver.findElement(By.cssSelector("option[value=\"11\"]")).click();
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstNameSearch")).clear();
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstNameSearch")).sendKeys("qa");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_BtnSubmitRequest")).click();
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstNameSearch")).click();
	    driver.findElement(By.cssSelector("i.fa.fa-calendar")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | fancybox-frame1489731467467 | ]]
	    driver.findElement(By.xpath("//div[@id='mycal']/div[10]/div[3]")).click();
	    driver.findElement(By.id("NumberOfPerson")).clear();
	    driver.findElement(By.id("NumberOfPerson")).sendKeys("2");
	    new Select(driver.findElement(By.id("NumberOfNights"))).selectByVisibleText("1");
	    driver.findElement(By.id("Deposit")).click();
	    new Select(driver.findElement(By.id("Deposit"))).selectByVisibleText("$200");
	    driver.findElement(By.id("chkAcceptPayment")).click();
	    driver.findElement(By.cssSelector("option[value=\"$200\"]")).click();
	    new Select(driver.findElement(By.id("CreditCardType"))).selectByVisibleText("Visa");
	    driver.findElement(By.id("CreditCardNumber")).clear();
	    driver.findElement(By.id("CreditCardNumber")).sendKeys("4242424242424242");
	    new Select(driver.findElement(By.id("ExpirationDate_Year"))).selectByVisibleText("2019");
	    driver.findElement(By.id("SecurityCode")).clear();
	    driver.findElement(By.id("SecurityCode")).sendKeys("123");
	    driver.findElement(By.id("chkAutoFill")).click();
	    driver.findElement(By.id("Notes")).clear();
	    driver.findElement(By.id("Notes")).sendKeys("This is the test request");
	    driver.findElement(By.id("chkTermsAndConditions")).click();
	    driver.findElement(By.id("Notes")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    driver.findElement(By.id("divcrossAmenityConfirm")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
	    driver.findElement(By.id("__sizzle__")).click();
	    driver.findElement(By.linkText("Amenity Requests")).click();
	    driver.findElement(By.id("ctl00_lnkLogout")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.ie.driver", "C:\\IEDriver\\IEDriverServer.exe");
	  /*WebDriver driver=new InternetExplorerDriver();*/
	  driver = new InternetExplorerDriver();
	  /*driver.manage().window().maximize();*/
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
