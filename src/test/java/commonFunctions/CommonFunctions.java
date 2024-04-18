package commonFunctions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class CommonFunctions {
	
		public static WebDriver driver = new ChromeDriver();
		@BeforeTest
		public void launchBrowser(){
			
			driver.navigate().to("https://www.freshma.in/");
			driver.manage().window().maximize();	
		}
}

