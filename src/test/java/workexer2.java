import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class workexer2 {
	@Test
	  public void welcome() {
		  
			//System.out.println("Welcome method");
			Reporter.log("Welcome one");
		  }
@Test
  public void Hello() {
	  
	 // System.out.println("Hello method");
	  Reporter.log("Hello good morning");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Inside before Test");  

  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Inside after Test");
  }
  
  

}
