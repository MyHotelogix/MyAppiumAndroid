package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StayDetails {
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[2]/ion-content/div/form/div/div[1]/div/div[1]/div[2]/div[2]/label[1]/input")
	public static WebElement firstName; 
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[2]/ion-content/div/form/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/i")
	public static WebElement crossLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[2]/ion-content/div/form/div/div[1]/div/div[1]/div[2]/div[2]/label[2]/input")
	public static WebElement lastName; 
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[2]/ion-content/div/form/div/div[1]/div/div[1]/div[2]/div[2]/div[3]/div[1]/label/input")
	public static WebElement phoneNo; 
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[2]/ion-content/div/form/div/div[1]/div/div[1]/div[2]/div[2]/div[3]/div[3]/label/input")
	public static WebElement mail; 
	
	//@FindBy(xpath="//android.view.View[@content-desc=' CONFIRM ']")
	
	//@FindBy(name="CONFIRM")
	public static WebElement grpconfirmLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view[2]/ion-footer-bar/div/div[2]/a")
	public static WebElement singleconfirmLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-bar/div[1]/ion-header-bar/div[2]")
	public static WebElement singleEditPageTitle;
	
	
	//@FindBy(className="android.view.View")
	//public static List<WebElement> allViewElements;
	
	public static void enteringGuestInfo() throws Throwable
	{
		try
		{
			Thread.sleep(6000);
			System.out.println("Entering First name");
			firstName.sendKeys("Gaurav");
			Thread.sleep(6000);
		
		crossLink.click();
		
		lastName.sendKeys("Mehta");
		
		phoneNo.sendKeys("123456789");
		
		mail.sendKeys("gaurav.mehta@hotelogix.com");
		}
		catch(Throwable e)
		{
			throw e;
		}
	}
	
	public static SingleEditPage confirmingGuestDetails() throws Throwable
	{
		try
		{
			singleconfirmLink.click();
			Thread.sleep(8000);
			
			String actual=singleEditPageTitle.getText();
			System.out.println("Single edit page title is:"+actual);
			Assert.assertEquals(actual,"SINGLE EDIT");
			
			
		PageFactory.initElements(Generic.driver, SingleEditPage.class);
		}
		catch(Throwable e)
		{
			throw e;
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
