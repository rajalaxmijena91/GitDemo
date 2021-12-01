import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class BrowserNavigation {
	
	WebDriver Driver = null;
	
  @Test
  public void brownav() {
	  
	  //Browser Navigation Commands
	  Driver.navigate().forward();
	  Reporter.log("Page current Url : " + Driver.getCurrentUrl());
	   
	  Driver.navigate().back();
	  Reporter.log("Page current Url : " + Driver.getCurrentUrl());
	  
	  Driver.navigate().refresh();
	  Reporter.log("Page current Url : " + Driver.getCurrentUrl());
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
  System.setProperty("webdriver.chrome.driver","C:\\selenium_driver\\chromedriver.exe");
	  
	  Driver = new ChromeDriver();
	  
	   
	  
	  //To launch the url 
	  Driver.get("https://www.google.com"); //Method 1
	  
	  Driver.navigate().to("http://www.facebook.com"); //Method 2
	  
	  
	  //To maximize the browser
	  Driver.manage().window().maximize();	
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	Driver.close();
	
	Driver.quit();
	  
	  
  }

}
