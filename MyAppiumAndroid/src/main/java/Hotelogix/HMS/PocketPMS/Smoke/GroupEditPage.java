package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupEditPage {
	
	@FindBy(name=" GROUP CHECK-IN ")
	public static WebElement groupCheckinLink;
	
	public static RoomAssignPage performinGroupCheckin()
	{
		try
		{
		groupCheckinLink.click();
		PageFactory.initElements(Generic.driver, RoomAssignPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new RoomAssignPage();
	}

}
