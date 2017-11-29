package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[4]/a")
	public static WebElement reserveLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/ion-content/div/div[3]/a")
	public static WebElement checkoutLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-bar/div[1]/ion-header-bar/div[2]")
	public static WebElement selectRoomPageTitle;
	
	public static SelectRoomPage clickOnReserve() throws Throwable
	{
		try
		{
			//System.out.println("hi there");
			Thread.sleep(15000);
			reserveLink.click();
			System.out.println("Clickon Reserve link");
			String actual=selectRoomPageTitle.getText();
			System.out.println("Select room page title is:"+actual);
			Assert.assertEquals(actual, "SELECT ROOM");
			
			PageFactory.initElements(Generic.driver, SelectRoomPage.class);
		}
		catch(Throwable e)
		{
			throw e;
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
		catch(Throwable e)
		{
			throw e;
		}
		return new CheckoutListPage();
	}

}
