package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.support.PageFactory;

public class SelectAgentPage {
	
	public static SelectRoomPage selectAgent()
	{
		try
		{
		//Generic.swithchToWindow();
		Thread.sleep(5000);
		SelectRoomPage.agentLink.click();
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
