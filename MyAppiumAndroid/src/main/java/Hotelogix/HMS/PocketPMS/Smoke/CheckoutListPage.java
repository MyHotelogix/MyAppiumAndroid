package Hotelogix.HMS.PocketPMS.Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutListPage {
	
	@FindBy(name="Check-out List")
	public static WebElement checkoutList;
	
	@FindBy(className="android.view.View")
	public static List<WebElement> checkoutListElements;
	
	public static WebElement reservationSlider;
	
	
	
	public static SingleEditPage singleReservationCheckout()
	{
		try
		{
		Thread.sleep(3000);
		
		System.out.println(checkoutListElements.size());
		reservationSlider = checkoutListElements.get(34);
		reservationSlider.click();
		
		PageFactory.initElements(Generic.driver, SingleEditPage.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new SingleEditPage();
	}

}
