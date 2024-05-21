package Utility;

import org.openqa.selenium.*;
import org.testng.Assert;

public class careSupremeUtility {

	
	
	public void validateSectionTitle(WebElement element, String ExpectedTitle) {
		String ActualTitle = element.getText();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	
	
	
}
