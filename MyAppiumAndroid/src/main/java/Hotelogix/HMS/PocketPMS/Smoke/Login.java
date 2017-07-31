package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(name="Hotel Id")
	
	static WebElement idTextbox;
	
	@FindBy(name="Email Id")
	static
	WebElement emailTextbox;
	
	@FindBy(name="Login")
	WebElement parentElement;
	
	@FindBy(className="android.view.View")
	static
	List<WebElement> childElements;
	
	@FindBy(className="android.widget.EditText")
	static WebElement mainElement;
	
	@FindBy(name="SUBMIT ")
	static WebElement submitbtn;
	
	public static HomePage loginApp() 
	{
		try
		{
			Thread.sleep(10000);
			idTextbox.sendKeys("12313");
			emailTextbox.sendKeys("aaa@gmail.com");
		
			Thread.sleep(2000);
		
			System.out.println(childElements.size());
			mainElement = childElements.get(10);
			mainElement.sendKeys("111111");
			
			if(submitbtn.isDisplayed() && submitbtn.isEnabled())
			{
				//PageFactory.initElements(Generic.driver, HomePage.class);
				submitbtn.click();
				
			}
			else
			{
				Generic.driver.close();
			}
			
			PageFactory.initElements(Generic.driver, HomePage.class);
			
			}
		catch(InterruptedException e1)
		{
			System.out.println("Thread Exception");
			Generic.driver.closeApp();
		}
		System.out.println("Taking Home Page Return");
		return new HomePage();
		
	}

}
