package Utility;

import org.openqa.selenium.*;
import org.testng.Assert;

public class careSupremeUtility {

	
	
	public void validateSectionTitle(WebElement element, String actualTitle,String expectedTitle) {
		
		if(actualTitle==null && element!=null)
		{
			actualTitle = element.getText();
		}
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public String getTextUsingJavaScript(String xpath, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("return document.evaluate(\"" + xpath + "\", document, null, XPathResult.STRING_TYPE, null).stringValue;");
    }
	
	
	
}
