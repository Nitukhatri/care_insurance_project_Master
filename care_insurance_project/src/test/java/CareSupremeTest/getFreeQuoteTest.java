package CareSupremeTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import CareSupremePage.getFreeQuotePage;
import Utility.careSupremeUtility;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class getFreeQuoteTest extends baseCareSupremeTest {

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		getFreeQuotePageObject = new getFreeQuotePage(driver);
		careSupremeUtilityObject = new careSupremeUtility();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@Then("Section title should be {string}")
	public void section_title_should_be(String ExpectedTitle) {
		careSupremeUtilityObject.validateSectionTitle(getFreeQuotePageObject.sectionTitle, null, ExpectedTitle);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

	@When("User enters Mobile number as {string}")
	public void user_enters_mobile_number_as(String mobileNumber) {
		getFreeQuotePageObject.EnterMobileNumber(mobileNumber);
	}

	@When("Click on Calculate premium")
	public void click_on_calculate_premium() {
		getFreeQuotePageObject.ClickCalculatePremiumBtn();
	}

	@Then("Section select family member title should be {string}")
	public void section_select_family_member_title_should_be(String expectedTitle) {

		String actualTitle = careSupremeUtilityObject.getTextUsingJavaScript("normalize-space(//*[@class='step2 form-step Cr-PreQuote-InsuredDetails']//h2//text()[2])", driver);
		careSupremeUtilityObject.validateSectionTitle(null, actualTitle, expectedTitle);
	}

}
