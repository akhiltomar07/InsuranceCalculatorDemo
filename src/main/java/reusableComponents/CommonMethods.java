package reusableComponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	//get dropdown options as list of string for compare
		public List<String> getDropDownOptionsAsList(WebElement element) {
			Select os = new Select(element);
			List<WebElement> list_webElement_model = os.getOptions();
			List<String> actualContents = new ArrayList<String>();
			
			for (WebElement ref : list_webElement_model) {
				actualContents.add(ref.getText());
			}
			return actualContents;
		}

}
