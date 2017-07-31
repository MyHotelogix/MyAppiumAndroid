package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FolioListPage {
	
	@FindBy(name=" CONTINUE TO CHECK-OUT ")
	public static WebElement continueLink;
	
	public static GuestCheckoutPage clickOnContinueToCheckout()
	{
		try
		{
		continueLink.click();
		PageFactory.initElements(Generic.driver, GuestCheckoutPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new GuestCheckoutPage();
	}

}
