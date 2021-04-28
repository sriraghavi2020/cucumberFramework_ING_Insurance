package ING_Insurance.Pages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import ING_Insurance.BasePack.baseClass;
import io.cucumber.datatable.DataTable;

public class ING_CarInsurancePage extends baseClass{
	
	@FindBy(xpath="//a[@title= 'Insurance']")
	WebElement insuranceBtn;
	@FindBy(xpath="//span[contains(text(), 'ING Car Insurance')]")
	WebElement carInsuranceLink;
	@FindBy(xpath="//h6[contains(text(), 'ING Car Insurance')]")
	WebElement carInsuranceLinkSub;
	@FindBy(xpath="//a[contains(text(), 'Get a quote')]")
	List<WebElement> getQuote;
	@FindBy(xpath="//button[@data-role='button-agree']")
	WebElement agreeBtn;
	@FindBy(id="postcode")
	WebElement postCode;
	@FindBy(id="address-typeahead")
	WebElement addrBar;
	@FindBy(xpath= "//span[contains(text(), 'Branagan Drive')]")
	WebElement addrBranagan;
	@FindBy(xpath= "//button[@type= 'submit']")
	WebElement nxtBtn;
	@FindBy(id="state")
	WebElement regState;
	@FindBy(id= "plateNumber")
	WebElement regplateNumber;
	@FindBy(id= "detailsButton")
	WebElement regManualSearch;
	@FindBy(xpath="//button[@ng-click='$ctrl.yesThisIsMyCar()']")
	WebElement regCarConfirmation;
	@FindBy(xpath="//button[@ng-click='$ctrl.noThisIsNotMyCar()']")
	WebElement regCarDenys;
	@FindBy(xpath="//h3[@class='ng-binding']")
	WebElement carName;
	@FindBy(xpath="//h4[@class='summary-details__title']")
	List<WebElement> carDetails_Title;
	@FindBy(xpath="//p[@class='summary-details__value ng-binding']")
	List<WebElement> carDetails;
	@FindBy(xpath="//label[@for='factoryOptionHOND08LW']")
	WebElement FactoryOption;
	@FindBy(xpath="//button[@data-role='button-next']")
	WebElement FactoryOption_No;
	@FindBy(xpath="//button[@value='NO']")
	WebElement NoBtn;
	@FindBy(xpath="//button[@value='YES']")
	WebElement YesBtn;
	@FindBy(xpath="//span[@class='icon-car-comprehensive']")
	WebElement comprehensiveCover;
	@FindBy(xpath="//span[@class='icon-car-fire']")
	WebElement carFireCover;
	@FindBy(xpath="//span[@class='icon-car-tpp']")
	WebElement ttpOnlyCover;
	@FindBy(xpath="//button[@value='GARAGE']")
	WebElement nightParGarage;
	@FindBy(xpath="//button[@value='DRIVEWAY']")
	WebElement nightParDriveway;
	@FindBy(xpath="//button[@value='CARPORT']")
	WebElement nightParCarport;
	@FindBy(xpath="//button[@value='STREET']")
	WebElement nightParStreet;
	@FindBy(xpath="//button[@value='PRIVATE_PROPERTY']")
	WebElement nightParPrivateProp;
	@FindBy(xpath="//button[@value='LOCKED_COMPOUND']")
	WebElement nightParLockedComp;
	@FindBy(xpath="//button[@value='CAR_PARK']")
	WebElement nightParCarPark;
	@FindBy(xpath="//button[@value='PARKING_LOT']")
	WebElement nightParParkLot;
	@FindBy(xpath="//button[@value='GOOD_CONDITION_WITH_NO_EXISTING_DAMAGE']")
	WebElement NoDamage;
	@FindBy(xpath="//button[@value='HAIL_DAMAGE']")
	WebElement HailDamage;
	@FindBy(xpath="//button[@value='ACCIDENT_DAMAGE']")
	WebElement AccidentDamage;
	@FindBy(xpath="//button[@value='HAIL_AND_ACCIDENT_DAMAGE']")
	WebElement AccidHailDamage;
	@FindBy(xpath="//button[@value='PRIVATE_ONLY']")
	WebElement UsagePrivate;
	@FindBy(xpath="//button[@value='PRIVATE_AND_BUSINESS']")
	WebElement UsagePrivateOccBusi;
	@FindBy(xpath="//button[@value='BUSINESS_EXCLUDING_COMMERCIAL']")
	WebElement UsagePrivateBusi;
	@FindBy(xpath="//button[@value='LESS_THAN_5000_PER_YEAR']")
	WebElement avgKilo5000;
	@FindBy(xpath="//button[@value='FROM_5001_TO_8000_PER_YEAR']")
	WebElement avgKilo8000;
	@FindBy(xpath="//button[@value='FROM_12001_TO_15000_PER_YEAR']")
	WebElement avgKilo15000;
	@FindBy(xpath="//button[@value='FROM_20001_TO_25000_PER_YEAR']")
	WebElement avgKilo25000;
	@FindBy(xpath="//button[@value='NONE']")
	WebElement LoanNoBtn;
	@FindBy(xpath="//button[@value='HIRE_PURCHASE']")
	WebElement LoanYesBtnHire;
	@FindBy(xpath="//button[@value='LEASE']")
	WebElement LoanYesBtnLease;
	@FindBy(xpath="//select[@id='title']")
	WebElement PHTitile;
	@FindBy(xpath="//input[@name='firstName']")
	WebElement PHFirstname;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement PHSurname;
	@FindBy(xpath="//input[@id='day']")
	WebElement PHDOBDate;
	@FindBy(xpath="//input[@id='month']")
	WebElement PHDOBMonth;
	@FindBy(xpath="//input[@id='year']")
	WebElement PHDOBYear;
	@FindBy(xpath="//button[@value='0']")
	WebElement CINone;
	@FindBy(xpath="//button[@value='1']")
	WebElement CI1;
	@FindBy(xpath="//button[@value='2']")
	WebElement CI2;
	@FindBy(xpath="//button[@value='3']")
	WebElement CI3;
	@FindBy(xpath="//button[@value='4']")
	WebElement CI4;
	@FindBy(xpath="//button[@value='5']")
	WebElement CI5;
	@FindBy(xpath="//button[@value='RATING_1']")
	WebElement ratingDis1;
	@FindBy(xpath="//button[@value='RATING_2']")
	WebElement ratingDis2;
	@FindBy(xpath="//button[@value='RATING_3']")
	WebElement ratingDis3;
	@FindBy(xpath="//button[@value='RATING_4']")
	WebElement ratingDis4;
	@FindBy(xpath="//button[@value='RATING_5']")
	WebElement ratingDis5;
	@FindBy(xpath="//button[@value='RATING_6']")
	WebElement ratingDis6;
	@FindBy(xpath="//button[@value='ANY_DRIVER']")
	WebElement ageRestrictionAny;
	@FindBy(xpath="//button[@value='DRIVERS_OVER_21']")
	WebElement ageRestriction21;
	@FindBy(xpath="//button[@value='DRIVERS_OVER_25']")
	WebElement ageRestriction25;
	@FindBy(xpath="//button[@value='DRIVERS_OVER_30']")
	WebElement ageRestriction30;
	@FindBy(xpath="//button[@ng-click='move(1)']")
	WebElement nxtBtnCalender;
	@FindBy(xpath="//strong[@class='ng-binding']")
	WebElement monthNameInCalender;
	@FindBy(xpath="//span[contains(text(), '15')]")
	WebElement dateInCalender;
	@FindBy(xpath="//input[@id= 'email']")
	WebElement email;
	@FindBy(xpath="//h4[@class= 'quote-number']")
	WebElement quoteNumb;
	@FindBy(xpath="//input[@class='price-column__tab-input']")
	List<WebElement> quotePriceTitle;
	@FindBy(xpath="//h2[@class='price-column__price']")
	List<WebElement> quotePrices;
	
	


	


	

