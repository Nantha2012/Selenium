package S1_Login_Dashboard;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import pageObjects.Home_Start_Page;
import pageObjects.Login_Page;

public class TC_03_Username_Invalid extends BasePage {
	
public ExtentTest log;
	
	public TC_03_Username_Invalid() throws IOException {
		super();
	}

	@Test(priority=1)
	public void TC_03_Invalid_Username() throws IOException, InterruptedException {
		
		log = report.startTest("TC_03_Username_Invalid");				
		
		Home_Start_Page h = new Home_Start_Page(c);			
		
		try {
			Assert.assertEquals(true, h.getstarted().isDisplayed());
			log.log(LogStatus.PASS, "Get Started Element is displayed");
	    } catch (AssertionError e) {
	    	log.log(LogStatus.FAIL, "Get Started Element is not displayed");
	    }	
		
		h.getstarted().click();
		
		try {
			Assert.assertEquals(true, h.getstarted().isEnabled());
			log.log(LogStatus.PASS, "Clicked on Get Started");
	    } catch (AssertionError e) {
	    	log.log(LogStatus.FAIL, "Failed to click on Get Started");
	    }
		
		Login_Page l = new Login_Page(c);			
		
		String parent=c.getWindowHandle();
		Set<String>s=c.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();	
			if(!parent.equals(child_window))
			{
				c.switchTo().window(child_window);				
			}
		}
		
		log.log(LogStatus.PASS, "Switched to login page");
		
		Thread.sleep(5000);
		
		c.findElement(By.xpath("//div[@id='otherTile']")).click();
		
		Thread.sleep(2000);	
		
		String Expected_username = "Sign in";
		String Actual_username   = c.findElement(By.xpath("//div[@role='heading']")).getText();
	
		try {
		Assert.assertEquals(Expected_username, Actual_username);
		log.log(LogStatus.PASS, "Username textfield is displayed");
	    } catch (AssertionError e) {
	    	log.log(LogStatus.FAIL, "Username textfield is not displayed");
	    }
		
		//Invalid Username
		
		l.username().sendKeys(prop.getProperty("username_duplicate"));
		log.log(LogStatus.PASS, "Duplicate Username is entered");
		Thread.sleep(2000);
		l.click_signin().click();
			
		
		String Exp_user_msg = "Enter a valid email address or phone number.";
		String Act_user_msg = c.findElement(By.xpath("//div[@id='usernameError']")).getText();
		
		try {
			Assert.assertEquals(Exp_user_msg, Act_user_msg);
			log.log(LogStatus.PASS, "Username is invalid");
		    } catch (AssertionError e) {
		    
		    }
		
	}	

	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
