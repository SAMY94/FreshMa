package TestCases;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Support;

public class SupportFunction extends CommonFunctions {
	@Test
	public void support() {
		PageFactory.initElements(driver, Support.class);
		Actions actions = new Actions(driver);
		actions.click(Support.clickSupport).build().perform();
		Support.name.sendKeys("Black");
		Support.mobileNumber.sendKeys("8438981000");
		Support.mailAddress.sendKeys("k.samy94.km@gmail.com");
		Support.commentBox.sendKeys("This is testing purpose only");
		Support.submitButton.click();
		 
	}
}
