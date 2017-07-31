package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestCheckinPage {
	
	@FindBy(name="Guest Checkin")
	public static WebElement selectAll;
	
	@FindBy(className="android.view.View")
	public static List<WebElement> selectAllChildElements;
	
	public static WebElement selectAllGuest;
	
	@FindBy(name=" CHECK-IN SELECTED ")
	public static WebElement checkinSelected;
	
	
	public static WebElement allSelect;
	
	
	public static CheckinCardPage guestCheckin()
	{
		try
		{
		Thread.sleep(3000);
		
		
		System.out.println(selectAllChildElements.size());
		selectAllGuest = selectAllChildElements.get(52);
		Thread.sleep(4000);
		
		selectAllGuest.click();
		
		if(selectAllGuest.isSelected())
		{
			System.out.println("In IF");
			checkinSelected.click();
		}
		else
		{
			System.out.println(selectAllChildElements.size());
			selectAllGuest = selectAllChildElements.get(51);
			System.out.println("In else");
			selectAllGuest.click();
			checkinSelected.click();
		}
		//allSelect=selectAllChildElements.get(61);
		
		//allSelect.click();
		
		
		Thread.sleep(10000);
		PageFactory.initElements(Generic.driver, CheckinCardPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new CheckinCardPage();
	}

}
