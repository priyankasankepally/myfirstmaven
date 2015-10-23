

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Errorcollector.ErrorCollector;


public class fbloginTest {

		//public static Errorcollector.ErrorCollector ec = new Errorcollector.ErrorCollector();
		@Test
		public static void dologin(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		String Actual = "Google";
		try{
Assert.assertEquals(Actual, driver.getTitle());
		}
		catch(Throwable t){

		ErrorCollector.addVerificationFailure(t);
		
		}
		

		}

}
