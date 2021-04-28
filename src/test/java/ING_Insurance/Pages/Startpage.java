package ING_Insurance.Pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ING_Insurance.BasePack.baseClass;

public class Startpage extends baseClass{
	
	@FindBy(xpath = "//img[@class='logo-ing-direct']")
	WebElement homeLogo;
	
	
	public Startpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,  this);
	}
	
	public void Assertion_title_Of_Star_Page(String title) {
		String ActualTitle =driver.getTitle();
		Assert.assertEquals(ActualTitle, title);
	}
	
	
	public void Assertion_On_Logo(String title) {
		homeLogo.click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		ThreadSleep(5000);
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, title);
	}
	

}
