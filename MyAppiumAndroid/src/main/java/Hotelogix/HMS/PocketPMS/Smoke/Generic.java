package Hotelogix.HMS.PocketPMS.Smoke;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class Generic {
	
	public static AndroidDriver driver;
	public static Login launchAppToLogin()
	{
		try
		{
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/PocketPMS/");
		File app = new File(appDir, "android-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Moto g3");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "");
		capabilities.setCapability("appActivity", "");
		
		
		/*capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Coolpad");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "");
		capabilities.setCapability("appActivity", "");*/


		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, Login.class);
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
			driver.close();
		}
		return new Login();
		
	}
	
	public static HomePage launchAppToHomePage()
	{
		try
		{
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/PocketPMS/");
		File app = new File(appDir, "android-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Moto g3");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "");
		capabilities.setCapability("appActivity", "");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, HomePage.class);
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
			driver.close();
		}
		return new HomePage();
	}
	
	public static void closingDriver()
	{
		try
		{
			driver.quit();
		}
		catch(Exception e3)
		{
			e3.printStackTrace();
		}
	}
	
	
	
	
	
	
	static String winHandleBefore;
	
	public static void getCurrentWindowHandle()
	{
		try
		{
		// Store the current window handle
		winHandleBefore = driver.getWindowHandle();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	public static void swithchToWindow()
	{
		try
		{
		// Store the current window handle
		//winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closingWindow()
	{
		try
		{
					// Close the new window, if that window no more required
				driver.close();
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void switchingToParentWindow()
	{
		try
		{
		// Switch back to original browser (first window)
				driver.switchTo().window(winHandleBefore);

				// Continue with original browser (first window)
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
