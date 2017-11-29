package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GuestCheckinPage {
	
	

	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div[3]/ion-view/ion-content/div/check-in/div/form/div[1]/div/div[1]/label")
	public static WebElement selectAllGuest;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div[3]/ion-footer-bar/div/button")
	public static WebElement checkinSelected;
	
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]")
	public static WebElement checkinCardPageTitle;
	
	
	public static CheckinCardPage guestCheckin() throws Throwable
	{
		try
		{
		Thread.sleep(3000);
		selectAllGuest.click();
		System.out.println("Checkbox selected");
		checkinSelected.click();
		Thread.sleep(8000);
		String actual=checkinCardPageTitle.getText();
		System.out.println("Checkin card page title is:"+actual);
		Assert.assertEquals(actual,"CHECK-IN CARD");
		
		
		//allSelect=selectAllChildElements.get(61);
		//allSelect.click();
		//Thread.sleep(10000);
		PageFactory.initElements(Generic.driver, CheckinCardPage.class);
		}
		catch(Throwable e)
		{
			throw e;
		}
		return new CheckinCardPage();
	}

}
