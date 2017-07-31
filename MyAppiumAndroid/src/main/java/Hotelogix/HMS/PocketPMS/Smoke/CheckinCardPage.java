package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckinCardPage {
	
	@FindBy(name=" PRINT")
	public static WebElement printBtn;
	
	public static boolean result=false;
	
	public static void confirmingResult()
	{
		result=false;
		if(printBtn.isDisplayed())
		{
			result=true;
		}
		Assert.assertEquals(result, true);
	}

}
