package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Start_Page{

	public WebDriver driver;
	
	public Home_Start_Page(WebDriver d) {
		this.driver=d;
	}
	
	By home = By.xpath("//button[@id='appGetStartedBtnId']");


	public WebElement getstarted() {
		return driver.findElement(home);
	}	

}
