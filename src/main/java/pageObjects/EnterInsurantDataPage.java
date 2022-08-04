package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class EnterInsurantDataPage extends TestBase {
	
	public EnterInsurantDataPage() {
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(id = "firstname")
	WebElement FirstName;

	@FindBy(id = "lastname")
	WebElement LastName;

	@FindBy(id = "birthdate")
	WebElement dob;
	
	@FindBy(xpath = "//input[@name='Gender']/parent::label")
	List<WebElement> rdo_Gender;
	
	@FindBy(id = "make")
	WebElement txt_streetaddress;

	@FindBy(id = "country")
	WebElement country;

	@FindBy(id = "zipcode")
	WebElement zipcode;

	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "occupation")
	WebElement occupation;
	
	@FindBy(xpath = "//input[@name='Hobbies']/parent::label")
	List<WebElement> rdo_Hoobies;
	
	@FindBy(id = "website")
	WebElement website;
	
	@FindBy(id = "make")
	WebElement picture;
	
	@FindBy(id = "make")
	WebElement btn_previous;
	
	@FindBy(id = "make")
	WebElement btn_next;


	
	

}
