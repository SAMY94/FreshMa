package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.StoreLocator;

public class storeLocatorFunction extends CommonFunctions{
	@Test
public void storeLocator(){
	PageFactory.initElements(driver, StoreLocator.class);
	StoreLocator.clickStoreLocator.click();
}

}
