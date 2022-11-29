package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Login_Page{
		
		public WebDriver driver;
		
		By login_uname = By.xpath("//input[@id='i0116']");
		By sign_in = By.xpath("//input[@id='idSIButton9']");
		By login_pswd = By.xpath("//input[@id='i0118']");
		By stay_signin = By.xpath("//input[@id='idBtn_Back']");	
		
		
		public Login_Page(WebDriver d) {
			this.driver=d;
		}
		
		public WebElement username() {
			return driver.findElement(login_uname);		
		}
		public WebElement pswrd() {
			return driver.findElement(login_pswd);		
		}
		public WebElement click_signin() {
			return driver.findElement(sign_in);		
		}
		public WebElement click_stay_signin() {
			return driver.findElement(stay_signin);		
		}

}
