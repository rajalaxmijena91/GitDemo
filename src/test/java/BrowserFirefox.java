import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class BrowserFirefox {

	WebDriver driver = null;
	
	
  @Test
  public void BrowserFirefox() {
	  
	  Reporter.log("Firefox Home Page is launched successfully");
		
	  //To get page title
	  String valuetitle = driver.getTitle();
	  
	  //Reporter.log("page Title : " + driver.getTitle());
	  Reporter.log("page Title :" + valuetitle);
	  
	  //To get the url of the page
	  Reporter.log("page Current Url : " + driver.getCurrentUrl());
	  
	  
	  //To get page source
	  Reporter.log("page Source : " + driver.getPageSource()  );  
	  
       }
  
       @BeforeTest
       public void beforeTest() {
	  
       System.setProperty("webdriver.gecko.driver","C:\\selenium_driver\\geckodriver.exe");
	  
	   driver = new FirefoxDriver();
	  
	   
	   //To launch the url 
	   driver.get(" https://dsportalapp.herokuapp.com/");
	  
	  
	  //To maximize the browser
	  driver.manage().window().maximize();	  
		  	   
	   //To back the browser
	    driver.navigate().back();
	  
	  //To forward the browser
	  driver.navigate().forward();
	  
      }

      @AfterTest
      public void afterTest() {
	  
	  driver.close();
	  
  }

}
