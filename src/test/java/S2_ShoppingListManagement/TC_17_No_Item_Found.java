package S2_ShoppingListManagement;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingListManagement;

public class TC_17_No_Item_Found extends BasePage{

	public TC_17_No_Item_Found() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_17() throws IOException, InterruptedException {
		
		log = report.startTest("TC_17_No_Item_Found");
		
		ShoppingListManagement sh = new ShoppingListManagement(c);
		
		sh.NewList().click();
		log.log(LogStatus.PASS, "Clicked on New List");
		Thread.sleep(2000);

		sh.listName().sendKeys(prop.getProperty("List"));
		log.log(LogStatus.PASS, "Enter List Name");
		
		sh.search_text().sendKeys("135790");
		log.log(LogStatus.PASS, "Enter Product ID");
		Thread.sleep(2000);
		
		String text = "No Item Found";
		
		try {
			Assert.assertEquals(text, sh.no_item().getText());
			log.log(LogStatus.PASS, "No Item Found is displayed");
		 } catch (AssertionError e) {
		 log.log(LogStatus.FAIL, "Data is present");
		  }	
		
		sh.Cancel().click();
		Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
