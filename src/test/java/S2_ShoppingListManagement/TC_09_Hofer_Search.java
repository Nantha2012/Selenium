package S2_ShoppingListManagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingListManagement;

public class TC_09_Hofer_Search extends BasePage{

	public TC_09_Hofer_Search() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_09() throws InterruptedException {
		
		log = report.startTest("TC_09_Hofer_Search");
		
		ShoppingListManagement sh = new ShoppingListManagement(c);
		
		sh.Search().sendKeys(prop.getProperty("List_active"));
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Search for List Named : " + prop.getProperty("List_active"));
		
		log.log(LogStatus.PASS, "Search for keyword : " + prop.getProperty("keyword"));
		sh.hofer_search().sendKeys(prop.getProperty("keyword"));
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Record is available");
		
		sh.hofer_search().clear();

	}

}
