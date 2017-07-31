package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StayDetails {
	
	@FindBy(name="*First Name")
	public static WebElement firstName; 
	
	@FindBy(name="")
	public static WebElement crossLink;
	
	@FindBy(name="*Last Name")
	public static WebElement lastName; 
	
	@FindBy(name="*Mobile")
	public static WebElement phoneNo; 
	
	@FindBy(name="Email")
	public static WebElement mail; 
	
	//@FindBy(xpath="//android.view.View[@content-desc=' CONFIRM ']")
	
	//@FindBy(name="CONFIRM")
	public static WebElement grpconfirmLink;
	
	@FindBy(name="CONFIRM")
	public static WebElement singleconfirmLink;
	
	@FindBy(className="android.view.View")
	public static List<WebElement> allViewElements;
	
	public static void enteringGuestInfo()
	{
		try
		{
			Thread.sleep(6000);
			System.out.println("Entering First name");
			firstName.sendKeys("Gaurav");
			Thread.sleep(3000);
		
		crossLink.click();
		
		lastName.sendKeys("Mehta");
		
		phoneNo.sendKeys("123456789");
		
		mail.sendKeys("gaurav.mehta@hotelogix.com");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static SingleEditPage confirmingGuestDetails()
	{
		try
		{
			singleconfirmLink.click();
		PageFactory.initElements(Generic.driver, SingleEditPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new SingleEditPage();
	}
	
	public static GroupEditPage confirmingAgentReservation()
	{
		try
		{
			Thread.sleep(8000);
			System.out.println("Waited for 3 sec and clicking on Confirm, link");
			//grpconfirmLink=allViewElements.get(89);
			singleconfirmLink.click();
			System.out.println("Clicked on confirm link");
			PageFactory.initElements(Generic.driver, GroupEditPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new GroupEditPage();
	}

}