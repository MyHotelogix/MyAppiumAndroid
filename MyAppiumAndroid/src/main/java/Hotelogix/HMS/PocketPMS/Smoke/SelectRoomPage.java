package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectRoomPage {
	
	@FindBy(name="Select Room")
	public static WebElement selectRoom;
	
	
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div/ion-view/ion-content/div/div[1]/ion-list/div/ion-item[1]/div/div[2]/a")
	public static WebElement roomType;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div/ion-view/ion-footer-bar/div/div[2]/a")
	public static WebElement continueLink;
	
	
	public static WebElement agentLink;
	
	public static WebElement corpLink;
	
	public static StayDetails selectingRoomSingleReservation()
	{
		try
		{
			Thread.sleep(8000);
		
		
		roomType.click();
		continueLink.click();
		PageFactory.initElements(Generic.driver, StayDetails.class);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new StayDetails();
		
	}
	
	public static SelectAgentPage selectingAgentRadioButton()
	{
		try
		{
		System.out.println("Befor getting window handle");	
		//Generic.getCurrentWindowHandle();
		Thread.sleep(4000);
		//agentLink= selectRoomChildElements.get(30);
		Thread.sleep(4000);
		agentLink.click();
		PageFactory.initElements(Generic.driver, SelectAgentPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new SelectAgentPage();
	}

	public static StayDetails creatingAgentReservation()
	{
		try
		{
		Thread.sleep(5000);
		//roomType = selectRoomChildElements.get(55);
		Thread.sleep(4000);
		roomType.click();
		continueLink.click();
		PageFactory.initElements(Generic.driver, StayDetails.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new StayDetails();
	
	}
	
	public static SelectCorporatePage selectingCorpRadioButton()
	{
		try
		{
		System.out.println("Befor getting window handle");	
		//Generic.getCurrentWindowHandle();
		Thread.sleep(4000);
		//corpLink= selectRoomChildElements.get(33);
		Thread.sleep(4000);
		corpLink.click();
		PageFactory.initElements(Generic.driver, SelectCorporatePage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new SelectCorporatePage();
		
	}
	
	
}
