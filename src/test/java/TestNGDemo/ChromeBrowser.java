package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class ChromeBrowser {
	
	
	

		WebDriver driver = null;
		
		
	  @Test
	  public void ChromeBrowser() throws InterruptedException {
		  
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
	  @BeforeMethod
	  public void beforeMethod()  throws InterruptedException {
		  
	System.setProperty("webdriver.Chrome.driver","C:\\selenium_driver\\ChromeDriver.exe");
		  
		  driver = new ChromeDriver();
		  
		   
		  //To launch the url 
		  driver.get(" https://letskodeit.teachable.com/p/practice");
		  
		  
		  //To maximize the browser
		  driver.manage().window().maximize();	
		  
		  
		  //To automate the url
		  
		   WebElement Urllink=driver.findElement(By.xpath("//*[@id=\"block-1069048\"]/div/div/div/h1[2]/a"));
		   Urllink.click();
		   
		  //Selecting the radiobutton
		   
		  	WebElement radio1=driver.findElement(By.id("bmwradio"));
		  	
		  	radio1.click();
		  	
		  	System.out.println(radio1.isSelected());
		  	
		  	//Selecting the 1st Checkbox
		  	WebElement Checkbox1=driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]"));
		  	Checkbox1.click();
		  	
		  	
		  	System.out.println(Checkbox1.isSelected());
		  	
		  	//Selecting the 2nd Checkbox
		  	WebElement Checkbox2=driver.findElement(By.xpath("//*[@id=\"benzcheck\"]"));
		  	Checkbox2.click();
		  	System.out.println(Checkbox2.isSelected());
		  	
		  	
		  	
		  	
		  	
		  	
		    
		 
		  
		  
	  }

	 
	
	@AfterMethod
	  public void afterMethod() {
		
		
		 driver.close();
		
	  }




	}

