package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[4]/a")
	public static WebElement reserveLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[3]/a")
	public static WebElement checkoutLink;
	
	public static SelectRoomPage clickOnReserve()
	{
		try
		{
			//System.out.println("hi there");
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
