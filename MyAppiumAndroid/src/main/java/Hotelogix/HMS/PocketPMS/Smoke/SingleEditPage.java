package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SingleEditPage {
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div[2]/ion-footer-bar/div[1]/a[1]")
	public static WebElement checkinLink;
	
	@FindBy(name=" ACCOUNT STATEMENT ")
	public static WebElement accountStatementLink;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]")
	public static WebElement roomAssignPageTitle;
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div[2]/ion-view/div[1]/div/div[1]/h3")
	public static WebElement bookingID;
	
	static String bookingId="";
	
	public static RoomAssignPage clickOnCheckin() throws Throwable
	{
		try
		{
			
		bookingId=	bookingID.getText();
		String s1[]=bookingId.split("#");
		String s3[]=	s1[1].split("\\s");
		System.out.println("Booking ID is:"+s3[0]);
		bookingId=s3[0];
		checkinLink.click();
		Thread.sleep(4000);
		String actual=roomAssignPageTitle.getText();
		System.out.println("Room Assign page title is:"+actual);
		Assert.assertEquals(actual,"ROOM ASSIGN");
		
		
		
		
		PageFactory.initElements(Generic.driver, RoomAssignPage.class);
		
		}
		catch(Throwable e)
		{
			throw e;
		}
		return new RoomAssignPage();
	}

	public static SingleAccountStatementPage clickOnAccountStatement()
	{
		try
		{
		accountStatementLink.click();
		PageFactory.initElements(Generic.driver, SingleAccountStatementPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new SingleAccountStatementPage();
	}
}
