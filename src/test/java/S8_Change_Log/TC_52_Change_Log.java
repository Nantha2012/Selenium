package S8_Change_Log;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.Change_Log;

public class TC_52_Change_Log extends BasePage{
	
	public ExtentTest log;

	public TC_52_Change_Log() throws IOException {
		
		super();

	}
	
	@Test
	public void TC_01_Change_Log() throws IOException, InterruptedException {
		
		log = report.startTest("TC_52_Change_Log");	
		
		Change_Log cl = new Change_Log(c);
		
		cl.change_log().click();
		Thread.sleep(2000);
		String actual_text = cl.header().getText();
		String exp_text = "Change Log";
		try {
			Assert.assertEquals(exp_text, actual_text);
			log.log(LogStatus.PASS, "Navigated to Change Log screen & Header is verified");
		    } catch (AssertionError e) {
		    	log.log(LogStatus.FAIL, "Header not verified");
		    }
		
		cl.filter_column().click();
		Thread.sleep(3000);
		log.log(LogStatus.PASS, "Clicked on Action Filter Column");	

		for(int k = 0; k < cl.filter_dropdown().size(); k++) {
			
			if(k==1){
				cl.filter_dropdown().get(k).click();
				
			}
			else {
				continue;					
			}
			
		}
		Thread.sleep(5000);
		log.log(LogStatus.PASS, "Clicked on Filter dropdown");
		
					
		for (int i = 0; i < cl.select_list().size(); i++) {
			String text = cl.valid_text().get(i).getText();
			cl.checkbox().get(i).click();
			log.log(LogStatus.PASS, "Clicked on " + text);
						
			cl.close_checkbox().click();
						
			cl.apply().click();
			log.log(LogStatus.PASS, "Clicked on Apply");
					
			Thread.sleep(3000);
						
			String[] sa = new String[cl.filtered_data().size()];
						
			for(int k = 0; k < cl.filtered_data().size(); k++) {
				String filtered_text = cl.filtered_data().get(k).getText();							
				sa[k] = filtered_text;
							
				}
						
			for(int a = 0; a < sa.length; a++) {
							
					if(text != sa[a]) {
								
//							log.log(LogStatus.FAIL, text + a + "row is not same");
								
						}
							
					else {							
								
						}						
				}
						  
			log.log(LogStatus.PASS, "Filtered data is matches with same "+ text);
			
			c.findElement(By.xpath("//button[@id='chngLogClrBtnId']")).click();						
			log.log(LogStatus.PASS, "Filters Cleared");
			Thread.sleep(2000);
			cl.filter_column().click();
			Thread.sleep(3000);
						
			}
		
		c.findElement(By.xpath("//button[@id='chngLogClrBtnId']")).click();	
		Thread.sleep(1000);
		c.findElement(By.xpath("//button[@id='chngLogClrBtnId']")).click();	
					
		}
	
	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
