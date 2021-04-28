package ING_Insurance.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ING_Insurance.BasePack.baseClass;

public class ING_HomePage extends baseClass{

public Properties propTitle;

@FindBy(xpath="//div[@class='login-button login']")
WebElement login;
@FindBy(xpath="//a[@data-target='#submenu-insurance']")
WebElement insuranceBtn;
@FindBy(xpath="//span[contains(text(), 'ING Car Insurance')]")
WebElement carInsurance;
@FindBy(xpath="//span[contains(text(), 'ING Home and Contents Insurance')]")
WebElement homeContantInsurance;
@FindBy(xpath="//p[contains(text(), 'Jump-start your ING Car Insurance today and save up to 15% online on new policies.')]")
WebElement carInsurancePage;
@FindBy(xpath="//p[contains(text(), 'Breathe easier knowing your biggest assets are comprehensively protected.')]")
WebElement homeContantInsurancePage;
@FindBy(xpath = "//div[@class='main-logo style-scope ing-header-content']")
WebElement homeLogo;


	public ING_HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void drivingExcpectedPageTitle() {
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ING_Insurance\\Pages\\PageTitle.properties");
			propTitle = new Properties();
			propTitle.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void click_On_Login_Button() {
		login.click();
	}
	
	public void assertion_Of_Title(String title) {
		ThreadSleep(1000);
		String ActualTitle = driver.getTitle();
		switch(title) {
		case "login page":
			Assert.assertEquals(propTitle.getProperty("BankLogin"), ActualTitle);
			homeLogo.click();
			break;
		case "car insurance":
			Assert.assertEquals(propTitle.get("carInsurance"), ActualTitle);
			break;
		case "home and content insurance":
			Assert.assertEquals(propTitle.get("HomeContentPage"), ActualTitle);
			break;
		}
		
		//homeLogo.click();
		
	}
	
	
	public void click_insurance_button() {
		insuranceBtn.click();
	}
	
	public void toCarInsurance() {
		carInsurance.click();
		carInsurancePage.click();
	}
	
	public void toHomeContentInsurance() {
		homeContantInsurance.click();
		homeContantInsurancePage.click();
		
	}
}
