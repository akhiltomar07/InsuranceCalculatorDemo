package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.EnterInsurantDataPage;
import pageObjects.EnterVehicleDataPage;
import pageObjects.HomePageObjects;
import reusableComponents.PropertiesOperations;

public class TestBase extends ObjectsRepo{
	
	
	public void LaunchBrowserANDNavigate()
	{
		//launch browser
		//navigate url
		
		String browser=PropertiesOperations.getPropertyValueByKey("browser");
		String url=PropertiesOperations.getPropertyValueByKey("url");
		
		//String browser ="chrome";
		
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options =new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions foptions=new FirefoxOptions();
			foptions.addArguments("-private");
			driver = new FirefoxDriver(foptions);
		}
		if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			InternetExplorerOptions iOptions=new InternetExplorerOptions();
			iOptions.addCommandSwitches("-private");
			driver = new InternetExplorerDriver(iOptions);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		
	}
	
	@BeforeTest
	public void setupMethod() {
		 LaunchBrowserANDNavigate();
		 homepage= new HomePageObjects();
		 insurantdatapage= new EnterInsurantDataPage();
		 vehicledatapage= new EnterVehicleDataPage();
		 
	}
	@AfterTest
	public void cleanUp() {
		driver.quit();
	}

}
