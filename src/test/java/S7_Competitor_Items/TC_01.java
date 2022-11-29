package S7_Competitor_Items;

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
import pageObjects.Competitor_Items;
import pageObjects.Cookies;
import pageObjects.Home_Start_Page;
import pageObjects.Login_Page;

public class TC_01 extends BasePage {

	public TC_01() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExtentTest log;
	
	@Test
	public void TC_01_Competitor_Items() throws IOException, InterruptedException {
		
		report = reports();
		
		c = getDriver();
		
		log = report.startTest("TC_01_Competitor_Items");				
		
		Home_Start_Page h = new Home_Start_Page(c);	
		
		Login_Page l = new Login_Page(c);
		
		Cookies co = new Cookies(c);
		
		Competitor_Items ci = new Competitor_Items(c);
		
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
		
		h.getstarted().click();
		Thread.sleep(2000);
		
		try {
			Assert.assertEquals(true, h.getstarted().isEnabled());
			log.log(LogStatus.PASS, "Clicked on Get Started");
	    } catch (AssertionError e) {
	    	log.log(LogStatus.FAIL, "Failed to click on Get Started");
	    }
		
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
		
		Thread.sleep(7000);	
		
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
		
		ci.Comp_items().click();
		String actual_text = ci.header().getText();
		String exp_text = "Competitor Items";
		
		try {
			Assert.assertEquals(exp_text, actual_text);
			log.log(LogStatus.PASS, "Navigated to Competitor Items screen & Header is verified");
		    } catch (AssertionError e) {
		    	log.log(LogStatus.FAIL, "Header not verified");
		    }	
		
		Thread.sleep(5000);
		String text = ci.product().findElement(By.xpath("td[3]/div/div/span[2]")).getText();
		
		ci.product().findElement(By.xpath("td[1]/button")).click();
		log.log(LogStatus.PASS, "Clicked on "+ text + " Expansion Arrow");
		
		Thread.sleep(2000);
		
		for(int i=0; i < ci.prod_column().size(); i++) 
		{	
			String act_text = ci.prod_column().get(i).getText();
			System.out.println(act_text);
			switch(i) 
			{
			case 0 : if(act_text.equals("Retl Item Name")) 
					 {
						log.log(LogStatus.PASS, act_text + " Column is same");
					 }
					 else {
						 log.log(LogStatus.FAIL, act_text + " Column is not same");
					 }
					 break;
			
			case 1 : if(act_text.equals("Retl Item Id")) 
					 {
						log.log(LogStatus.PASS, act_text + " Column is same");
					 }
					 else {
						 log.log(LogStatus.FAIL, act_text + " Column is not same");
					 }
					 break;
			
			case 2 : if(act_text.equals("Retl UoM")) 
					 {
						log.log(LogStatus.PASS, act_text + " Column is same");
					 }
					 else {
						 log.log(LogStatus.FAIL, act_text + " Column is not same");
					 }
			 		 break;

	
			case 3 : if(act_text.equals("Retl Price")) 
					 {
						log.log(LogStatus.PASS, act_text + " Column is same");
					 }
					 else {
						 log.log(LogStatus.FAIL, act_text + " Column is not same");
					 }
					 break;
			
			default: continue;			
			}	
			
		}
		
		String count = ci.prod_item_count().getText();
		log.log(LogStatus.PASS, text + " product has "+ count);
		
		ci.search_box().sendKeys("test_prod");
		log.log(LogStatus.PASS, "Search for specific Product");
		Thread.sleep(5000);
		
		String before_price = ci.product().findElement(By.xpath("td[6]")).getText();
		log.log(LogStatus.PASS, "Price details before edit: " + before_price);
		
		ci.product().findElement(By.xpath("td[12]/button")).click();
		log.log(LogStatus.PASS, "Clicked on Edit button");
		Thread.sleep(5000);
		
		String price = "1800,00";
		ci.price_change().clear();
		Thread.sleep(5000);
		ci.price_change().sendKeys(price);
		Thread.sleep(5000);
		ci.Save().click();
		log.log(LogStatus.PASS, "Clicked on Save");
		Thread.sleep(5000);
		
		String after_price = ci.product().findElement(By.xpath("td[6]")).getText();
		String f = after_price.replace("€","");
		
		try {
			Assert.assertEquals(price, f);
			log.log(LogStatus.PASS, "Latest price is updated with : " + price);	
	    } catch (AssertionError e) {
	    	log.log(LogStatus.FAIL, "Price details is not updated with : " + price);
	    }	
		
//		if(price.equals(after_price)) {
//			log.log(LogStatus.PASS, "Latest price is updated with : " + price);	
//		}
//		else {
//			log.log(LogStatus.FAIL, "Price details is not updated with : " + price);	
//		}
//		
		
	}
	
	@AfterTest
	public void endTest()
	{
		report.endTest(log);
		report.flush();
		
	}

}
