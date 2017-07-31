package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleAccountStatementPage {
	
	@FindBy(name=" GENERATE FOLIO ")
	public static WebElement folioButton;
	
	@FindBy(name=" FOLIO LIST ")
	public static WebElement folioListBtn ;
	
	
	public static FolioListPage clickOnFolioBtn()
	{
		
		try
		{
			folioButton.click();
			PageFactory.initElements(Generic.driver, FolioListPage.class);
			
		}
		catch(Exception e)
		{
			folioListBtn.click();
			PageFactory.initElements(Generic.driver, FolioListPage.class);
		}
		return new FolioListPage();
	}

}
