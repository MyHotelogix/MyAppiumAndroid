package Hotelogix.HMS.PocketPMS.Smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleEditPage {
	
	@FindBy(xpath="//ion-side-menus/ion-side-menu-content/ion-nav-view/div[2]/ion-footer-bar/div[1]/a[1]")
	public static WebElement checkinLink;
	
	@FindBy(name=" ACCOUNT STATEMENT ")
	public static WebElement accountStatementLink;
	
	public static RoomAssignPage clickOnCheckin()
	{
		try
		{
		checkinLink.click();
		PageFactory.initElements(Generic.driver, RoomAssignPage.class);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
