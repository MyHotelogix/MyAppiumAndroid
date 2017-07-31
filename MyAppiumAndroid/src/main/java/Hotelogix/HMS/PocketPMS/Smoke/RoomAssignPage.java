package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomAssignPage {
	
	@FindBy(name="Room Assign")
	public static WebElement assignRoom;
	
	@FindBy(className="android.view.View")
	public static List<WebElement> assignRoomChildElements;
	
	public static WebElement rooms;
	
	@FindBy(name=" CONTINUE ")
	public static WebElement continueLink;
	
	public static GuestCheckinPage assignRoom()
	{
		try
		{
		System.out.println(assignRoomChildElements.size());
		rooms = assignRoomChildElements.get(55);
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