	public ING_CarInsurancePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void getting_homePage_Title() {
		System.out.println(driver.getTitle());
	}
	
	
	public void toCarInsPage() {
		insuranceBtn.click();
		carInsuranceLink.click();
		carInsuranceLinkSub.click();
	}
	
	
	public void startingProsses() {
		getQuote.get(0).click();
		ThreadSleep(10000);
    }

	
	public void agreeAndContinue() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		agreeBtn.click();
	}
	
	
	public void addressOfCar(DataTable address) {
		List<Map<String, String>> addr = address.asMaps();
		postCode.sendKeys(addr.get(0).get("PostCode"));
		ThreadSleep(800);
		addrBar.sendKeys(addr.get(0).get("Address"));
		ThreadSleep(1000);
		addrBranagan.click();
		nxtBtn.click();
		//ThreadSleep(5000);
	}
	
	
	public void VehicleRegistration(DataTable regDetails) {
		List<Map<String, String>> regDet = regDetails.asMaps();
		Select select = new Select(regState);
		switch(regDet.get(0).get("State")) {
		case "ACT":
			select.selectByValue("ACT");
			break;
		case "NSW":
			select.selectByValue("NSW");
			break;
		case "NT":
			select.selectByValue("NT");
			break;
		case "QLD":
			select.selectByValue("QLD");
			break;
		case "SA":
			select.selectByValue("SA");
			break;
		case "VIC":
			select.selectByValue("VIC");
			break;
		case "TAS":
			select.selectByValue("TAS");
			break;
		case "WA":
			select.selectByValue("WA");
			break;
		}
		regplateNumber.sendKeys(regDet.get(0).get("RegNum"));
		nxtBtn.click();
		//ThreadSleep(5000);
	}
	
	
	public void regCarConfirmation(String confirmation, String filePath) {
		
		try {
			File file= new File(System.getProperty("user.dir")+filePath);
			FileOutputStream fileIO = new FileOutputStream(file);
			PrintWriter pr =new PrintWriter(fileIO);
			pr.println("Car Name: "+carName.getText());
			for(int i=0; i<4; i++) {
				pr.println(carDetails_Title.get(i).getText()+": "+carDetails.get(i).getText());
			}
			pr.flush();
			pr.close();
				fileIO.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(confirmation.equals("confirms")) {
			regCarConfirmation.click();
		}else if(confirmation.equals("denys")){
			regCarDenys.click();	
		}
		//ThreadSleep(5000);
	}
	
	
	public void FactorOption(String option) {
		FactoryOption.click();
		if(FactoryOption.isSelected()) {
			Assert.assertEquals("Next", FactoryOption_No.getText());
			FactoryOption.click();
			
		}
		if(option.equals("No")) {
		FactoryOption_No.click();
		}
	}
	
	
	public void Non_StandardAccessories(String option) {
		if(option.equals("Yes")) {
			YesBtn.click();
		}else {
			NoBtn.click();
		}
	}
	
	
	public void Modifications(String option) {
		if(option.equals("Yes")) {
			YesBtn.click();
		}else {
			NoBtn.click();
		}
	}
	
	
	public void level_of_Cover(String option) {
		switch(option) {
		case "Comprehensive":
			comprehensiveCover.click();
			break;
		case "carOnFire":
			carFireCover.click();
			break;
		case "ttpOnly":
			ttpOnlyCover.click();
			break;
		}
		//ThreadSleep(5000);
	}
	
	
	public void parkingAtNight(String option) {
		switch(option) {
		case "Garage":
			nightParGarage.click();
			break;
		case "DriveWay":
			nightParDriveway.click();
			break;
		case "Carport":
			nightParCarport.click();
			break;
		case "Street":
			nightParStreet.click();
			break;
		case "On Private Party":
			nightParPrivateProp.click();
			break;
		case "Locked compound":
			nightParLockedComp.click();
			break;
		case "Car Park":
			nightParCarPark.click();
			break;
		case "Parking lot":
			nightParParkLot.click();
			break;
		}
	}
	
	
	public void accident_Or_Haildamage(String option) {
		switch(option) {
		case "No Damage":
			NoDamage.click();
			break;
		case "Hail Damage":
			HailDamage.click();
			break;
		case "Accident Damage":
			AccidentDamage.click();
			break;
		case "Accident and Hail Damage":
			AccidHailDamage.click();
			break;
		}
	}
	
	
	public void usageOfCar(String option) {
		switch(option) {
		case "Private":
			UsagePrivate.click();
			break;
		case "Private and Occational Business":
			UsagePrivateOccBusi.click();
			break;
		case "Private and Business":
			UsagePrivateBusi.click();
			break;
		}
	}
	
	
	public void averageNoKilometers(String option) {
		switch(option) {
		case "Up to 5000km":
			avgKilo5000.click();
			break;
		case "Up to 8000km":
			avgKilo8000.click();
			break;
		case "Up to 15000km":
			avgKilo15000.click();
			break;
		case "Up to 25000km":
			avgKilo25000.click();
			break;
		}
	}
	
	
	public void LoanOnCar(String option) {
		switch(option) {
		case "No":
			LoanNoBtn.click();
			break;
		case "Yes_Hire":
			LoanYesBtnHire.click();
			break;
		case "Yes_Lease":
			LoanYesBtnLease.click();
			break;
		}
	}
	
	
	public void policyHolderDetails(DataTable PHDetails) {
		
		List<Map<String, String>> phDetails =PHDetails.asMaps();
		Select select = new Select(PHTitile);
		switch(phDetails.get(0).get("Title")) {
		case "Mr":
			select.selectByValue("MR");
			break;
		case "Ms":
			select.selectByValue("MS");
			break;
		case "Miss":
			select.selectByValue("MISS");
			break;
		case "Mrs":
			select.selectByValue("MRS");
			break;
		case "Father":
			select.selectByValue("FATHER");
			break;
		case "Lady":
			select.selectByValue("LADY");
			break;
		case "Madam":
			select.selectByValue("MADAM");
			break;
		case "Sir":
			select.selectByValue("SIR");
			break;
		case "Sister":
			select.selectByValue("SISTER");
			break;
		}
		
		
		PHFirstname.sendKeys(phDetails.get(0).get("Firstname"));
		PHSurname.sendKeys(phDetails.get(0).get("Surname"));
		PHDOBDate.sendKeys(phDetails.get(0).get("DOBDate"));
		PHDOBMonth.sendKeys(phDetails.get(0).get("DOBMonth"));
		PHDOBYear.sendKeys(phDetails.get(0).get("DOBYear"));
		nxtBtn.click();
		//ThreadSleep(10000);
	}
	
	
	public void PHisRD(String option) {
		if(option.equals("Yes")) {
			YesBtn.click();
		}else {
			NoBtn.click();
		}
	}
	
	
	public void customerNumber(String option) {
		if(option.equals("Skip")) {
			nxtBtn.click();
		}
	}
	
	
	public void comprehensiveLoan(String option) {
		if(option.equals("Yes")) {
			YesBtn.click();
		}else {
			NoBtn.click();
		}
	}
	
	
	public void comprehensiveCarInsuranceYear_motorInsuranceClaim(String option) {
		switch(option) {
		case "None":
			CINone.click();
			break;
		case "1":
			CI1.click();
			break;
		case "2":
			CI2.click();
			break;
		case "3":
			CI3.click();
			break;
		case "4":
			CI4.click();
			break;
		case "5":
			CI5.click();
			break;
		}
	}
	
	
	public void ratingDiscount(String option) {
		switch(option) {
		case "Rating 1":
			ratingDis1.click();
			break;
		case "Rating 2":
			ratingDis2.click();
			break;
		case "Rating 3":
			ratingDis3.click();
			break;
		case "Rating 4":
			ratingDis4.click();
			break;
		case "Rating 5":
			ratingDis5.click();
			break;
		case "Rating 6":
			ratingDis6.click();
			break;
			
		}
	}
	
	
	public void registerOwnerOfAnotherCar(String option) {
		if(option.equals("Yes")) {
			YesBtn.click();
		}else {
			NoBtn.click();
		}
	}
	
	
	public void ownHome(String option) {
		if(option.equals("Yes")) {
			YesBtn.click();
		}else {
			NoBtn.click();
		}
	}
	
	
	public void anyYoungerDriv(String option) {
		if(option.equals("Yes")) {
			YesBtn.click();
		}else {
			NoBtn.click();
		}
	}
	
	
	public void driverAgeRestriction(String option) {
		switch(option) {
		case "Any Driver":
			ageRestrictionAny.click();
			break;
		case "Driver above 21":
			ageRestriction21.click();
			break;
		case "Driver above 25":
			ageRestriction25.click();
			break;
		case "Driver above 30":
			ageRestriction30.click();
			break;
		}
	}
	
	
	public void PolicyStartDate(String policySDate, String policySMonth) {
		//ThreadSleep(5000);
		String month= monthNameInCalender.getText();
		if(month.equals(policySMonth)) {
			dateInCalender.click();
		}else {
			nxtBtnCalender.click();
			dateInCalender.click();
		}
		nxtBtn.click();
	}
	
	
	public void emailAddress(String email) {
		this.email.sendKeys(email);
		nxtBtn.click();
		ThreadSleep(5000);
	}
	
	
	public void qouteNumberAndPices(String filePath) {
		try {
			File file= new File(System.getProperty("user.dir")+filePath);
			FileOutputStream fileIO = new FileOutputStream(file);
			PrintWriter pr =new PrintWriter(fileIO);
			pr.println("QuoteNumber: "+quoteNumb.getText());
			for(int i=0; i<3; i++) {
				pr.println(quotePriceTitle.get(i).getAttribute("id")+" payment: "+quotePrices.get(i).getText());
			}
			pr.flush();
			pr.close();
				fileIO.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
