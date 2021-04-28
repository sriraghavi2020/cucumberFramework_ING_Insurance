package ING_Insurance.BasePack;


import org.openqa.selenium.WebDriver;

public class baseClass {
	public WebDriver driver;
	


	public baseClass(WebDriver driver) {
		this.driver = driver;
	}


	public void ThreadSleep(int timeUnit) {

		try {
			Thread.sleep(timeUnit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	

}
