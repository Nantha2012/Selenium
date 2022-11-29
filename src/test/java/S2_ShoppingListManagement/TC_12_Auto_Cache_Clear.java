package S2_ShoppingListManagement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingListManagement;

public class TC_12_Auto_Cache_Clear extends BasePage{

	public TC_12_Auto_Cache_Clear() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_12() throws IOException, InterruptedException {
		
		log = report.startTest("TC_12_Auto_Cache_Clear");
		
		ShoppingListManagement sh = new ShoppingListManagement(c);
		
//		sh.hmenu().click();
		
//		log.log(LogStatus.PASS, "Clicked on Shopping List Management Module");
		
		Thread.sleep(5000);
		
		String Expected_SLM_Name = "Shopping List Management";
		String Actual_SLM_Name   = c.findElement(By.xpath("//td[@class='header_main_menu_text']")).getText();

		try {
			Assert.assertEquals(Expected_SLM_Name, Actual_SLM_Name);
			log.log(LogStatus.PASS, "Navigated to Shopping List Management Screen");
		    } catch (AssertionError e) {
		    	log.log(LogStatus.FAIL, "Unable to navigate to Shopping List Management Screen");
		    }
		
		for(int i=1; i<=4; i++) {
			
			String text = "*Add items from list";
			
			sh.NewList().click();
			Thread.sleep(3000);
			
			sh.listName().clear();
			sh.listName().sendKeys(prop.getProperty("List"));
			
			switch(i) 
			{
			case 1 : sh.search_text().sendKeys(prop.getProperty("name"));
					 Thread.sleep(2000);
					 
					 sh.search_text().sendKeys(Keys.ESCAPE);
					 sh.Save().click();
					 Thread.sleep(2000);
					 
					 System.out.println(sh.add_items_error().getText());
					 try {
							Assert.assertEquals(text, sh.add_items_error().getText());
							log.log(LogStatus.PASS, "Add items from list error displayed for Name");
						 } catch (AssertionError e) {
						 log.log(LogStatus.FAIL, "Didn't display any error");
						  }
					 sh.Cancel().click();
					 Thread.sleep(2000);
					 
					 break;
				
			case 2 : sh.search_text().sendKeys(prop.getProperty("p_id"));
					 Thread.sleep(2000);
					 
					 sh.search_text().sendKeys(Keys.ESCAPE);
					 sh.Save().click();
					 Thread.sleep(2000);

					 try {
							Assert.assertEquals(text, sh.add_items_error().getText());
							log.log(LogStatus.PASS, "Add items from list error displayed for Product Id");
						 } catch (AssertionError e) {
						 log.log(LogStatus.FAIL, "Didn't display any error");
						  }
					 sh.Cancel().click(); 
					 Thread.sleep(2000);
					 break;
				
			case 3 : sh.dropdown().click();
					 log.log(LogStatus.PASS, "Click on dropdown under hofer products");
					 sh.filter_category().click();
					 log.log(LogStatus.PASS, "Click on Category");
					 sh.category_select().click();
					 log.log(LogStatus.PASS, "Select category under Hofer products");
					 Thread.sleep(2000);

					 sh.search_text().sendKeys(Keys.ESCAPE);
					 sh.Save().click();
					 Thread.sleep(2000);

					 try {
							Assert.assertEquals(text, sh.add_items_error().getText());
							log.log(LogStatus.PASS, "Add items from list error displayed for Category");
						 } catch (AssertionError e) {
						 log.log(LogStatus.FAIL, "Didn't display any error");
						  }
					 sh.Cancel().click(); 
					 Thread.sleep(2000);
					 
					 break;
					 
			case 4 : sh.dropdown().click();
			 		 log.log(LogStatus.PASS, "Click on dropdown under hofer products");
			 		 sh.Commodity().click();
					 log.log(LogStatus.PASS, "Click on Commodity");
					 sh.commodity_select().click();
					 log.log(LogStatus.PASS, "Select Commodity under Hofer products");
					 Thread.sleep(2000);

					 sh.search_text().sendKeys(Keys.ESCAPE);
					 sh.Save().click();
					 Thread.sleep(2000);

					 try {
							Assert.assertEquals(text, sh.add_items_error().getText());
							log.log(LogStatus.PASS, "Add items from list error displayed for Commodity");
						 } catch (AssertionError e) {
						 log.log(LogStatus.FAIL, "Didn't display any error");
						  }
					 sh.Cancel().click(); 
					 Thread.sleep(2000);
					 
					 break; 
			
			}
			
		}
		
		
	}	
	
	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
