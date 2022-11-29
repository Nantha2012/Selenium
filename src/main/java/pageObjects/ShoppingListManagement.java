package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingListManagement {
	
public WebDriver driver;
	
//Hamburger Menu
	By menu = By.xpath("//div[@id='sidebarLinksName1']"); 
	
//Notification	
	By notif = By.xpath("//span[@id='notification']");	  
	By notif_close = By.xpath("//button[@type='button']");	
	
//New List button
	By NewList = By.xpath("//button[@class='shopping_list_add_button']");
	
//Hofer Dropdown
	By hofer_dropdown = By.xpath("//span[@class='userLogin_dropdown_icon ng-star-inserted']"); 
	By filter_category = By.xpath("//div[@id='category_head']");     
	By category_select = By.xpath("//ul[@class='filter-options']/li[2]");
	By search_field = By.xpath("//div[@class='suggestions-container is-visible']/ul/li[1]");
	By search_text = By.xpath("//div[@class='input-container']/input");
	By search_result = By.xpath("//li[@class='item ng-star-inserted']");
	
//Input List Name
	By listName = By.xpath("//input[@id='shopListNameSearchId']");
	
//Competitor
	By Comp_dropdown = By.xpath("//div[@role='button']"); 
	By Comp_select = By.xpath("//ul[@role='listbox']/p-dropdownitem[2]"); 
	
//	By inp_prod_drop = By.xpath("//div[@class='p-inputgroup']/span/span[1]");   //product dropdown All
	  
//Save	
	By Save = By.xpath("//button[@id='shpLstAddModAddSaveBtnId']");
	By Cancel = By.xpath("//button[@id='shpLstAddModAddCnclBtnId']");

//Search by Keyword
	By Search = By.xpath("//input[@id='shopListPnlSrchListId']");
	By list_click = By.xpath("//div[@class='shopping_panel_list_name']");
	By item_count = By.xpath("//small[@class='shopping_detail_noOfItems_tile']");
	By Modify = By.xpath("//button[@id='shopLstDtlMdfyBtnId']");
	By add_item_type = By.xpath("//ng-autocomplete[@id='sharedCompSearchId']/div/div/input");
	

//Competitor Check Box
	By chk_Comp = By.id("shopDetailCompCheckBoxId");
	By chk_Comp_dropdown = By.xpath("//select[@id='competitor-sku']");
	By chk_Comp_dropdown_select = By.xpath("//select[@id='competitor-sku']/option[3]");

//Filters(All, Active, Inactive)
	
	By filter = By.xpath("//button[@class='shopping_list_filter_button']");
	By filter_three = By.xpath("/html/body/div/div/ul");
	
//Upload
	
	By upload = By.xpath("//div[@class='uploadBox']/input");
	
	By delete = By.xpath("//button[@id='shopLstDtlDelBtnId']");

	By CRUD = By.xpath("//div[@class='CRUD-items col-lg-3 col-md-6 col-sm-6'][4]/button");
//	By Delete_confirm = By.xpath("//div[@class='p-dialog-footer ng-tns-c26-8 ng-star-inserted']/button/span");
	By Delete_confirm = By.xpath("//button[@id='shpLstDtlDltDltBtnId']");
	
	By duplicate = By.xpath("//div[@class='CRUD-items col-lg-3 col-md-6 col-sm-6'][3]/button");
	
	By add_items_error = By.xpath("//div[@id='shpLstAddModAddItmsFrmLstId']");
	
	By Commodity = By.xpath("//div[@id='commodity_head']");
	By commodity_select = By.xpath("//ul[@class='filter-options']/li[1]");
	
	By no_item = By.xpath("//div[@id='shpLstAddModNoItemFoundId']");
	
	By list_exists = By.xpath("//div[@class='error-display ng-star-inserted']");
	
	By status = By.xpath("//div[@id='shopItemStatus0']");
	
	By deactive = By.xpath("//button[@id='shpLstAddModInActiveId']");
	By active = By.xpath("//button[@id='shpLstAddModActiveId']");
	
	By count = By.xpath("//small[@id='shopLstDtlShpLstCntId']");
	
	By column_name = By.xpath("//thead[@class='p-datatable-thead']/tr/th/div/div[1]/span/span");
	
	By hofer_search = By.xpath("//input[@id='shopLstDtlSrchBxId']");
	
	public WebElement delete() {
		return driver.findElement(delete);
	}
	
	public WebElement hofer_search() {
		return driver.findElement(hofer_search);
	}
	
	public List<WebElement> column_name() {
		return driver.findElements(column_name);
	}
	
	public WebElement count() {
		return driver.findElement(count);
	}
	
	public WebElement deactive() {
		return driver.findElement(deactive);
	}
	
	public WebElement active() {
		return driver.findElement(active);
	}
	
	public WebElement status() {
		return driver.findElement(status);
	}
	
	public WebElement list_exists() {
		return driver.findElement(list_exists);
	}
	
	public WebElement no_item() {
		return driver.findElement(no_item);
	}
	
	public WebElement Commodity() {
		return driver.findElement(Commodity);
	}
	
	public WebElement commodity_select() {
		return driver.findElement(commodity_select);
	}
	
	public WebElement add_items_error() {
		return driver.findElement(add_items_error);
	}
	
	public ShoppingListManagement(WebDriver d) {
		this.driver=d;
	}

	public WebElement hmenu() {
		return driver.findElement(menu);
	}
	
	public WebElement Cancel() {
		return driver.findElement(Cancel);
	}
	
	public WebElement search_text() {
		return driver.findElement(search_text);
	}
	
	public WebElement notif() {
		return driver.findElement(notif);
	}	
	
	public WebElement notif_close() {
		return driver.findElement(notif_close);
	}	
	
	public WebElement NewList() {
		return driver.findElement(NewList);
	}	
	
	public WebElement dropdown() {
		return driver.findElement(hofer_dropdown);
	}	
	
	public WebElement listName() {
		return driver.findElement(listName);
	}	
	
	public WebElement Comp_dropdown() {
		return driver.findElement(Comp_dropdown);
	}
	
	public WebElement Comp_select() {
		return driver.findElement(Comp_select);
	}
	
	public WebElement filter_category() {
		return driver.findElement(filter_category);
	}
	
	public WebElement category_select() {
		return driver.findElement(category_select);
	}
	
	public WebElement search_field() {
		return driver.findElement(search_field);
	}
	
	public WebElement Save() {
		return driver.findElement(Save);
	}
	
	public WebElement Search() {
		return driver.findElement(Search);
	}
	
	public List<WebElement> list_click() {
		return driver.findElements(list_click);
	}
	
	public WebElement item_count() {
		return driver.findElement(item_count);
	}
	
	public WebElement Modify() {
		return driver.findElement(Modify);
	}
	
	public WebElement chk_Comp() {
		return driver.findElement(chk_Comp);
	}
	
	public WebElement chk_Comp_dropdown() {
		return driver.findElement(chk_Comp_dropdown);
	}
	
	public WebElement chk_Comp_dropdown_select() {
		return driver.findElement(chk_Comp_dropdown_select);
	}
	
	public WebElement filter() {
		return driver.findElement(filter);
	}
	
	public List<WebElement> filter_three() {
		return driver.findElements(filter_three);
	}
	
	public WebElement add_item_type() {
		return driver.findElement(add_item_type);
	}
	
	public WebElement upload() {
		return driver.findElement(upload);
	}
	
	public WebElement CRUD() {
		return driver.findElement(CRUD);
	}
	
	public WebElement duplicate() {
		return driver.findElement(duplicate);
	}
	
	public WebElement Delete_confirm() {
		return driver.findElement(Delete_confirm);
	}
	
	public WebElement search_result() {
		return driver.findElement(search_result);
	}
	
}
