package S2_ShoppingListManagement;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingListManagement;

public class TC_05_List_Creation extends BasePage{

	public TC_05_List_Creation() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_05() throws InterruptedException{
		
		log = report.startTest("TC_05_Shopping_List_Creation");
		
		ShoppingListManagement sh = new ShoppingListManagement(c);
		
		sh.NewList().click();
		log.log(LogStatus.PASS, "Clicked on New List");
		Thread.sleep(5000);

		log.log(LogStatus.PASS, "Enter List Name");
		sh.listName().sendKeys(prop.getProperty("List_Name"));
		
		log.log(LogStatus.PASS, "Enter Product Name");
		sh.search_text().sendKeys(prop.getProperty("prod"));		
		Thread.sleep(5000);
		
		log.log(LogStatus.PASS, "Click on Searched Product to add");
		sh.search_result().click();
		Thread.sleep(2000);
		
		log.log(LogStatus.PASS, "Click on Cancel");
		sh.Cancel().click();
		Thread.sleep(2000);
		
//		log.log(LogStatus.PASS, "Product Saved Successfully");
		
		
	}
	
	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
