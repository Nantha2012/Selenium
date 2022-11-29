package S2_ShoppingListManagement;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingListManagement;

public class TC_11_Shopping_List_Exists extends BasePage{

	public TC_11_Shopping_List_Exists() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_11_List_Exists() throws InterruptedException {
		
		log = report.startTest("TC_11_Shopping_List_Exists");
		
		ShoppingListManagement sh = new ShoppingListManagement(c);
		
		sh.NewList().click();
		log.log(LogStatus.PASS, "Clicked on New List");
		Thread.sleep(5000);

		log.log(LogStatus.PASS, "Enter List Name");
		sh.listName().sendKeys(prop.getProperty("List_exist"));
		
		log.log(LogStatus.PASS, "Enter Product ID");
		sh.search_text().sendKeys(prop.getProperty("p_id"));		
		Thread.sleep(5000);
		
		log.log(LogStatus.PASS, "Click on Searched Product to add");
		sh.search_result().click();
		Thread.sleep(2000);
		
		log.log(LogStatus.PASS, "Click on Save");
		sh.Save().click();
		Thread.sleep(2000);
		
		String text = "*Shopping list name already exist";
		
		try {
			Assert.assertEquals(text, sh.list_exists().getText());
			log.log(LogStatus.PASS, "Shopping list already exists");
		 } catch (AssertionError e) {
		 log.log(LogStatus.FAIL, "New List is created");
		  }	
		
		sh.Cancel().click();
		
	}
	
	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
