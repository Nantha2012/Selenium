package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Competitor_Items {
	
	public WebDriver driver;

	public Competitor_Items(WebDriver d) {		
		this.driver=d;
		}
		
		By Comp_items = By.xpath("//div[@id='sidebarLinksName7']");
		
		public WebElement Comp_items() {
			return driver.findElement(Comp_items);
		}
		
		By header = By.xpath("//td[@class='header_main_menu_text']");
		
		public WebElement header() {
			return driver.findElement(header);
		}
		
		By product = By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]");
		
		public WebElement product() {
			return driver.findElement(product);
		}		
		
		By prod_column = By.xpath("//table[@class='table table-sm']/thead/tr/th");
		
		public List<WebElement> prod_column() {
			return driver.findElements(prod_column);
		}
		
		By search_box = By.xpath("//input[@id='compMgtSrchTxtId']");
		
		public WebElement search_box() {
			return driver.findElement(search_box);
		}		
		
		By price_change = By.xpath("//input[@id='compPriceId']");
		
		public WebElement price_change() {
			return driver.findElement(price_change);
		}
				
		By Save = By.xpath("//button[@id='compMgtSaveBtnId']");
		
		public WebElement Save() {
			return driver.findElement(Save);
		}
		
		By Count_items = By.xpath("//span[@id='compMgtNoOfItmsId']");
		
		public WebElement Count_items() {
			return driver.findElement(Count_items);
		}
			
		By prod_item_count = By.xpath("//span[@class='ret_mapping_itm_count_style']");
		
		public WebElement prod_item_count() {
			return driver.findElement(prod_item_count);
		}

}
