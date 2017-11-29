package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckinCardPage {
	
	@FindBy(xpath="//*[@id='checkincard']/div/div/div/div")
	public static WebElement printBtn;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[4]/ion-footer-bar/div/button")
	public static WebElement backtoTodaysCreateReservation;
	
	
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-bar/div[1]/ion-header-bar/div[2]")
	public static WebElement selectRoomPageTitle;
	
	public static boolean result=false;
	
	public static SelectRoomPage confirmingResult() throws Throwable 
	{
		try
		{
		Thread.sleep(10000);
		//Generic.performScroll();
		//Assert.assertEquals(printBtn.isDisplayed(), true);
		//Thread.sleep(4000);
		
		if(backtoTodaysCreateReservation.isDisplayed())
		{
			backtoTodaysCreateReservation.click();
		}
		else
		{
			backtoTodaysCreateReservation.click();
		}
		Thread.sleep(4000);
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
}
