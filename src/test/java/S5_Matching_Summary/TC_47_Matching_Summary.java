package S5_Matching_Summary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.Matching_Summary;

public class TC_47_Matching_Summary extends BasePage {

	public TC_47_Matching_Summary() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;

@Test
public void TC_02_Matching_Summary() throws IOException, InterruptedException {
		
		log = report.startTest("TC_47_Matching_Summary");
		
		Thread.sleep(5000);
	
		Matching_Summary ms =  new Matching_Summary(c);
		
		for(int i=0; i < ms.filter_column().size(); i++) 
		{
			
			String text = ms.filter_column().get(i).findElement(By.xpath("div/div[1]/span/span[1]")).getText();
					
			ms.filter_column().get(i).findElement(By.xpath("div/div[2]/div/span/p-columnfilter/div/button")).click();

			Thread.sleep(2000);
			
			log.log(LogStatus.PASS, "Clicked on " + text + " filter");
			
			for(int k = 0; k < ms.filter_dropdown().size(); k++) {
				
				if(k==1){
					ms.filter_dropdown().get(k).click();
					
				}
				else {
					continue;					
				}
				
			}
			log.log(LogStatus.PASS, "Clicked on dropdown");
			
			for(int j=0; j < ms.checkbox().size(); j++) 
			{
				if(j==0) 
				{
					ms.checkbox().get(j).findElement(By.xpath("div[1]")).click();				
					String filter_text = ms.checkbox().get(j).findElement(By.xpath("div[2]/span")).getText();					
					ms.close_checkbox().click();					
					ms.apply().click();
					log.log(LogStatus.PASS, "Clicked on Apply");					
					String[] sa = new String[ms.filtered_data().size()];
				
				for(int k = 0; k < ms.filtered_data().size(); k++) 
				{
					String filtered_text = ms.filtered_data().get(k).getText();							
					sa[k] = filtered_text;
								
				}
							
				for(int a = 0; a < sa.length; a++) 
				{
					if(filter_text != sa[a]) 
					{
						//	log.log(LogStatus.FAIL, text + a + "row is not same");
									
					}
								
					else {}						
				}
							  
				log.log(LogStatus.PASS, "Filtered data is matches with same "+ filter_text);
				
				ms.clear_icon().click();
				Thread.sleep(2000);
				log.log(LogStatus.PASS, "Filters Cleared");
				Thread.sleep(2000);
				
				}
				else {
					
					continue;
				}
				
			}
			
		}
		
		
}
			
			
				
//				for(int j=0; j < ms.filter_dropdown().size(); j++) 
//				{					
//					if(j==1) 
//					{						
//						ms.filter_dropdown().get(j).click();
//						Thread.sleep(2000);
//						ms.checkbox().click();
//						Thread.sleep(2000);	
//						ms.close_checkbox().click();
//						Thread.sleep(2000);	
//						ms.apply().click();
//						Thread.sleep(2000);						
//					}
//					
//					else {}
//				
//				}
				
//					ms.filter_column().get(i).click();
//					Thread.sleep(2000);
//					ms.clear_val().click();
//					Thread.sleep(2000);
//					ms.apply().click();
//				


@AfterTest
public void endTest()
{
	report.endTest(log);
	report.flush();
	
}
		

}
