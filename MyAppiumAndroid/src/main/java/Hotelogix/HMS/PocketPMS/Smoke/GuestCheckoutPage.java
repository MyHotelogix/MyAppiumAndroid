package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestCheckoutPage {
	
	@FindBy(name="Guest Check-out")
	public static WebElement guestCheckout;
	
	@FindBy(className="android.view.View")
	public static List<WebElement> guestCheckoutListElements;
	
	public static WebElement guestCheckbox;
	
	@FindBy(name=" CHECK-OUT SELECTED ")
	public static WebElement checkoutSelectedLink;
	
	public static CheckoutListPage selectGuestToCheckout()
	{
		try
		{
		
		System.out.println(guestCheckoutListElements.size());
		guestCheckbox = guestCheckoutListElements.get(63);
		
		guestCheckbox.click();
		checkoutSelectedLink.click();
		PageFactory.initElements(Generic.driver, CheckoutListPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new CheckoutListPage();
		
		
	}

}
