package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.support.PageFactory;

public class SelectCorporatePage {
	
	public static SelectRoomPage selectCorporate()
	{
		try
		{
		//Generic.swithchToWindow();
		Thread.sleep(5000);
		SelectRoomPage.corpLink.click();
		System.out.println("Agent selected");
		//Generic.switchingToParentWindow();
	
		PageFactory.initElements(Generic.driver, SelectRoomPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 return new SelectRoomPage();
	}

}
