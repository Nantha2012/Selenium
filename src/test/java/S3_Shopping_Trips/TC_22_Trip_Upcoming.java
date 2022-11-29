package S3_Shopping_Trips;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingTrips;

public class TC_22_Trip_Upcoming extends BasePage{

	public TC_22_Trip_Upcoming() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_22() throws InterruptedException {
		
		log = report.startTest("TC_22_Trip_Upcoming");
		
		ShoppingTrips st = new ShoppingTrips(c);
		
		Thread.sleep(5000);
		
		st.menu().click();
		Thread.sleep(5000);
		
		String Expected_Name = "Shopping Trips";
		String Actual_Name   = c.findElement(By.xpath("//td[@class='header_main_menu_text']")).getText();
		System.out.println(Actual_Name);
		
		try {
			Assert.assertEquals(Expected_Name, Actual_Name);
			log.log(LogStatus.PASS, "Navigated to Shopping Trip Screen");
		    } catch (AssertionError e) {
		    	log.log(LogStatus.FAIL, "Unable to navigate to Shopping Trip Screen");
		    }
		
		st.new_schedule().click();
		Thread.sleep(2000);
		st.Cancel().click();
		
		st.upcoming().click();
		Thread.sleep(2000);
		st.upcoming().click();
		log.log(LogStatus.PASS, "Clicked on Upcoming Section");
		
		st.Upcoming_calendar().click();
		Thread.sleep(5000);
		log.log(LogStatus.PASS, "Clicked on Upcoming Calendar");
		
		st.select_date().click();
		Thread.sleep(5000);
		log.log(LogStatus.PASS, "Clicked on Today's Date : " + st.select_date().getText());
		
		Thread.sleep(2000);		
		log.log(LogStatus.PASS, "Trips count : " + st.count().getText());
		
	}
	
	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
