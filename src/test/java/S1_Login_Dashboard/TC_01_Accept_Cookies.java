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
import pageObjects.Cookies;
import pageObjects.Home_Start_Page;
import pageObjects.Login_Page;

public class TC_01_Accept_Cookies extends BasePage{
	
public TC_01_Accept_Cookies() throws IOException {
		super();
	}

public ExtentTest log;
	
	@Test(priority=1)
	public void TC_01_Login_Accept_Cookies() throws IOException, InterruptedException {
		
		c = getDriver();
		
		log = report.startTest("TC_01_Accept_Cookies");				
		
		log.log(LogStatus.PASS, "Chrome Browser Initialized");		
		
		Home_Start_Page h = new Home_Start_Page(c);	
		
		Cookies co = new Cookies(c);
		
		c.get(prop.getProperty("url"));
		Thread.sleep(2000);
		
		String Expected = "GlobalDataBureau";
		String Actual = c.getTitle();
		
		try {
			Assert.assertEquals(Expected, Actual);
			log.log(LogStatus.PASS, "Navigated to Workbench URL successfully");
	    } catch (AssertionError e) {
	    	log.log(LogStatus.FAIL, "Failed to navigate to Workbench URL");
	    }
		
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
		
		String Expected_username = "Sign in";
		String Actual_username   = c.findElement(By.xpath("//div[@role='heading']")).getText();
	
		try {
		Assert.assertEquals(Expected_username, Actual_username);
		log.log(LogStatus.PASS, "Username textfield is displayed");
	    } catch (AssertionError e) {
	    	log.log(LogStatus.FAIL, "Username textfield is not displayed");
	    }
		
		l.username().sendKeys(prop.getProperty("username"));
		log.log(LogStatus.PASS, "Username is entered");
		Thread.sleep(2000);
		l.click_signin().click();
		Thread.sleep(2000);
		
		String Expected_password = "Enter password";
		String Actual_password   = c.findElement(By.xpath("//div[@role='heading']")).getText();
		
		try {
			Assert.assertEquals(Expected_password, Actual_password);
			log.log(LogStatus.PASS, "Password textfield is displayed");
		    } catch (AssertionError e) {
		    	log.log(LogStatus.FAIL, "Password textfield is not displayed");
		    }	
		
		l.pswrd().sendKeys(prop.getProperty("password"));
		log.log(LogStatus.PASS, "Password is entered");
		Thread.sleep(2000);	
		l.click_signin().click();
		Thread.sleep(2000);
	
		String Expected_stay_signed_in = "Stay signed in?";
		String Actual_stay_signed_in   = c.findElement(By.xpath("//div[@role='heading']")).getText();
		
		try {
			Assert.assertEquals(Expected_stay_signed_in, Actual_stay_signed_in);
			log.log(LogStatus.PASS, "Stay Signed In Page is displayed");
		    } catch (AssertionError e) {
		    	log.log(LogStatus.FAIL, "Stay Signed In Page is not displayed");
		    }
		
		l.click_stay_signin().click();
		
		log.log(LogStatus.PASS, "Click on NO");
		
		c.switchTo().window(parent);
		
		Thread.sleep(10000);
		
		String Expected_ac_cookies = "Cookie-Policy";
		String Actual_ac_cookies   = c.findElement(By.xpath("//span[@id='pr_id_3-label']")).getText();
		
		try {
			Assert.assertEquals(Expected_ac_cookies, Actual_ac_cookies);
			log.log(LogStatus.PASS, "Able to view Cookie Policy");
		    } catch (AssertionError e) {
		    	log.log(LogStatus.FAIL, "Not able to view Cookie Policy");
		    }
		
		co.ac_cookies().click();
		
		log.log(LogStatus.PASS, "Click on Accept Cookies");
		
		Thread.sleep(4000);
		
		String Expected_Dashboard_Name = "Shopping List Management";
		String Actual_Dashboard_Name   = c.findElement(By.xpath("//td[@class='header_main_menu_text']")).getText();
		
		try {
			Assert.assertEquals(Expected_Dashboard_Name, Actual_Dashboard_Name);
			log.log(LogStatus.PASS, "Navigated to Dashboard Screen");
		    } catch (AssertionError e) {
		    	log.log(LogStatus.FAIL, "Unable to navigate to Dashboard Screen");
		    }
		
		c.findElement(By.xpath("/html/body/app-root/app-landing-page/div/app-sidebar/div[1]/div[2]/app-working-area/div/div/div/div[1]/div/app-header/div/div[2]/img")).click();
		c.findElement(By.xpath("/html/body/div/div/div/div[4]/img")).click();
		c.findElement(By.xpath("//div[@role='button']")).click();
		Thread.sleep(2000);
		
		try {
			Assert.assertEquals(Expected, Actual);
			log.log(LogStatus.PASS, "Logged out successfully");
	    } catch (AssertionError e) {
	    	log.log(LogStatus.FAIL, "Failed to logout");
	    }
		
	}	

	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
