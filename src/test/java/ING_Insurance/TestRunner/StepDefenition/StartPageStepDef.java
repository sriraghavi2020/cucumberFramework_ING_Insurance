package ING_Insurance.TestRunner.StepDefenition;

import org.openqa.selenium.WebDriver;

import ING_Insurance.Pages.Startpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StartPageStepDef {

	WebDriver driver;
	
	private WDManager wdManager;
	
	public StartPageStepDef(WDManager wdManager) {
		this.wdManager = wdManager;
	}
	public Startpage startpage;
	
	@Given("^User is in start page for insurance$")
	public void user_is_in_start_page_for_insurance() {
		driver = wdManager.getDriver();
		startpage =  new Startpage(driver);
	}
	
	@Then("^Title of the start page is (.*)$")
	public void title_of_the_start_page_is(String title) {
		startpage.Assertion_title_Of_Star_Page(title);
	}
	@Then("^Logo in start page is direct to (.*)$")
	public void logo_in_start_page_is_direct_to(String title) {
		startpage.Assertion_On_Logo(title);
	}

}
