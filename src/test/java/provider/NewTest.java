package provider;

/*import org.openqa.selenium.By;*/		
import org.openqa.selenium.WebDriver;		
/*import org.openqa.selenium.firefox.FirefoxDriver;*/
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

public class NewTest {
private WebDriver driver;
  @Test
  public void ftest() {
	    driver.get("http://www.guru99.com/selenium-tutorial.html");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Free Selenium Tutorials"));
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.ie.driver", "C:\\IEDriver\\IEDriverServer.exe");
	  /*WebDriver driver=new InternetExplorerDriver();*/
	  driver = new InternetExplorerDriver();
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
