package pom;

import org.excel.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Base {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
	}

	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnNoOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultsPerRoom;
	
	

	@FindBy(id="child_room")
	private WebElement dDnChildrenPerRoom;

	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void searchHotels(String location,String hotels,String roomType,String adultsPerRoom,String childrenPerRoom,String noOfRoom) {
		selectOptionsByText(getdDnLocation(), location);
		selectOptionsByText(getdDnHotels(), hotels);
		selectOptionsByText(getdDnRoomType(), roomType);
		selectOptionsByText(getdDnNoOfRooms(), noOfRoom);
		//sendKeys(getTxtCheckInDate(), checkInDate);
		
		selectOptionsByText(getdDnAdultsPerRoom(), adultsPerRoom);
		selectOptionsByText(getdDnChildrenPerRoom(), childrenPerRoom);
		click(getBtnSearch());// TODO Auto-generated method stub

	}
	
	
	
	
	
	
}
