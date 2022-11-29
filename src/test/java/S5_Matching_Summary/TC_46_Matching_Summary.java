package S5_Matching_Summary;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.Matching_Summary;

public class TC_46_Matching_Summary extends BasePage{
	
	public ExtentTest log;

	public TC_46_Matching_Summary() throws IOException {		
		super();
	}
	
	@Test
	public void TC_01_Matching_Summary() throws IOException, InterruptedException {
		
		log = report.startTest("TC_46_Matching_Summary");				
		
		Matching_Summary ms = new Matching_Summary(c);
		
		ms.match_sum().click();
		
		Thread.sleep(5000);
		
		for (int i=0; i <ms.column_header().size(); i++) {
			
			String text = ms.column_header().get(i).getText();
		
			switch (i) {
			
			  case 0:
				  if(text.equals("Article No")) {
					  log.log(LogStatus.PASS, text +" header is same");				  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");	
				  }
				 
				  break;
			  case 1:
				  if(text.equals("Buyer")) {
					  log.log(LogStatus.PASS, text +" header is same");				  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");	
				  }
				  break;
			  case 2:
				  if(text.equals("Hofer Item Name")) {
					  log.log(LogStatus.PASS, text +" header is same");					  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");		
				  }
				  break;
			  case 3:
				  if(text.equals("Hofer Price/UoM")) {
					  log.log(LogStatus.PASS, text +" header is same");					  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");		
				  }
				  break;
			  case 4:
				  if(text.equals("Comp Item Name")) {
					  log.log(LogStatus.PASS, text +" header is same");			  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");	
				  }
				  break;
			  case 5:
				  if(text.equals("Comp Price/UoM")) {
					  log.log(LogStatus.PASS, text +" header is same");				  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");	
				  }
				  break;
			  case 6:
				  if(text.equals("Match Status")) {
					  log.log(LogStatus.PASS, text +" header is same");			  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");	
				  }
				  break;
			  case 7:
				  if(text.equals("Customer Approved Status")) {
					  log.log(LogStatus.PASS, text +" header is same");					  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");	
				  }
				  break;
			  case 8:
				  if(text.equals("Modified By")) {
					  log.log(LogStatus.PASS, text +" header is same");					  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");		
				  }
				  break;
			  case 9:
				  if(text.equals("Modified Date")) {
					  log.log(LogStatus.PASS, text +" header is same");				  
				  }
				  else {
					  log.log(LogStatus.FAIL, text +" header is not same");	
				  }
				  break;
			  default:
				  System.out.println("No text is present");
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
