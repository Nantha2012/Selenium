package S2_ShoppingListManagement;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingListManagement;

public class TC_07_Modify extends BasePage{

	public TC_07_Modify() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_07() throws InterruptedException{
		
		log = report.startTest("TC_07_Shopping_List_Modify");
		
		ShoppingListManagement sh = new ShoppingListManagement(c);
		
		sh.Search().clear();
		sh.Search().sendKeys("Automation_KT_demo");
//		sh.Search().sendKeys(prop.getProperty("List_Name"));
		log.log(LogStatus.PASS, "Search for List Name");
		Thread.sleep(2000);
		sh.Modify().click();
		log.log(LogStatus.PASS, "Click on Modify");		
		Thread.sleep(5000);
		log.log(LogStatus.PASS, "Search for "+ prop.getProperty("prod"));
		sh.search_text().sendKeys(prop.getProperty("prod"));
		Thread.sleep(2000);
		sh.search_result().click();
		log.log(LogStatus.PASS, prop.getProperty("prod") + " Product is added");
		Thread.sleep(5000);
//		sh.Save().click();
//		log.log(LogStatus.PASS, "Click on Save");	
//		Thread.sleep(2000);
		sh.Cancel().click();
		
	}
		
		@AfterTest
		public void endTest()
		{
			report.endTest(log);
			report.flush();
			
		}

}
