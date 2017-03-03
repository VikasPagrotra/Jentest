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
	    driver.get("https://www.bravernconcierge.com/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Bravern Concierge"));
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
