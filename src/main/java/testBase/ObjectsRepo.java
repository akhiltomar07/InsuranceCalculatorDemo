package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.EnterInsurantDataPage;
import pageObjects.EnterVehicleDataPage;
import pageObjects.HomePageObjects;
import reusableComponents.CommonMethods;

public class ObjectsRepo  {
	
	public static WebDriver driver;
	
	public static HomePageObjects homepage;
	public static EnterInsurantDataPage insurantdatapage;
	public static EnterVehicleDataPage vehicledatapage;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public CommonMethods cm= new CommonMethods();
	
	
	
	
	
	
}
