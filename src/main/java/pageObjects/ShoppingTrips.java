package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingTrips {
	
	public WebDriver driver;
	
	public ShoppingTrips(WebDriver d) {
		this.driver=d;
	}
	
	//Hamburger Menu
	By menu = By.xpath("//div[@id='sidebarLinksName1']"); 
	
	public WebElement menu() {
		return driver.findElement(menu);	
	}
	
	By search = By.xpath("//input[@id='shopTripsSearchTextId']");
	
	public WebElement search() {
		return driver.findElement(search);	
	}
	
	By upcoming = By.xpath("//div[@id='shopTripsUpcomingId']");
	
	public WebElement upcoming() {
		return driver.findElement(upcoming);	
	}
	
	By Upcoming_calendar = By.xpath("//p-calendar[@id='shopTripsSearchTargetDate']/span/button");
	
	public WebElement Upcoming_calendar() {
		return driver.findElement(Upcoming_calendar);	
	}
	
	By select_date = By.xpath("//td[contains(@class,'p-datepicker-today ng-star-inserted')]");
	
	public WebElement select_date() {
		return driver.findElement(select_date);	
	}
	
	By count = By.xpath("//div[@id='shopTripsTtlSchdulCount']");
	
	public WebElement count() {
		return driver.findElement(count);	
	}
	
	By new_schedule = By.xpath("//button[@id='shopTripsNewScheduleBtn']");
	
	public WebElement new_schedule() {
		return driver.findElement(new_schedule);	
	}
	
	By Save = By.xpath("//button[@id='newSchDlSaveBtn']");
	
	public WebElement Save() {
		return driver.findElement(Save);	
	}
	
	By Cancel = By.xpath("//button[@id='newSchDlCancelBtn']");
	
	public WebElement Cancel() {
		return driver.findElement(Cancel);	
	}
	
	By agent_dropdown = By.xpath("//select[@id='newSchDlAgentDrpdwn']");
	
	public WebElement agent_dropdown() {
		return driver.findElement(agent_dropdown);	
	}
	
	By agent_select = By.xpath("//select[@id='newSchDlAgentDrpdwn']/option");
	
	public List<WebElement> agent_select() {
		return driver.findElements(agent_select);	
	}
	
	By store_dropdown = By.xpath("//select[@id='newSchDlCompDrpdwn']");
	
	public WebElement store_dropdown() {
		return driver.findElement(store_dropdown);	
	}
	
	By store_select = By.xpath("//select[@id='newSchDlCompDrpdwn']/option");
	
	public List<WebElement> store_select() {
		return driver.findElements(store_select);	
	}	
	
	By address_dropdown = By.xpath("//select[@id='newSchDlAddressDrpdwn']");
	
	public WebElement address_dropdown() {
		return driver.findElement(address_dropdown);	
	}
	
	By address_select = By.xpath("//select[@id='newSchDlAddressDrpdwn']/option");
	
	public List<WebElement> address_select() {
		return driver.findElements(address_select);	
	}
	
	By list_dropdown = By.xpath("//select[@id='shoppingList']");
	
	public WebElement list_dropdown() {
		return driver.findElement(list_dropdown);	
	}
	
	By list_select = By.xpath("//select[@id='shoppingList']/option");
	
	public List<WebElement> list_select() {
		return driver.findElements(list_select);	
	}
	
	By trip_name = By.xpath("//input[@id='newSchDlShopTripNameInput']");
	
	public WebElement trip_name() {
		return driver.findElement(trip_name);	
	}
	
	By trip_calendar = By.xpath("//span[@class='p-button-icon pi pi-calendar']");
	
	public WebElement trip_calendar() {
		return driver.findElement(trip_calendar);	
	}
	
	By target_date = By.xpath("//ul[@id='shopTripsListPanelUlId']/li[1]/div/div");
	
	public WebElement target_date() {
		return driver.findElement(target_date);	
	}
	
	//ul[@id='shopTripsListPanelUlId']/li[1]/div/div/div[1]
	
	By agent_name = By.xpath("//ul[@id='shopTripsListPanelUlId']/li[1]/div/div[2]/div[1]/div[1]");
	
	public WebElement agent_name() {
		return driver.findElement(agent_name);	
	}
	
	By competitor_name = By.xpath("//ul[@id='shopTripsListPanelUlId']/li[1]/div/div[2]/div[3]/div[1]");
	
	public WebElement competitor_name() {
		return driver.findElement(competitor_name);	
	}

}
