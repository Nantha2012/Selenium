package S2_ShoppingListManagement;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.ShoppingListManagement;

public class TC_08_Search_Column extends BasePage{

	public TC_08_Search_Column() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_08() throws InterruptedException {
		
		log = report.startTest("TC_08_Search_Column");
		
		ShoppingListManagement sh = new ShoppingListManagement(c);
		
		sh.Search().clear();
		sh.Search().sendKeys("Automation_KT_demo");
//		sh.Search().sendKeys(prop.getProperty("List_Name"));
		log.log(LogStatus.PASS, "Search for List Name");
		Thread.sleep(2000);
		
		log.log(LogStatus.PASS, "Item Count for "+ "Automation_KT_demo" + sh.count().getText());
		
		sh.chk_Comp().click();
		log.log(LogStatus.PASS, "Clicked on Checkbox");
		
		sh.chk_Comp_dropdown().click();
		log.log(LogStatus.PASS, "Clicked on Competitor Dropdown");
		Thread.sleep(5000);
		sh.chk_Comp_dropdown_select().click();
		log.log(LogStatus.PASS, "Select Interspar from Dropdown");
		
		for(int i=0; i<sh.column_name().size(); i++)
		{
			String text = sh.column_name().get(i).getText();
			
			switch(i)
			{
			
			case 0 : if(text.equals("HOFER ITEM"))
						{				
							log.log(LogStatus.PASS, text + " header is same");				
						}
						else {
							
							log.log(LogStatus.FAIL, text + " header is not same");
						}
						break;
					
			case 1 : if(text.equals("ARTICLE NO"))
						{				
							log.log(LogStatus.PASS, text + " header is same");				
						}
						else {
							
							log.log(LogStatus.FAIL, text + " header is not same");
						}
						break;
				
			case 2 : if(text.equals("UOM"))
						{				
							log.log(LogStatus.PASS, text + " header is same");				
						}
						else {
							
							log.log(LogStatus.FAIL, text + " header is not same");
						}
						break;
			
			case 3 : if(text.equals("HOFER PRICE"))
						{				
							log.log(LogStatus.PASS, text + " header is same");				
						}
						else {
							
							log.log(LogStatus.FAIL, text + " header is not same");
						}
						break;
			
			case 4 : if(text.equals("COMP NAME"))
						{				
							log.log(LogStatus.PASS, text + " header is same");				
						}
						else {
							
							log.log(LogStatus.FAIL, text + " header is not same");
						}
						break;
			
			case 5 : if(text.equals("COMP UOM"))
						{				
							log.log(LogStatus.PASS, text + " header is same");				
						}
						else {
							
							log.log(LogStatus.FAIL, text + " header is not same");
						}
						break;
			
			case 6 : if(text.equals("COMP PRICE"))
						{				
							log.log(LogStatus.PASS, text + " header is same");				
						}
						else {
							
							log.log(LogStatus.FAIL, text + " header is not same");
						}
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
