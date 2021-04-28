package ING_Insurance.TestRunner.StepDefenition;

import org.openqa.selenium.WebDriver;

import ING_Insurance.Pages.ING_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ING_HomePageStepDef {
	
	ING_HomePage homepage;
	
	WebDriver driver;
	private WDManager wdManager;
	
	public ING_HomePageStepDef(WDManager wdManager) {
		this.wdManager = wdManager;
	}
	
	
	@Given("^User is in home page$")
	public void user_is_in_home_page() {
		driver = wdManager.getDriver();
		homepage = new ING_HomePage(driver);
		
	}
	@Then ("^User goes to bank login page$") 
	public void user_goes_to_bank_login_pages() {
		homepage.click_On_Login_Button();
	}
	@Then ("^Asserting the page title for (.*)$") 
	public void asserting_the_page_title_for(String title) {
		homepage.drivingExcpectedPageTitle();
		homepage.assertion_Of_Title(title);
	}
	@Then ("^Testing insurance division$")
	public void testing_insurance_divisiovn() {
		homepage.click_insurance_button();
	}
	@Then("^User goes to car insurance$")
	public void user_goes_to_car_insurance() {
		homepage.toCarInsurance();
	}
	@Then("^User goes to homeContent insurance$")
	public void user_goes_to_homeContent_insurance() {
		homepage.click_insurance_button();
		homepage.toHomeContentInsurance();
	}
		

}
