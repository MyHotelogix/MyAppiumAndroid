package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAgentPage {

	@FindBy(xpath="//div[6]/div[2]/ion-modal-view/ion-content/div/div[1]/label[1]/div")
	public static WebElement agentNameLink;
	
	public static SelectRoomPage selectAgent()
	{
		try
		{
		//Generic.swithchToWindow();
		Thread.sleep(5000);
		agentNameLink.click();
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
