package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Item_Matching {
	
public WebDriver driver;
	
	By ac_cookies = By.xpath("//button[@id='acceptCookiesId']");	
	By de_cookies = By.xpath("//button[@id='denyCookiesId']");
	
	public Item_Matching(WebDriver d) {		
		this.driver=d;
		}

	public WebElement ac_cookies() {
		return driver.findElement(ac_cookies);
	}	
	
	public WebElement de_cookies() {
		return driver.findElement(de_cookies);
	}	

}
