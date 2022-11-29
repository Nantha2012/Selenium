package S1_Login_Dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.Login_Page;

public class TC_04_Password_Invalid extends BasePage {
	
public ExtentTest log;
	
	public TC_04_Password_Invalid() throws IOException {
		super();
	}

	@Test(priority=1)
	public void TC_04_Invalid_Password() throws IOException, InterruptedException {
		
		log = report.startTest("TC_04_Password_Invalid");
		
		Login_Page l = new Login_Page(c);
		
		String Expected_username = "Sign in";
		String Actual_username   = c.findElement(By.xpath("//div[@role='heading']")).getText();
	
		try {
		Assert.assertEquals(Expected_username, Actual_username);
		log.log(LogStatus.PASS, "Username textfield is displayed");
	    } catch (AssertionError e) {
	    	log.log(LogStatus.FAIL, "Username textfield is not displayed");
	    }
		
		l.username().clear();
		l.username().sendKeys(prop.getProperty("username"));
		log.log(LogStatus.PASS, "Username is entered");
		Thread.sleep(2000);
		l.click_signin().click();
		
		Thread.sleep(2000);
		
		l.pswrd().sendKeys(prop.getProperty("password_duplicate"));
		log.log(LogStatus.PASS, "Duplicate Password is entered");
		Thread.sleep(2000);
		l.click_signin().click();
		Thread.sleep(2000);
		
		String Exp_pswd_msg = "Your account or password is incorrect. If you don't remember your password, reset it now.";
		String Act_pswd_msg = c.findElement(By.xpath("//div[@id='passwordError']")).getText();
		
		try {
			Assert.assertEquals(Exp_pswd_msg, Act_pswd_msg);
			log.log(LogStatus.PASS, "Password is invalid");
		    } catch (AssertionError e) {
		    	
		    }
		c.quit();
		
	}	

	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
		
	}

}
