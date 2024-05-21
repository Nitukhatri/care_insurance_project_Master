package CareSupremeTest;

import org.openqa.selenium.chrome.ChromeDriver;

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
		careSupremeUtilityObject.validateSectionTitle(getFreeQuotePageObject.sectionTitle, ExpectedTitle);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	@When("User enters Mobile number as {string}")
	public void user_enters_mobile_number_as(String string) {

	}

	@When("Click on Calculate premium")
	public void click_on_calculate_premium() {

	}

	@Then("Error Message should be {string}")
	public void error_message_should_be(String string) {

	}

	@Then("Enter Mobile Number color should be change into Red #ff0000")
	public void enter_mobile_number_color_should_be_change_into_red_ff0000() {

	}

}
