package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class AutomateSigninProcess {
	
	WebDriver driver=null;
	
	
  @Test
  public void Positivescenario() throws InterruptedException {
	  
	  	//Test Case 1 - Automate User 
		// 3. Click on Getstarted link in HomePage
	  	driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
	  
	  	//4. Click Signin . 
		 driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
		 
		 //Username edit
		 WebElement usernameedit=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
		 
			//Enter Valid username
			
			usernameedit.sendKeys("bhakti");
			Reporter.log("Username Editbox id"+usernameedit.getAttribute("id"));
			Reporter.log("Username Editbox value"+usernameedit.getAttribute("value"));
			
			//Enter Valid username
			
			Thread.sleep(5000);
			//Enter Valid password scenario
			//locate password editbox
			WebElement Passwordedit=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
			Passwordedit.sendKeys("xyzabc");
			
			//enable Password field
			Reporter.log("Password editbox value"+Passwordedit.getAttribute("value"));
			Thread.sleep(5000);
			
			
			//locate Login link)
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			Thread.sleep(5000);
	
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium_driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
					// Steps to Automate:
					//  1. Open this url https://dsportalapp.herokuapp.com/
					driver.get("https://dsportalapp.herokuapp.com/");
					Reporter.log("The Home Page loaded"+driver.getTitle());
					
					// 2. Click on Get started to land on home page.
					//Maximize the window
					
					driver.manage().window().maximize();
					
					
					//page sleep for 5000ms
					Thread.sleep(5000);
					
  			}

  
  
  
  @AfterMethod
  public void afterMethod() throws InterruptedException{
	  
	  
	  driver.close();
		driver.quit();
		
		
  }
  
  
  

}
