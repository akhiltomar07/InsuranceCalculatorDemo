package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects extends TestBase {

	public HomePageObjects() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "nav_automobile")
	WebElement link_automobile;

	@FindBy(id = "nav_truck")
	WebElement link_truck;

	@FindBy(id = "nav_camper")
	WebElement link_camper;

	@FindBy(id = "nav_motorcycle")
	WebElement link_motorcycle;
	
	
	public void clickMotorCycleLink()

	{
		link_motorcycle.click();
		
	}
	
	
	
	
	

}
