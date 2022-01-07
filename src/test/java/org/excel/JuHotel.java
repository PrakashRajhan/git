package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JuHotel extends I{
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		 	getDriver();
			getUrl("https://adactinhotelapp.com/index.php");
			maximize();

	}
	@Test
	public void test() throws IOException, InterruptedException {

		WebElement txtuser = findElementById("username");
		String name = getData("demo1", 1, 0);
		sendKeys(txtuser, name);
		
		WebElement txtpass = findElementById("password");
		String pass = getData("demo1", 1, 1);
		sendKeys(txtpass, pass);
		
		WebElement btnlogin = findElementById("login");
		click(btnlogin);
		
		WebElement txtsearchhotel = findByXpath("//starts-with(text(),'Search Hotel')]");
		String text = getText(txtsearchhotel);
		System.out.println(text);
		Assert.assertEquals("verify search hotel", "Search Hotel (Fields marked with Red asterix (*) are mandatory)", text);
		
		WebElement dwnloc = findElementById("location");
		optionsByIndex(dwnloc, 2);
		
		WebElement dwnhotel = findElementById("hotels");
		optionsByIndex(dwnhotel, 1);
		
		WebElement dwnroom = findElementById("room_type");
		optionsByIndex(dwnroom, 0);
		
		WebElement dwnnoofroom = findElementById("room_nos");
		optionsByIndex(dwnnoofroom, 5);
		
		WebElement dwnadult = findElementById("adult_room");
		optionsByIndex(dwnadult, 2);
		
		WebElement dwnchild = findElementById("child_room");
		optionsByIndex(dwnchild, 1);
		
		WebElement btnsubmit = findElementById("Submit");
		click(btnsubmit);// TODO Auto-generated method stub
		
		WebElement txtselecthotel = findByXpath("//td[contains(text(),'Select Hotel')]");
		String text2 = getText(txtselecthotel);
		System.out.println(text2);
		Assert.assertEquals("verify select hotel", "Select Hotel", text2);
		
		WebElement btnselect = findElementById("radiobutton_2");
		click(btnselect);
		
		WebElement btncontinue = findElementById("continue");
		click(btncontinue);
		

		WebElement txtbookhotel = findByXpath("//td[contains(text(),'Book A Hotel')]");
		String text3 = getText(txtbookhotel);
		Assert.assertEquals("verify booh hotel", "Book A Hotel", text3);
		
		WebElement txtfirst = findElementById("first_name");
		String first = getData("demo1", 1, 2);
		sendKeys(txtfirst, first);
		
		WebElement txtlast = findElementById("last_name");
		String last = getData("demo1", 1, 3);
		sendKeys(txtlast, last);
		
		WebElement txtaddress = findElementById("address");
		String address = getData("demo1", 1, 4);
		sendKeys(txtaddress, address);
		
		WebElement txtcard = findElementById("cc_num");
		String card = getData("demo1", 1, 5);
		sendKeys(txtcard, card);
		
		WebElement cardtype = findElementById("cc_type");
		optionsByIndex(cardtype, 1);
		
		WebElement dwnmonth = findElementById("cc_exp_month");
		optionsByIndex(dwnmonth, 5);
		
		WebElement dwnyear = findElementById("cc_exp_year");
		optionsByIndex(dwnyear, 5);
		
		WebElement txtcvv = findElementById("cc_cvv");
		String cvv =getData("demo1", 1, 6);
		sendKeys(txtcvv, card);
		
		WebElement btnbook = findElementById("book_now");
		click(btnbook);
		
		Thread.sleep(10000);
		
		WebElement txtfinal = findElementById("order_no");
		String text1 = getAttributeValue(txtfinal);
		System.out.println(text1);
		
		File file = new File("C:\\Users\\jegan\\eclipse-workspace\\Company\\target\\demo.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("hotel");
		Row row = sheet.getRow(1);
		Cell cell = row.createCell(8);
		cell.setCellValue(text1);
		
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		
		WebElement lnkItinerry = findByXpath("//a[text()='Booked Itinerary']");
		lnkItinerry.click();
		
		WebElement txtorderid = findElementById("order_id_text");
		String orderid = getData("hotel", 1, 8);
		sendKeys(txtorderid, orderid);
		
		WebElement btngo = findElementById("search_hotel_id");
		btngo.click();
		
		WebElement btncancel = findElementByName("ids[]");
		btncancel.click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		WebElement txtcancel = findElementById("search_result_error");
		String cancel = getText(txtcancel);
		Assert.assertEquals("order id cancel or not", "he booking has been cancelled.", cancel);
		
		WebElement btnlogout = findElementById("logout");
	    btnlogout.click();
	}
	//@AfterClass
	//public static void afterClass() {
	//closeBrowser();
	//}
	
	}


