import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class fbloginTest {

		
		@Test
		public void dologin(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());

		}

}
