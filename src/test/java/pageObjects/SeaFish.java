package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeaFish {
	@FindBy(xpath = "//a[@href='https://www.freshma.in/sea-fish']")
	public static WebElement clickSeaFish;
	@FindBy(xpath = "//a[@href='https://www.freshma.in/sea-fish/seer-fish-vanjaram']//following::img[@alt='Seer Fish / Vanjaram / Nei Meen']")
	public static WebElement seerFishImage;
	

}
