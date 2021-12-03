package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class RadioButtonCheckBox2 {
	WebDriver driver=null;
	
	
  @Test
  public void SelectRadioButtonandCheckBox() throws InterruptedException {
	  
	//Test case	2 
	  WebElement genradiobtn = driver.findElement(By.xpath("//*[@id=\"female\"]"));
	  
	  genradiobtn.click();
	  
	  Thread.sleep(2000);
	  
	  WebElement TueCheckbox = driver.findElement(By.id("tuesday"));
	  
	  TueCheckbox.click();
	  
	  Thread.sleep(2000);
	  
	  WebElement FriCheckbox = driver.findElement(By.id("friday"));
	  
	  FriCheckbox.click();
	  Thread.sleep(2000);
	  
  }
  @BeforeTest
  public void beforeTest()  throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\selenium_driver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  
	// Steps to Automate:
		//  1. Open this url https://dsportalapp.herokuapp.com/
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Reporter.log("The Home Page loaded"+driver.getTitle());
		
		// 2. Click on Get started to land on home page.
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//page sleep for 5000ms
		Thread.sleep(5000);

	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  driver.close();
	  
	  
	  
  }
  
}
