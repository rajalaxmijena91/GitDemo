package TestNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;


@Test
public class Registration {
	



	private static final CharSequence Hello = null;
	private static final CharSequence Happy = null;
	WebDriver driver = null;
		
  public void  WebElementRegistration() throws InterruptedException 
 
  {
	  
   Thread.sleep(3000);
  
  //Email field
  WebElement usernameedit = driver.findElement(By.name("email"));
  Reporter.log("Username Field is Displayed" + usernameedit.isDisplayed());
  Reporter.log("Username Field is Enabled" + usernameedit.isEnabled());
      
  
   usernameedit.click(); 
   usernameedit.sendKeys("Hello");
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
   driver.findElement(By.name("passwd")).sendKeys("Happy");
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
  driver.get("https://dsportalapp.herokuapp.com/");
  
  Reporter.log("Page is launched successsfully");
  
  //To get the page title
  Reporter.log("Page Title : " + driver.getTitle());
  
  //To get the page url
  Reporter.log("Page Current Url : " + driver.getCurrentUrl());
  
  
  
  //To maximize the browser
  driver.manage().window().maximize();


  
  WebElement GetStartedlink=driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
  
  
  GetStartedlink.click();
  
  WebElement Registerlink=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]"));
  
  Registerlink.click();
  

  WebElement Username=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
  
  
   Username.sendKeys(Hello);


  WebElement Password=driver.findElement(By.xpath("//*[@id=\"id_password1\"]"));


   Password.sendKeys(Happy);

  WebElement Passwordconfirmation=driver.findElement(By.xpath("//*[@id=\"id_password2\"]"));

  Passwordconfirmation.sendKeys(Happy);
  
  
  WebElement Register=driver.findElement(By.xpath("/html/body"));

  Register.click();
  
  
 
  
  Reporter.log("Page is scrolled by pixel");
  
  //Implicit wait
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     Thread.sleep(2000);

  }

  @AfterMethod
@AfterTest
  public void tearDown() throws Exception {
	  
   System.out.println("Inside tearDownTest");
   
  
  //To close the current browser
   driver.close();
   
 //To exit the browser instance
   driver.quit();
     
     
	  
  }
}
