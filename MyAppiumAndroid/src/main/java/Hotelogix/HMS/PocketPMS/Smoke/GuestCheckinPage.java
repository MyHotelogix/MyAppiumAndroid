package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestCheckinPage {
	
	
	public static WebElement selectAll;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div[3]/ion-view/ion-content/div/check-in/div/form/div[1]/div/div[1]/label")
	public static WebElement selectAllGuest;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div[3]/ion-footer-bar/div/button")
	public static WebElement checkinSelected;
	
	
	public static WebElement allSelect;
	
	
	public static CheckinCardPage guestCheckin()
	{
		try
		{
		Thread.sleep(3000);
		selectAllGuest.click();
		System.out.println("Checkbox selected");
		checkinSelected.click();
		
		//allSelect=selectAllChildElements.get(61);
		//allSelect.click();
		//Thread.sleep(10000);
		PageFactory.initElements(Generic.driver, CheckinCardPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new CheckinCardPage();
	}

}
