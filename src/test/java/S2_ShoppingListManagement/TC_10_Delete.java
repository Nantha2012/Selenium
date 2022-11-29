package S2_ShoppingListManagement;

import java.io.IOException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingListManagement;

public class TC_10_Delete extends BasePage{

	public TC_10_Delete() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	public void TC_10() throws InterruptedException {
		
		log = report.startTest("TC_10_Delete");
		
		ShoppingListManagement sh = new ShoppingListManagement(c);
		
		sh.Search().sendKeys("Delete_List");
		Thread.sleep(2000);
//		log.log(LogStatus.PASS, "Search for List Named : " + prop.getProperty("List_active"));
		
		sh.delete().click();
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Clicked on Delete");
		
//		sh.Delete_confirm().click();
//		Thread.sleep(2000);
//		log.log(LogStatus.PASS, "Confirm to proceed for deletion");
		
		
		
		
	}

}
