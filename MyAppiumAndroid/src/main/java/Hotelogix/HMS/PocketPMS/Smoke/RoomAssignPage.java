package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomAssignPage {
	
	@FindBy(name="Room Assign")
	public static WebElement assignRoom;
	
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[3]/ion-content/div/room-assign/div[2]/form/div/div[2]/div[1]/label")
	public static WebElement rooms;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[3]/ion-footer-bar/div/button")
	public static WebElement continueLink;
	
	public static GuestCheckinPage assignRoom()
	{
		try
		{
		
		rooms.click();
		continueLink.click();
		PageFactory.initElements(Generic.driver, GuestCheckinPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new GuestCheckinPage();
	}

}
