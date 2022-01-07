package pom;

import java.io.IOException;

import org.excel.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends Base {
	public BookingConfirm() {
		PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
	}
	@FindBy(name="order_no")
	private WebElement txtorderid;
	
	@FindBy(id="Booked Itinerary")
	private WebElement btnItinerary1;
	
	
	
	public WebElement getTxtorderid() {
		return txtorderid;
	}


	public WebElement getBtnItinerary() {
		return btnItinerary1;
	}


	@FindBy(id="my_itinerary")
	private WebElement btnItinerary;
	
	public void bookingCnfrm() throws IOException {
		String orderid=getAttributeValue(txtorderid);
		System.out.println(orderid);
		createCell( 1, 9,orderid);
		//click(btnItinerary);// TODO Auto-generated method stub

	}
	

}
