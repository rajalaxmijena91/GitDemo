package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class RadiobuttonandCheckBoxes {
	
	WebDriver driver=null;
	
	
  @Test
  public void SelectRadioButtonandCheckBox() throws InterruptedException {
	  
	//Test Case 1 - Automate User 
	// 3. Click on hyperlink 
	  driver.findElement(By.xpath("//*[@id=\"block-1069048\"]/div/div/div/h1[2]/a")).click();
	  
	  WebElement bmwRadiobtn = driver.findElement(By.id("bmwradio"));
	  
	  bmwRadiobtn.click();
	  
	 Thread.sleep(2000);
	 
	 WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
	  
	 bmwCheckBox.click();
	 
	 Thread.sleep(2000);
	 
	 WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
	  
	 benzCheckBox.click();
	 
	 Thread.sleep(2000);
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException{
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium_driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  			// Steps to Automate:
				//  1. Open this url https://dsportalapp.herokuapp.com/
				driver.get("https://letskodeit.teachable.com/p/practice");
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
