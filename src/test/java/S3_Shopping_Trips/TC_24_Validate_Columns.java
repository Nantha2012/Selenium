package S3_Shopping_Trips;

import java.io.IOException;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingTrips;

public class TC_24_Validate_Columns extends BasePage{

	public TC_24_Validate_Columns() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExtentTest log;
	
	public void TC_24() throws InterruptedException {
		
		log = report.startTest("TC_24_Validate_Columns");
		
		ShoppingTrips st = new ShoppingTrips(c);
		
		st.menu().click();		
		Thread.sleep(5000);
		
		c.findElement(By.xpath("//div[@id='notification']")).click();
		Thread.sleep(3000);
		
		String trip_no = c.findElement(By.xpath("//ul[@class='notification_comp_ul_style']/li[1]/div/table/tr/td[2]/div[2]")).getText();
		
		c.findElement(By.xpath("//button[contains(@class,'p-sidebar-close p-sidebar-icon p-link')]")).click();
		Thread.sleep(3000);
		
		String final_trip_no = trip_no.replaceAll("[^0-9]", "");
		
		st.search().sendKeys(final_trip_no);
		log.log(LogStatus.PASS, "Search for trip ID : " + final_trip_no);
		Thread.sleep(5000);
		
		String date = st.target_date().getText();
		log.log(LogStatus.PASS, "Target Date is : " + date);
		
		
		
		
	}
	
}
