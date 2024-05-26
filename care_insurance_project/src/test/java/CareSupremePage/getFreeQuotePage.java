package CareSupremePage;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class getFreeQuotePage {

	WebDriver driver;

	public getFreeQuotePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "mobile_no")
	public WebElement Mobileno;

	@FindBy(xpath = "//button[@class='btn_sticky_mobile btn_custom quote_btn custum_common_btn']")
	public WebElement CalculatePremium;

	@FindBy(xpath = "//div[@class='stepper_border']")
	public WebElement sectionTitle;
	
	
	@FindBy(xpath = "//*[@class='step2 form-step Cr-PreQuote-InsuredDetails']//h2//text()[2]")
	public WebElement selectFamilyMemberTitle;
	
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//     String xpath = "//*[@class='step2 form-step Cr-PreQuote-InsuredDetails']//h2//text()[2]";
//     public String textContent = (String) js.executeScript("return document.evaluate(\"" + xpath + "\", document, null, XPathResult.STRING_TYPE, null).stringValue;");
//   


	
	   
	
	public void EnterMobileNumber(String number) {
		Mobileno.sendKeys(number);
	}

	public void ClickCalculatePremiumBtn() {
		CalculatePremium.click();
	}
	

}
