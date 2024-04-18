package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.selectLocation;

public class locationFunction extends CommonFunctions{
	@Test
public void locationSelection() {
	PageFactory.initElements(driver, selectLocation.class);
	selectLocation.clickContinueButton.click();
//	Thread.sleep(3000);
}
}
