package MyAndroid.MyAppiumAndroid;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartApplication {
	
	private static AndroidDriver driver;
	public static void setCapabilities()
	{
		try
		{
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/PocketPMS/");
		File app = new File(appDir, "android-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Moto g3");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "");
		capabilities.setCapability("appActivity", "");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
			driver.close();
		}
		
	}
	
	public static void loginApp() 
	{
		try
		{
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		driver.findElement(By.name("Hotel Id")).sendKeys("12313");
		driver.findElement(By.name("Email Id")).sendKeys("aaa@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement parentElement = driver.findElement(By.name("Login"));
		List<WebElement> childElements = parentElement.findElements(By.className("android.view.View"));
		System.out.println(childElements.size());
		WebElement mainElement = childElements.get(10);
		mainElement.findElement(By.className("android.widget.EditText")).sendKeys("111111");
		
		WebElement submitbtn=driver.findElement(By.name("SUBMIT "));
		if(submitbtn.isDisplayed() && submitbtn.isEnabled())
		{
			submitbtn.click();
		}
		else
		{
			driver.close();
		}
		}
		catch(InterruptedException e1)
		{
			System.out.println("Thread Exception");
			driver.closeApp();
		}
		
	}
	
	public static void createReservation() 
	{
		try
		{
		
		driver.findElement(By.name("RESERVE")).click();
		Thread.sleep(3000);
		WebElement selectRoom = driver.findElement(By.name("Select Room"));
		List<WebElement> selectRoomChildElements = selectRoom.findElements(By.className("android.view.View"));
		System.out.println(selectRoomChildElements.size());
		WebElement roomType = selectRoomChildElements.get(48);
		
		roomType.click();
		
		driver.findElement(By.name("CONTINUE")).click();
	
		driver.findElement(By.name("*First Name")).sendKeys("Gaurav");
		
		Thread.sleep(3000);
		driver.findElement(By.name("*Last Name")).click();
		
		driver.findElement(By.name("CONFIRM")).click();
	
		driver.findElement(By.name(" CHECK-IN ")).click();
		Thread.sleep(3000);
		WebElement assignRoom = driver.findElement(By.name("Room Assign"));
		List<WebElement> assignRoomChildElements = assignRoom.findElements(By.className("android.view.View"));
		System.out.println(selectRoomChildElements.size());
		WebElement rooms = assignRoomChildElements.get(55);
		rooms.click();
		
		driver.findElement(By.name(" CONTINUE ")).click();
		Thread.sleep(3000);
		WebElement selectAll = driver.findElement(By.name("Guest Checkin"));
		List<WebElement> selectAllChildElements = selectAll.findElements(By.className("android.view.View"));
		System.out.println(selectAllChildElements.size());
		WebElement selectAllGuest = selectAllChildElements.get(62);
		
		selectAllGuest.click();
		
		driver.findElement(By.name(" CHECK-IN SELECTED ")).click();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		catch(NoSuchElementException e1)
		{
			e1.printStackTrace();
			System.out.println("element not Found");
		}
		
	}
	
	public static void checkoutreservation()
	{
		try
		{
			
			driver.findElement(By.name("CHECK-OUT")).click();
			
			Thread.sleep(3000);
			WebElement checkoutList = driver.findElement(By.name("Check-out List"));
			List<WebElement> checkoutListElements = checkoutList.findElements(By.className("android.view.View"));
			System.out.println(checkoutListElements.size());
			WebElement reservationSlider = checkoutListElements.get(34);
			
			reservationSlider.click();
			
		
			
			driver.findElement(By.name(" ACCOUNT STATEMENT ")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
			//driver.findElement(By.xpath("//android.webkit.WebView[@content-desc='Single Edit']//android.view.View[113]")).click();
			//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			WebElement folioButton=null;
			try
			{
				folioButton=driver.findElement(By.name(" GENERATE FOLIO "));			
				folioButton.click();
				
			}
			catch(Exception e)
			{
				driver.findElement(By.name(" FOLIO LIST ")).click();
				driver.findElement(By.name(" CONTINUE TO CHECK-OUT ")).click();
				
				WebElement guestCheckout = driver.findElement(By.name("Guest Check-out"));
				List<WebElement> guestCheckoutListElements = guestCheckout.findElements(By.className("android.view.View"));
				System.out.println(guestCheckoutListElements.size());
				WebElement checkbox = guestCheckoutListElements.get(60);
				
				checkbox.click();
				driver.findElement(By.name(" CHECK-OUT SELECTED ")).click();
			}
			
			
			try
			{
			driver.findElement(By.name(" CONTINUE TO CHECK-OUT ")).click();
			//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			
			//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			WebElement guestCheckout = driver.findElement(By.name("Guest Check-out"));
			List<WebElement> guestCheckoutListElements = guestCheckout.findElements(By.className("android.view.View"));
			System.out.println(guestCheckoutListElements.size());
			WebElement checkbox = guestCheckoutListElements.get(60);
			Thread.sleep(3000);
			checkbox.click();
			driver.findElement(By.name(" CHECK-OUT SELECTED ")).click();
			
			/*Actions moveSlider = new Actions(driver); 
			Action action = moveSlider.dragAndDropBy(reservationSlider, -30, 0).build(); 
			action.perform();
			
			int wide  = reservationSlider.getSize().width;
			System.out.println("Reservation width is"+ wide);
			
			int hgt = reservationSlider.getSize().height;
			System.out.println("Reservation height is"+ hgt);
			
			int startx = (int) (wide * (0.8));
			System.out.println("Value of strtX"+startx);
			
			int endx = (int)(wide *(0.2));
			System.out.println("Value of endx"+endx);
			
			int starty =  hgt /2 ;
			System.out.println("Value of starty"+starty);
			
		    int endy = hgt/2;
		    System.out.println("value of endy"+endy);
		    
		    //To move from Fav to all contacts, we need to swipe from right to left
		   // driver.swipe(startx, starty, endx, endy, 10000);
			
		    
		    
		    
		    
		    int Xfirst =reservationSlider .getLocation().getX();
		    int Xfirstr=Xfirst + Xfirst;
		    int Yfirst=reservationSlider .getLocation().getY();
		    driver.swipe(Xfirst + 300,Yfirst, Xfirst,Yfirst,5000);
		
		    Thread.sleep(10000);
			
			
			
			
			//MobileElement element = (MobileElement)reservationSlider;
			//element.swipe(SwipeElementDirection.LEFT, 500);*/
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	
	
	
	public static void closingDriver()  
	{
		try
		{
		
	
	
		driver.closeApp();
		
		
		}
		catch(Exception e3)
		{
			e3.printStackTrace();
		}
	}
}

