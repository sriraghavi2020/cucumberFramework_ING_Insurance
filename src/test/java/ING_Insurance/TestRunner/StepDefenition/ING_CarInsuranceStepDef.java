package ING_Insurance.TestRunner.StepDefenition;

import org.openqa.selenium.WebDriver;

import ING_Insurance.Pages.ING_CarInsurancePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ING_CarInsuranceStepDef {

	ING_CarInsurancePage carinsPage;
	WebDriver driver;
	//@SuppressWarnings("unused")
	private WDManager wdManager;
	
	public ING_CarInsuranceStepDef(WDManager wdManager) {
		this.wdManager = wdManager;
	}
	
	@Given("^User is on home page$")
	public void user_is_on_home_page() {
		driver = wdManager.getDriver();
		carinsPage = new ING_CarInsurancePage(driver);
		carinsPage.getting_homePage_Title();
	}
	@Then("^User goes for car insurance$")
	public void user_goes_for_car_insurance() {
		carinsPage.toCarInsPage();
	}
	@Then("^User start with get a quote$")
	public void user_start_with_get_a_quote() {
		carinsPage.startingProsses();
	}
	@Then("^User Agree and Continues to next step$")
	public void user_Agree_and_Continues_to_next_step() {
		carinsPage.agreeAndContinue();
	}
	@Then("^User enters postcode and address$")
	public void user_enters_postcode_and_address(DataTable Address){
		carinsPage.addressOfCar(Address);
	}
	@Then("^User enter car registration details$")
	public void user_enter_car_registration_details(DataTable regDetails) {
		carinsPage.VehicleRegistration(regDetails);
	}
	@Then("^User (.*) the registered car details and store the car details in (.*)$")
	public void user_the_registered_car_details_and_store_the_car_details_in(String confirmation, String filePath) {
		carinsPage.regCarConfirmation(confirmation, filePath);
	}
	@Then("^User gives (.*) for factor option$")
	public void user_gives_for_factor_option(String option) {
		carinsPage.FactorOption(option);
	}
	@Then("^User select (.*) for NonStandard Accessories$")
	public void user_select_for_NonStandard_Accessories(String option) {
		carinsPage.Non_StandardAccessories(option);
	}
	@Then("^User selects (.*) for modification$")
	public void user_selects_for_modification(String option) {
		carinsPage.Modifications(option);
	}
	@Then("^User select (.*) as the level of cover$")
	public void user_select_as_the_level_of_cover(String option) {
		carinsPage.level_of_Cover(option);
	}
	@Then("^User select (.*) as the parking place at night$")
	public void user_select_as_the_parking_place_at_night(String option) {
		carinsPage.parkingAtNight(option);
	}
	@Then("^User select (.*) for unrepaired damage$")
	public void user_select_for_unrepaired_damage(String option) {
		carinsPage.accident_Or_Haildamage(option);
	}
	@Then("^User select (.*) for the usage of the car$")
	public void user_select_for_the_usage_of_the_car(String option) {
		carinsPage.usageOfCar(option);
	}
	@Then("^User selects (.*) as the average used kilometers$")
	public void user_selects_as_the_average_used_kilometers(String option) {
		carinsPage.averageNoKilometers(option);
	}
	@Then("^User selects (.*) for loan on car$")
	public void user_selects_for_loan_on_car(String option) {
		carinsPage.LoanOnCar(option);
	}
	@Then("^User gives the deatils of policy holder$")
	public void user_gives_the_deatils_of_policy_holder(DataTable phDetails) {
		carinsPage.policyHolderDetails(phDetails);
	}
	@Then("^User selects (.*) for policy holder to be the relular driver$")
	public void user_selects_for_policy_holder_to_be_the_relular_driver(String option) {
		carinsPage.PHisRD(option);
	}
	@Then("^User (.*) the customer number page$")
	public void user_the_customer_number_page(String option) {
		carinsPage.customerNumber(option);
	}
	@Then("^User select (.*) for comprehensive loan in last 12 months$")
	public void user_select_for_comprehensive_loan_in_last_12_months(String option) {
		carinsPage.comprehensiveLoan(option);
	}
	@Then("^User selects (.*) for years of comprehensive car insurance$")
	public void user_selects_for_years_of_comprehensive_car_insurance(String option) {
		carinsPage.comprehensiveCarInsuranceYear_motorInsuranceClaim(option);
	}
	@Then("^User selects (.*) for years of motor insurance claims$")
	public void user_selects_for_years_of_motor_insurance_claims(String Option) {
		carinsPage.comprehensiveCarInsuranceYear_motorInsuranceClaim(Option);
	}
	@Then("^User selects (.*) for current Rating Discount for regular driver$")
	public void user_selects_for_current_Rating_Discount_for_regular_driver(String option) {
	carinsPage.ratingDiscount(option);	
	}
	@Then("^User selects (.*) for registered owner of another car$")
	public void user_selects_for_registered_owner_of_another_car(String option) {
		carinsPage.registerOwnerOfAnotherCar(option);
	}
	@Then("^User selects (.*) for owning a home$")
	public void user_selects_for_owning_a_home(String option) {
		carinsPage.ownHome(option);
	}
	@Then("^User selects (.*) for other driver younger the relugar driver$")
	public void user_selects_for_other_driver_younger_the_relugar_driver(String option) {
		carinsPage.anyYoungerDriv(option);
	}
	@Then("^User selects (.*) as age restriction$")
	public void user_selects_as_age_restriction(String option) {
		carinsPage.driverAgeRestriction(option);
	}
	@Then("^User select the start date of the policy as (.*) of (.*)$")
	public void user_select_the_start_date_of_the_policy_as_of(String policyDate, String policyMonth) {
		carinsPage.PolicyStartDate(policyDate, policyMonth);
	}
	@Then("^User gives (.*) as his email$")
	public void User_gives_as_his_email(String email) {
		carinsPage.emailAddress(email);
	}
	@Then("^User recives the quote number and prices for monthl yearly and forthnightly (.*)$")
	public void User_recives_the_quote_number_and_prices_for_monthl_yearly_and_forthnightly(String filepath) {
		carinsPage.qouteNumberAndPices(filepath);
	}
	//@Then("^$")
	//public void
	
}
