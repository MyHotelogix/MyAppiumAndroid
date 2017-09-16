package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import io.appium.java_client.TouchAction;

public class Login {
	/*
	@FindBy(className="android.widget.EditText")
	static List<WebElement> edittextChildElements;
	
	
	static WebElement idTextbox;
	static WebElement emailTextbox;
	
	//@FindBy(name="Login")
	//WebElement parentElement;
	
	@FindBy(className="android.view.View")
	static
	List<WebElement> childElements;
	
	
	static WebElement mainElement;
	
	@FindBy(className="android.widget.Button")
	static List<WebElement> btnChildElements;

	static WebElement submitbtn;*/
	
	
	@FindBy(xpath="//ion-view/ion-content/div[1]/form/label[1]/input")
	static WebElement idTextbox;
	
	@FindBy(xpath="//ion-view/ion-content/div[1]/form/label[2]/input")
	static WebElement emailTextbox;
	
	@FindBy(xpath="//ion-view/ion-content/div[1]/form/label[3]/input")
	static WebElement pwdTextbox;
	
	@FindBy(xpath="//ion-view/ion-content/div[1]/form/button")
	static WebElement submitbtn;
	
	

	
	public static HomePage loginApp() 
	{
		try
		{
			Thread.sleep(10000);
			//idTextbox=edittextChildElements.get(0);
			idTextbox.sendKeys("12313");
			
			/*int x=idTextbox.getLocation().getX();
			int y=idTextbox.getLocation().getY();
			TouchAction action = new TouchAction(Generic.driver);
			Thread.sleep(2000);
			action.press(x,y).moveTo(x+90,y).release().perform();
			*/
			
			System.out.println("Scroll performed.");
			
			Thread.sleep(2000);
			//emailTextbox=edittextChildElements.get(1);
			emailTextbox.sendKeys("aaa@gmail.com");
			pwdTextbox.sendKeys("111111");
		
			Thread.sleep(2000);
			
			
			JavascriptExecutor js = (JavascriptExecutor) Generic.driver;
			System.out.println("swiping to element " + submitbtn);
			js.executeScript("mobile: find", submitbtn);
			Generic.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			submitbtn.click();
			/*System.out.println(edittextChildElements.size());
			mainElement = edittextChildElements.get(2);
			mainElement.sendKeys("111111");
			Thread.sleep(2000);
			System.out.println(btnChildElements.size());
			submitbtn=	btnChildElements.get(0);
			
			if(submitbtn.isDisplayed() && submitbtn.isEnabled())
			{
				//PageFactory.initElements(Generic.driver, HomePage.class);
				
				System.out.println("In IF");
				
				submitbtn.click();
				
			}
			else
			{
				
				Generic.driver.close();
			}
			*/
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
