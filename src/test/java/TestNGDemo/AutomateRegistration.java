package TestNGDemo;


	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class AutomateRegistration{
		WebDriver driver=null;
		
		@Test
	  public void NegRegistration() throws InterruptedException {
			
				//Test Case 1 - Automate User Registration Process
				// Positive Scenario
				// 3. Click on Getstarted link in HomePage
			
				 driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();;
				 
				//4. Click Register .
				driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")).click();
				
				//Username Editbox LOcator
				WebElement usernameedit=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
				
				//Enter Valid username
				
				usernameedit.sendKeys("bhakti");
				Reporter.log("Username Editbox value"+usernameedit.getAttribute("id"));
				Reporter.log("Username Editbox value"+usernameedit.getAttribute("value"));
				Thread.sleep(2000);
				
				//driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
				//Enter Valid password scenario
				//locate password editbox
				
				WebElement Passwordedit=driver.findElement(By.xpath("//*[@id=\"id_password1\"]"));
				Passwordedit .sendKeys("xyzabc");
				Reporter.log("Password editbox value"+Passwordedit.getAttribute("value"));
				
				
				//REenter password field
				
				//locate reenter password field
				WebElement reenterPassword=driver.findElement(By.xpath("//*[@id=\"id_password2\"]"));
				
				//Reenter the password
				reenterPassword.sendKeys("xyzabc");
				Thread.sleep(2000);                  
				Reporter.log("reenterPassword editbox value"+reenterPassword.getAttribute("value"));
				
				//locate Register link
				driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")).click();
				
				//click the reg submit button
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				Thread.sleep(5000);
			

			}

		@Test
		public void Positivescenario() throws InterruptedException {
			
			
			//Test Case 1 - Automate User 
			// 3. Click on Getstarted link in HomePage
		
			 driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
			 
			//4. Click Register .
			 
			 driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")).click();
			
			
			//Username Editbox LOcator
			 
			WebElement usernameedit=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
			
			//Enter Valid username
			
			usernameedit.sendKeys("bhakti");
			Reporter.log("Username Editbox id"+usernameedit.getAttribute("id"));
			Reporter.log("Username Editbox value"+usernameedit.getAttribute("value"));
			
			//Enter Valid username
			
			Thread.sleep(5000);
			//Enter Valid password scenario
			//locate password editbox
			WebElement Passwordedit=driver.findElement(By.xpath("//*[@id=\"id_password1\"]"));
			Passwordedit.sendKeys("xyzabc");
			
			//enable Password field
			Reporter.log("Password editbox value"+Passwordedit.getAttribute("value"));
			Thread.sleep(5000);
			
			//REenter password field
		     //locate reenter password field
			WebElement reenterPassword=driver.findElement(By.xpath("//*[@id=\"id_password2\"]"));
			
			///enable Reenter Password field
			//Reenter the password
			reenterPassword.sendKeys("xyzabc");
			Reporter.log("Reenter Password editbox value  "+reenterPassword.getAttribute("value"));
			
			Thread.sleep(5000);
			Reporter.log("Reenter Password editbox Text  "+reenterPassword.getText());
			
			//locate Register link)
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]")).click();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			Thread.sleep(5000);
			
		}
	  
	  @BeforeMethod
	  
	  public void beforeMethod() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium_driver\\\\chromedriver.exe");
			driver=new ChromeDriver();
			
			// Steps to Automate:
			//  1. Open this url https://dsportalapp.herokuapp.com/
			driver.get("https://dsportalapp.herokuapp.com");
			Reporter.log("The Home Page loaded"+driver.getTitle());
			
			// 2. Click on Get started to land on home page.
			//Maximize the window
			
			driver.manage().window().maximize();
			
			
			//page sleep for 5000ms
			Thread.sleep(5000);

		}

	  @AfterMethod
	  public void afterMethod()throws InterruptedException {
		 
			driver.close();
			driver.quit();
	  }

	}
	

