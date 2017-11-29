package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SelectRoomPage {
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div/ion-view/ion-content/div/div[1]/ion-list/div/ion-item[1]/div/div[2]/a")
	public static WebElement roomType;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div/ion-view/ion-footer-bar/div/div[2]/a")
	public static WebElement continueLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div/ion-view/ion-header-bar/div/div[2]/div/div[2]/label/div")
	public static WebElement agentLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div/ion-view/ion-header-bar/div/div[2]/div/div[3]/label/div")
	public static WebElement corpLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]")
	public static WebElement stayDetailsPageTitle;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-bar/div[1]/ion-header-bar/div[1]/span/button")
	public static WebElement menuButton;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu/ion-content/div[1]/ion-list[1]/div/ion-item[3]")
	public static WebElement checkinList;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]")
	public static WebElement checkinListPageTitle;
	
	
	public static StayDetails selectingRoomSingleReservation() throws Throwable
	{
		try
		{
			
		Thread.sleep(8000);
		roomType.click();
		continueLink.click();
		Thread.sleep(8000);
		String actual=stayDetailsPageTitle.getText();
		System.out.println("Stay details page title is:"+actual);
		Assert.assertEquals(actual,"STAY DETAILS");
		
		PageFactory.initElements(Generic.driver, StayDetails.class);
		
		}
		catch(Throwable e)
		{
			throw e;
		}
		return new StayDetails();
		
	}
	
	public static CheckinListPage confirmingCheckin() throws Throwable
	{
		try
		{
		menuButton.click();
		checkinList.click();
		
		Thread.sleep(4000);
		String actual=checkinListPageTitle.getText();
		System.out.println("Checkin List page title is:"+actual);
		Assert.assertEquals(actual, "CHECK-IN LIST");
		
		PageFactory.initElements(Generic.driver, CheckinListPage.class);
		}
		catch(Throwable e)
		{
			throw e;
		}
		return new CheckinListPage();
	}
	
	public static SelectAgentPage selectingAgentRadioButton()
	{
		try
		{
		System.out.println("Befor getting window handle");	
		//Generic.getCurrentWindowHandle();
		Thread.sleep(8000);
		//agentLink= selectRoomChildElements.get(30);
		//Thread.sleep(4000);
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
		//Thread.sleep(5000);
		//roomType = selectRoomChildElements.get(55);
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
