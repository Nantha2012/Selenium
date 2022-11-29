package S3_Shopping_Trips;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingTrips;

public class TC_23_New_Schedule extends BasePage{

	public TC_23_New_Schedule() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_23() throws InterruptedException {
		
		log = report.startTest("TC_23_New_Schedule");
		
		ShoppingTrips st = new ShoppingTrips(c);
		
		st.menu().click();		
		Thread.sleep(2000);	
		
		st.new_schedule().click();
		Thread.sleep(2000);		
		log.log(LogStatus.PASS, "Clicked on New Schedule");
		
		st.agent_dropdown().click();
		log.log(LogStatus.PASS, "Clicked on Agent Dropdown");
		
		for (int i = 0; i < st.agent_select().size(); i++)
		{
			String text = st.agent_select().get(i).getText();
			
			if(text.equals("NANTHAKUMAR"))
			{				
				st.agent_select().get(i).click();
				log.log(LogStatus.PASS, "Clicked on Agent : " + text );	
				st.agent_select().get(i).sendKeys(Keys.ESCAPE);
			}
			else
			{
				continue;
			}			
		}
		
		Thread.sleep(5000);		
		st.store_dropdown().click();
		log.log(LogStatus.PASS, "Clicked on Store Dropdown");
		
		for (int j = 0; j < st.store_select().size(); j++)
		{
			String text = st.store_select().get(j).getText();
			
			if(text.equals("Interspar"))
			{				
				st.store_select().get(j).click();
				Thread.sleep(3000);
				log.log(LogStatus.PASS, "Clicked on Competitor Store : " + text );	
				st.store_select().get(j).sendKeys(Keys.ESCAPE);
			}
			else
			{
				continue;
			}			
		}
		
//		Thread.sleep(5000);		
//		st.store_dropdown().click();
//		log.log(LogStatus.PASS, "Clicked on Store Dropdown");
//		
//		for (int j = 0; j < st.store_select().size(); j++)
//		{
//			String text = st.store_select().get(j).getText();
//			
//			if(text.equals("Interspar"))
//			{				
//				st.store_select().get(j).click();
//				Thread.sleep(3000);
//				log.log(LogStatus.PASS, "Clicked on Competitor Store : " + text );	
//				st.store_select().get(j).sendKeys(Keys.ESCAPE);
//			}
//			else
//			{
//				continue;
//			}			
//		}
		
		Thread.sleep(5000);		
		st.address_dropdown().click();
		log.log(LogStatus.PASS, "Clicked on Address Dropdown");
		
		for (int k = 0; k < st.address_select().size(); k++)
		{
			String text = st.address_select().get(k).getText();
			
			if(text.equals("Oberfeldstraße 91, 4600 Wels"))
			{				
				st.address_select().get(k).click();
				Thread.sleep(3000);
				log.log(LogStatus.PASS, "Clicked on Address : " + text );	
				st.address_select().get(k).sendKeys(Keys.ESCAPE);
			}
			else
			{
				continue;
			}			
		}
		
		Thread.sleep(5000);		
		st.list_dropdown().click();
		log.log(LogStatus.PASS, "Clicked on Address Dropdown");
		
		for (int l = 0; l < st.list_select().size(); l++)
		{
			String text = st.list_select().get(l).getText();
			
			if(text.equals("Test_KT"))
			{				
				st.list_select().get(l).click();
				Thread.sleep(3000);
				log.log(LogStatus.PASS, "Clicked on List Name : " + text );	
				st.list_select().get(l).sendKeys(Keys.ESCAPE);
			}
			else
			{
				continue;
			}			
		}
		
		Thread.sleep(2000);
		
		st.trip_name().sendKeys(prop.getProperty("trip"));
		log.log(LogStatus.PASS, "Entered Trip Name : " + prop.getProperty("trip"));	
		
		st.trip_calendar().click();
		log.log(LogStatus.PASS, "Clicked on Calendar");	
		Thread.sleep(2000);
		
		st.select_date().click();
		log.log(LogStatus.PASS, "Clicked on Target Date");	
		Thread.sleep(2000);
		
		st.Save().click();
		log.log(LogStatus.PASS, "Clicked on Save");	
		
		Thread.sleep(15000);
		
		c.findElement(By.xpath("//div[@id='notification']")).click();
		Thread.sleep(3000);
		
		String trip_no = c.findElement(By.xpath("//ul[@class='notification_comp_ul_style']/li[1]/div/table/tr/td[2]/div[2]")).getText();
		
		c.findElement(By.xpath("//button[contains(@class,'p-sidebar-close p-sidebar-icon p-link')]")).click();
		Thread.sleep(3000);
		
		String final_trip_no = trip_no.replaceAll("[^0-9]", "");
		
//		st.search().sendKeys(final_trip_no);
		log.log(LogStatus.PASS, "Trip created with ID : " + final_trip_no);
		
		
		
		
	}
	
	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
