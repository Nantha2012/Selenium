package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hofer_Items {
	
	public WebDriver driver;

	public Hofer_Items(WebDriver d) {		
		this.driver=d;
		}
		
		By match_sum = By.xpath("//div[@id='sidebarLinksName5']");
		
		public WebElement match_sum() {
			return driver.findElement(match_sum);
		}
		

}
