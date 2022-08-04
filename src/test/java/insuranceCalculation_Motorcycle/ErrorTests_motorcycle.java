package insuranceCalculation_Motorcycle;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class ErrorTests_motorcycle extends TestBase {
	
	@Test(enabled=false)
	public void errorMessage_PayLoadField()
	{
		homepage.clickMotorCycleLink();
		vehicledatapage.enterCyclinderCapacity("3333");
	    test.log(Status.PASS, "Cyclinder Capacity is filled with data:  33333");
		String actualErrorMessage=vehicledatapage.getErrorMessageOnCyclinderCapacity();
		String expectedErrorMessage="Must be a number between 1 and 2000";
		
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message is not as expected ");
		
		
		
	}
	
	@Test(enabled=false)
	public void errorMessage_PayLoadField1()
	{
		homepage.clickMotorCycleLink();
		vehicledatapage.enterCyclinderCapacity("3333");
	    test.log(Status.PASS, "Cyclinder Capacity is filled with data:  33333");
		String actualErrorMessage=vehicledatapage.getErrorMessageOnCyclinderCapacity();
		String expectedErrorMessage="Must be a number between 1 and 3000";
		
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message is not as expected ");
		
		
	}
	
	
	@Test(enabled=true)
	public void verifyModelDropDownOptions()
	{
		homepage.clickMotorCycleLink();
		List<String> actualValues = vehicledatapage.getDropdownOption_model();
		test.log(Status.INFO, "Actual dd contents for model dd is: " +actualValues);
		List<String> expectedValues = Arrays.asList("– please select –", "Scooter", "Three-Wheeler", "Moped", "Motorcycle");
		test.log(Status.INFO, "Expected dd contents for model dd is: " +expectedValues);
		Assert.assertEquals(actualValues, expectedValues, "Error in Dropdown options compare at Model Dropdown");
		
		
	}
	
	
	
	
	

}
