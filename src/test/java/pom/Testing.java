package pom;

import java.io.IOException;

import org.excel.Base;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.dockerjava.api.model.Driver;

public class Testing extends Base{

	
	@BeforeClass
	public static void  BeforeClass() {
		chromeLaunch();
		getUrl("http://adactinhotelapp.com/BookedItinerary.php");
		maximize();// TODO Auto-generated method stub

	}
	
	@Test
	public void execute() throws IOException, InterruptedException {
		JuHotelLogin juHotelLogin = new JuHotelLogin();
		juHotelLogin.login("jeganvenu","jegan@6898");
		
		SearchHotel search = new SearchHotel();
		search.searchHotels ("Sydney", "Hotel Sunshine", "Deluxe", "1 - One", "1 - One", "1 - One");
		
		
		SelectHotel selectHotel = new SelectHotel();
		selectHotel.select();
		selectHotel.btnContinue();
		
		
		Book book = new Book();
		book.booking( "VISA","March", "2013");
		
		Thread.sleep(6000);
		
		BookingConfirm confirm = new BookingConfirm();
		confirm.bookingCnfrm();
		
		BookedItenary bookedItenary = new BookedItenary();
		bookedItenary.itenary();
		// TODO Auto-generated method stub

	}
	
	
	
	
	
}
