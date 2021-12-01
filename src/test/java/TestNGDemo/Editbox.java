package TestNGDemo;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;


public class Editbox {
	
	WebDriver driver = null;

	
	@Test
	  public void  WebElementLogin() throws InterruptedException 
	  {
	   Thread.sleep(3000);
	  
	  //Email field
	  WebElement usernameedit = driver.findElement(By.name("email"));
	  Reporter.log("Username Field is Displayed" + usernameedit.isDisplayed());
	  Reporter.log("Username Field is Enabled" + usernameedit.isEnabled());
	      
	  
	   usernameedit.click(); 
	   usernameedit.sendKeys("hello");
	   Thread.sleep(3000);
	   
	   usernameedit.clear();
	   Thread.sleep(3000);
	   
	   usernameedit.sendKeys("Class");
	   Thread.sleep(3000);
	   
	   Reporter.log("Entered the value for the email field");
	   
	   
	   //Retrieve the  Label for the email field
	   WebElement username = driver.findElement(By.xpath("//*[@for='email']"));    
	  
	  String LabeloftheUsername = username.getText();
	 
	    
	  Reporter.log("Label for the Email Field is displayed as : " + LabeloftheUsername);
	  Reporter.log("Label for the Email Field is displayed as : " + username.getText());
	  
	   driver.findElement(By.name("passwd")).isEnabled();
	   
	   //IsDisplayed
	   Reporter.log("Validate the Password Field is Displayed : " + driver.findElement(By.name("passwd")).isDisplayed());  
	   
	   //IsEnabled
	   Reporter.log("Validate the Password Field is Enabled : " + driver.findElement(By.name("passwd")).isEnabled());  
	   
	   driver.findElement(By.name("passwd")).click();
	   driver.findElement(By.name("passwd")).sendKeys("hello");
	   Thread.sleep(3000);
	   
	   Reporter.log("Entered the value for the Password Field");
	   
	   
	   //Retrieve the  Label for the email field
	   WebElement passlabelobj = driver.findElement(By.xpath("//label[@for='passwd']"));
	     
	   String passlabelobjvalue = passlabelobj.getText();
	   Reporter.log("Label for the Password Field is displayed as : " + passlabelobjvalue);
	   
	   String passlabelattri = passlabelobj.getAttribute("for");
	   Reporter.log("Attribute Value:  " + passlabelattri);  
	     
	  }
	  
	 
	  
	  @BeforeTest
	  public void beforeTest() throws InterruptedException 
	  {
	    
	    //Setting the Chrome driver version 90 path
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium_driver\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  //To launch the url
	  driver.get("http://demo.guru99.com/test/login.html");
	  
	  Reporter.log("Page is launched successsfully");
	  
	  //To get the page title
	  Reporter.log("Page Title : " + driver.getTitle());
	  
	  //To get the page url
	  Reporter.log("Page Current Url : " + driver.getCurrentUrl());
	  
	  //To maximize the browser
	  driver.manage().window().maximize();
	  Reporter.log("Page is scrolled by pixel");
	  
	  //Implicit wait
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);

	  }

	  @AfterTest
	  public void tearDown() throws Exception {
	   System.out.println("Inside tearDownTest");
	  //To close the current browser
	   driver.close();
	   
	   //To exit the browser instance
	   driver.quit();
	     
	   }
	  
  }
