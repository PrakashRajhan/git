package pom;

import java.io.IOException;

import org.excel.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookedItenary extends BookingConfirm{
	@FindBy(xpath ="//a[text()='Booked Itinerary']")
	private WebElement btnBookedItinary;
	
	@FindBy(id="order_id_text")
	private WebElement search;
	
	@FindBy(id="search_hotel_id")
	private WebElement btnSearch;
	
	@FindBy(xpath="//input[contains(@id,'btn_id_5')]")
	private WebElement btnCancel;
	
	

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getBtnBookedItinary() {
		return btnBookedItinary;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
		
	}
	
	
	public void itenary() throws IOException {
	click(btnBookedItinary);	// TODO Auto-generated method stub
	sendKeys(search,getData("adactin", 1, 9));
	click(btnSearch);
	click(btnCancel);
	
	}
	
	
	

	
	
	


}
