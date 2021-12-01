import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class ChromeBrowser {
	
	WebDriver driver = null;

	
  @Test
  public void ChromeBrowser() {
	  
	  Reporter.log("Chrome Home Page is launched successfully");
		
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
	  
	  
System.setProperty("webdriver.chrome.driver","C:\\selenium_driver\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	   
	  //To launch the url 
	  driver.get(" https://dsportalapp.herokuapp.com/");
	  
	  
	  //To maximize the browser
	  driver.manage().window().maximize();	 
	  
	  //To back the browser
	  driver.navigate().back();
	  
	  //To Forward the browser
	  driver.navigate().forward();
	  	  
  }

  @AfterTest
  public void afterTest() {
	  
      driver.close();
	  
	  driver.quit();
	  

  }

}
