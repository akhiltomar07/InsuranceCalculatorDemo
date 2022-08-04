package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class EnterVehicleDataPage extends TestBase {
	
	public EnterVehicleDataPage() {
		PageFactory.initElements(driver, this);

	}


	@FindBy(id="make")
	WebElement dd_make;

	@FindBy(id="model")
	WebElement dd_model;

	@FindBy(xpath="//input[@id='cylindercapacity']")
	WebElement txt_cylindercapacity;

	@FindBy(xpath = "//input[@id='cylindercapacity']/following-sibling::span[@class='error']")
	WebElement error_cylinderCapacity;

	@FindBy(id="engineperformance")
	WebElement txt_engineperformance;

	@FindBy(id="dateofmanufacture")
	WebElement date_dateofmanufacture;

	@FindBy(id="numberofseatsmotorcycle")
	WebElement dd_numberofseats;

	@FindBy(id="listprice")
	WebElement txt_listprice;

	@FindBy(id="annualmileage")
	WebElement txt_annualmileage;

	@FindBy(id="nextenterinsurantdata")
	WebElement btn_Next;


	
	

	
	public void enterCyclinderCapacity(String cyclinderCap)
	{
		txt_cylindercapacity.sendKeys(cyclinderCap);;
	}
	
	public String getErrorMessageOnCyclinderCapacity()
	{
		return error_cylinderCapacity.getText();
		
	}
	
	public List<String> getDropdownOption_model() {
		return cm.getDropDownOptionsAsList(dd_model);
	}
	

	

}
