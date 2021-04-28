package ING_Insurance.TestRunner.StepDefenition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WDManager{
		private WebDriver driver;
		public Properties prop;
	
	//@Before
    public void browserSetup(){
		try {
	        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ING_Insurance\\BasePack\\configuration.properties");
	        prop = new Properties();
	        prop.load(file);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	
        String browser = prop.getProperty("browser");
        switch(browser) {
        case "chrome":
        	 WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
             break;
        case "Firefox":
        	 WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
             break;
        case "MicrosoftEdge":
        	 WebDriverManager.edgedriver().setup();
             driver= new EdgeDriver();
        }

       
        driver.get(prop.getProperty("homeURL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public WebDriver getDriver() {
    	return driver;
    }
    
   // @After
    public void browserClosure() {
    	if(driver !=null) {
    		driver.close();
        	driver.quit();
    	}

}
}
