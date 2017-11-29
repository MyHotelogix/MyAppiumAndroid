package Hotelogix.HMS.PocketPMS.Smoke;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Generic {
	
	public static AndroidDriver driver;
	
	//@FindBy(xpath="/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]")
	//public static WebElement homePagetitle;
	
	public static Login launchAppToLogin() 
	{
		try
		{
		System.out.println("hi");
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/PocketPMS/");
		File app = new File(appDir, "android-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Moto g3");
		//capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "");
		capabilities.setCapability("appActivity", "");
		capabilities.setCapability("autoWebview", true);
		//capabilities.setCapability("automationName","selendroid");
		
		/*capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Coolpad");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "");
		capabilities.setCapability("appActivity", "");*/


		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//String s1=driver.getContext();
		//System.out.println(s1);
		
		//Thread.sleep(15000);
	    /* Set<String> contextNames = driver.getContextHandles();
	     for (String contextName : contextNames) {
	     System.out.println(contextName);
	     if (contextName.contains("WEBVIEW_com.hotelogix.app"))
	     {
		     driver.context(contextName);
		     System.out.println(contextName);
		     Thread.sleep(1500); 
	     }
	     }
		*/
		
		PageFactory.initElements(driver, Login.class);
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
			driver.close();
		}
		return new Login();
		
	}
	
	public static HomePage launchAppToHomePage() throws Throwable 
	{
		try
		{
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/PocketPMS/");
		File app = new File(appDir, "android-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Moto g3");
		//capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "");
		capabilities.setCapability("appActivity", "");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("autoWebview", true);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		System.out.println("Current context is:"+driver.getContext());
		/*Set<String> contextNames = driver.getContextHandles();
	     for (String contextName : contextNames) {
	     System.out.println(contextName);
	     if (contextName.contains("WEBVIEW_com.hotelogix.app"))
	     {
		     driver.context(contextName);
		     System.out.println(contextName);
		     Thread.sleep(1500); 
	     }
	     }
		*/
		Thread.sleep(8000);
		String actual=driver.findElement(By.xpath("/html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]")).getText();
		System.out.println("Home page title is:"+actual);
		Assert.assertEquals(actual,"HOME");
		
		
		PageFactory.initElements(driver, HomePage.class);
		}
		catch(Throwable e)
		{
			throw e;
			
		}
		return new HomePage();
	}
	
	public static void closingDriver()
	{
		try
		{
			driver.quit();
		}
		catch(Throwable e3)
		{
			throw	e3;
		}
	}
	
	
	public static void performScroll() throws Throwable 
	{
		try
		{
		//Switching to Native view for the scroll
	    driver.context("NATIVE_APP");
		System.out.println("NATIVE_APP"+"Context set for the scroll operation");
		Thread.sleep(1500); 
	     
		//Performing scroll using Dimension
		Dimension dimensions = Generic.driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		Generic.driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
		
		Thread.sleep(2000);
		
		//Moving back to webview after scroll
		Set<String> contextNames = driver.getContextHandles();
	     for (String contextName : contextNames) {
	     System.out.println(contextName);
	     if (contextName.contains("WEBVIEW"))
	     {
		     driver.context(contextName);
		     System.out.println(contextName);
		     Thread.sleep(1500); 
	     }
	     }
		System.out.println("Moving back to WEBVIEW view after scroll");
		Thread.sleep(1500); 
	}
	
	catch(Throwable e)
	{
		throw e;
	}
	}
	
	public static String Js_getText(WebElement element){
		
		try{
        return (String) ((JavascriptExecutor) driver).executeScript(
            "return jQuery(arguments[0]).text();", element);
    }
	catch(Throwable e)
		{
		throw e;
		}
}
}