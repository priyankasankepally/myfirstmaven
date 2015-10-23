import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class fbloginTest {

		
		@Test
		public void dologin(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		String Actual = "facebook";
		try{
Assert.assertEquals(Actual, driver.getTitle());
		}
		catch(Throwable t){
			
			System.out.println(t.getMessage());
		}

		}

}
