package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Matching_Summary {
	
public WebDriver driver;
	
	By match_sum = By.xpath("//div[@id='sidebarLinksName5']");
	
	public WebElement match_sum() {
		return driver.findElement(match_sum);
	}
	
	By column_header = By.xpath("//th[@role='columnheader']/div/div[1]/span/span[1]");
	
	public List<WebElement> column_header() {
		return driver.findElements(column_header);
	}
	
	By filter_column = By.xpath("//thead[@class='p-datatable-thead']/tr/th");
	
	public List<WebElement> filter_column() {
		return driver.findElements(filter_column);
	}
	
	By filter_dropdown = By.xpath("//div[contains(@class,'p-multiselect-trigger')]");
	
	public List<WebElement> filter_dropdown() {
		return driver.findElements(filter_dropdown);
	}
	
	By checkbox = By.xpath("//ul[@role='listbox']/p-multiselectitem/li");
	
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
	
	By clear_icon = By.xpath("//button[@id='mtchSmryClrBtnId']");
	
	public WebElement clear_icon() {
		return driver.findElement(clear_icon);
	}
	
	By filtered_data = By.xpath("//tbody[@class='p-datatable-tbody']/tr/td[1]");
	
	public List<WebElement> filtered_data() {
		return driver.findElements(filtered_data);
	}
	
	public Matching_Summary(WebDriver d) {		
		this.driver=d;
		}
	
}
