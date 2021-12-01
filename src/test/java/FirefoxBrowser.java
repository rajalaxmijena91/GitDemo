import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
//import java.sql.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

@Test
public class FirefoxBrowser {
	
	WebDriver driver = null;
	
	
  public void Test() {
	  
	//Browser Navigation Commands
	  driver.navigate().forward();
	  Reporter.log("Page current Url : " + driver.getCurrentUrl());
	   
	  driver.navigate().back();
	  Reporter.log("Page current Url : " + driver.getCurrentUrl());
	  
	  driver.navigate().refresh();
	  Reporter.log("Page current Url : " + driver.getCurrentUrl());
  }
  @BeforeTest
  public void beforeTest() { 
	  
	  //setting the firefox driver
	  System.setProperty("webdriver.gecko.driver","C:\\selenium_driver\\geckodriver.exe");
	  
	  //Firefox browser
	  driver =  new FirefoxDriver();
	  
	  
	  //To maximize the browser
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	//To close the current Browser
	  driver.close();
	  
	//To exit the Browser instance
	  //driver.quit();	  
	  
  }
  
  

}
