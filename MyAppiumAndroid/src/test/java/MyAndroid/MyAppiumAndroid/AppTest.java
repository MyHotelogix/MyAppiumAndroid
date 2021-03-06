package MyAndroid.MyAppiumAndroid;

import java.net.MalformedURLException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.TestException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Hotelogix.HMS.PocketPMS.Smoke.CheckinCardPage;
import Hotelogix.HMS.PocketPMS.Smoke.CheckinListPage;
import Hotelogix.HMS.PocketPMS.Smoke.CheckoutListPage;
import Hotelogix.HMS.PocketPMS.Smoke.FolioListPage;
import Hotelogix.HMS.PocketPMS.Smoke.Generic;
import Hotelogix.HMS.PocketPMS.Smoke.GroupEditPage;
import Hotelogix.HMS.PocketPMS.Smoke.GuestCheckinPage;
import Hotelogix.HMS.PocketPMS.Smoke.GuestCheckoutPage;
import Hotelogix.HMS.PocketPMS.Smoke.HomePage;
import Hotelogix.HMS.PocketPMS.Smoke.Login;
import Hotelogix.HMS.PocketPMS.Smoke.RoomAssignPage;
import Hotelogix.HMS.PocketPMS.Smoke.SelectAgentPage;
import Hotelogix.HMS.PocketPMS.Smoke.SelectCorporatePage;
import Hotelogix.HMS.PocketPMS.Smoke.SelectRoomPage;
import Hotelogix.HMS.PocketPMS.Smoke.SingleAccountStatementPage;
import Hotelogix.HMS.PocketPMS.Smoke.SingleEditPage;
import Hotelogix.HMS.PocketPMS.Smoke.StayDetails;


public class AppTest 
{
	
	@BeforeMethod
	public void appLaunch() throws Throwable 
	{
		System.out.println("In Before");
		Generic.launchAppToHomePage();
	
	}
	//@Test(priority=1)
	public void loginApp() throws Throwable 
	{
		System.out.println("Started executing 1st test");
		Generic.launchAppToLogin();
		System.out.println("Trying to Login App");
		Login.loginApp();
	
	}
	
	@Test
	public void createandCheckinSingleReservation() throws Throwable 
	{
		try{
		System.out.println("Running test case 2 now");
		
		HomePage.clickOnReserve();
		SelectRoomPage.selectingRoomSingleReservation();
		StayDetails.enteringGuestInfo();
		StayDetails.confirmingGuestDetails();
		SingleEditPage.clickOnCheckin();
		RoomAssignPage.assignRoom();
		GuestCheckinPage.guestCheckin();
		CheckinCardPage.confirmingResult();
		
		SelectRoomPage.confirmingCheckin();
		CheckinListPage.verifyingCheckin();
		}catch(Throwable e){
	       throw e;
		}
	}
	//@Test
	public void checkoutReservation()
	{
		HomePage.clickOnCheckout();
		CheckoutListPage.singleReservationCheckout();
		SingleEditPage.clickOnAccountStatement();
		SingleAccountStatementPage.clickOnFolioBtn();
		FolioListPage.clickOnContinueToCheckout();
		GuestCheckoutPage.selectGuestToCheckout();
		
	}
	//@Test
	public void createAgentReservation() throws Throwable 
	{
		HomePage.clickOnReserve();
		SelectRoomPage.selectingAgentRadioButton();
		SelectAgentPage.selectAgent();
		SelectRoomPage.creatingAgentReservation(); 
		StayDetails.confirmingAgentReservation();
		GroupEditPage.performinGroupCheckin();
		RoomAssignPage.assignRoom();
		GuestCheckinPage.guestCheckin();
		CheckinCardPage.confirmingResult();
		
	}
//	@Test
	public void createCorpReservation() throws Throwable 
	{
		HomePage.clickOnReserve();
		SelectRoomPage.selectingCorpRadioButton();
		SelectCorporatePage.selectCorporate();
		SelectRoomPage.creatingAgentReservation(); 
		StayDetails.confirmingAgentReservation();
		GroupEditPage.performinGroupCheckin();
		RoomAssignPage.assignRoom();
		GuestCheckinPage.guestCheckin();
		CheckinCardPage.confirmingResult();
	
	}
	@AfterMethod
	public void testcase4()
	{
		//Generic.closingDriver();
		
	}
   
}
