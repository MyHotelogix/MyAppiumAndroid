package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RoomAssignPage {
	
	
	
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[3]/ion-content/div/room-assign/div[2]/form/div/div[2]/div[1]/label")
	public static WebElement rooms;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[3]/ion-footer-bar/div/button")
	public static WebElement continueLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-bar/div[1]/ion-header-bar/div[2]")
	public static WebElement guestCheckinPageTitle;
	
	
	public static GuestCheckinPage assignRoom() throws Throwable
	{
		try
		{
		
		rooms.click();
		continueLink.click();
		Thread.sleep(4000);
		String actual=guestCheckinPageTitle.getText();
		System.out.println("Guest checkin page title is:"+actual);
		Assert.assertEquals(actual,"GUEST CHECKIN");
		
		
		PageFactory.initElements(Generic.driver, GuestCheckinPage.class);
		}
		catch(Throwable e)
		{
			throw e;
		}
		return new GuestCheckinPage();
	}

}
