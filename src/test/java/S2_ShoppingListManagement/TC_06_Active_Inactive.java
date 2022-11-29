package S2_ShoppingListManagement;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingListManagement;

public class TC_06_Active_Inactive extends BasePage{

	public TC_06_Active_Inactive() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_06() throws InterruptedException {
		
		log = report.startTest("TC_06_Shopping_List_Active_Inactive");
		
		ShoppingListManagement sh = new ShoppingListManagement(c);
		
		sh.Search().sendKeys(prop.getProperty("List_active"));
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Search for "+ prop.getProperty("List_active"));
		
		if(sh.status().getText().equals(" Active"))
		{
			sh.Modify().click();
			log.log(LogStatus.PASS, "Clicked on Modify");
			Thread.sleep(2000);
			sh.deactive().click();
			log.log(LogStatus.PASS, "Clicked on Deactive");
			Thread.sleep(2000);
			sh.Save().click();
			log.log(LogStatus.PASS, "Clicked on Save");
			Thread.sleep(5000);
			c.navigate().refresh();
			Thread.sleep(5000);
			sh.Search().clear();
			sh.Search().sendKeys(prop.getProperty("List_active"));
			Thread.sleep(2000);
			log.log(LogStatus.PASS, "Status : "+ sh.status().getText());
			
		}
		
		else
		{
			sh.Modify().click();
			log.log(LogStatus.PASS, "Clicked on Modify");
			Thread.sleep(2000);
			sh.active().click();
			log.log(LogStatus.PASS, "Clicked on Active");
			Thread.sleep(2000);
			sh.Save().click();
			log.log(LogStatus.PASS, "Clicked on Save");
			Thread.sleep(5000);
			c.navigate().refresh();
			Thread.sleep(5000);
			sh.Search().sendKeys(prop.getProperty("List_active"));
			Thread.sleep(2000);
			log.log(LogStatus.PASS, "Status : "+ sh.status().getText());			
			
		}
		
	}
	
	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
