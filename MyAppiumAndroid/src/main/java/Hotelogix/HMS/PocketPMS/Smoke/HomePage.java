package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(name="RESERVE")
	public static WebElement reserveLink;
	
	@FindBy(name="CHECK-OUT")
	public static WebElement checkoutLink;
	
	public static SelectRoomPage clickOnReserve()
	{
		try
		{
			reserveLink.click();
			System.out.println("Clickon Reserve link");
			PageFactory.initElements(Generic.driver, SelectRoomPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new SelectRoomPage();
	}
	
	public static CheckoutListPage clickOnCheckout()
	{
		try
		{
		checkoutLink.click();
		PageFactory.initElements(Generic.driver, CheckoutListPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new CheckoutListPage();
	}

}
