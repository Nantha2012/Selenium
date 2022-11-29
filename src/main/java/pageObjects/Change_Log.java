package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Change_Log {
	
public WebDriver driver;

public Change_Log(WebDriver d) {		
	this.driver=d;
	}

	By header = By.xpath("//td[@class='header_main_menu_text']");
	
	public WebElement header() {
		return driver.findElement(header);
	}

	By change_log = By.xpath("//div[@id='sidebarLinksName8']");
	
	public WebElement change_log() {
		return driver.findElement(change_log);
	}
	
	By filter_column = By.xpath("//span[@id='chngLogActFiltId']");  // Select filter under Action Column
	
	public WebElement filter_column() {
		return driver.findElement(filter_column);
	}
	
	By filter_dropdown = By.xpath("//div[contains(@class,'p-multiselect-trigger')]"); //Click on dropdown
	
	public List<WebElement> filter_dropdown() {
		return driver.findElements(filter_dropdown);
	}
	
	By select_list = By.xpath("//ul[@role='listbox']/p-multiselectitem/li"); //List all data from dropdown
	
	public List<WebElement> select_list() {
		return driver.findElements(select_list);
	}
	
	By checkbox = By.xpath("//div[@class='p-checkbox p-component']");	
	
	public List<WebElement> checkbox() {
		return driver.findElements(checkbox);
	}
	
	By close_checkbox = By.xpath("//button[contains(@class,'p-multiselect-close p-link')]");
	
	public WebElement close_checkbox() {
		return driver.findElement(close_checkbox);
	}
	
	By clear_val = By.xpath("//div[contains(@class,'p-column-filter-buttonbar')]/button[1]");
	
	public WebElement clear_val() {
		return driver.findElement(clear_val);
	}
	
	By apply = By.xpath("//div[contains(@class,'p-column-filter-buttonbar')]/button[2]");
	
	public WebElement apply() {
		return driver.findElement(apply);
	}	
	
	By valid_text = By.xpath("//div[@class='p-multiselect-representative-option ng-star-inserted']");
	
	public List<WebElement> valid_text() {
		return driver.findElements(valid_text);
	}
	
	By filtered_data = By.xpath("//tbody[@class='p-datatable-tbody']/tr/td[1]");
	
	public List<WebElement> filtered_data() {
		return driver.findElements(filtered_data);
	}
	
}
