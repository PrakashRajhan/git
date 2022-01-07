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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends Base{
	
static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
    chromeLaunch();
	getUrl("https://adactinhotelapp.com/index.php");
	maximize();
	}
	
	@Test
	public void hotelBooking() throws IOException, InterruptedException {
		WebElement txtuser = findElementById("username");
		String name = getData("adactin", 1, 0);
		sendKeys(txtuser, name);
		
		WebElement txtpass = findElementById("password");
		String pass = getData("adactin", 1, 1);
		sendKeys(txtpass, pass);
		
		WebElement btnlogin = findElementById("login");
		btnlogin.click();
		
		WebElement txtsearchhotel = findElementByXpath("//td[contains(@class,'login_title')]");
		String text = getText(txtsearchhotel);
		System.out.println(text);
		Assert.assertEquals("verify search hotel", "Search Hotel (Fields marked with Red asterix (*) are mandatory)", text);
		
		WebElement dwnloc = findElementById("location");
		selectOptionsByIndex(dwnloc, 1);
		
		WebElement dwnhotels = findElementById("hotels");
		selectOptionsByIndex(dwnhotels, 1);
		
		WebElement dwnroom = findElementById("room_type");
		selectOptionsByIndex(dwnroom, 1);
		
		WebElement dwnnoofrooms = findElementById("room_nos");
		selectOptionsByIndex(dwnnoofrooms, 2);
		
		WebElement dwnadult = findElementById("adult_room");
		selectOptionsByIndex(dwnadult, 1);
		
		WebElement dwnchild = findElementById("adult_room");
		selectOptionsByIndex(dwnchild, 1);
		
		WebElement btnsubmit = findElementById("Submit");
		btnsubmit.click();
		
		WebElement txtselecthotel = findElementByXpath("//td[contains(text(),'Select Hotel')]");
		String text2 = getText(txtselecthotel);
		System.out.println(text2);
		Assert.assertEquals("verify select hotel", "Select Hotel", text2);
		
		WebElement btnselect = findElementById("radiobutton_0");
		btnselect.click();
		
		WebElement btncontinue = findElementById("continue");
		btncontinue.click();
		
		WebElement txtbookhotel = findElementByXpath("//td[contains(text(),'Book A Hotel')]");
		String text3 = getText(txtbookhotel);
		Assert.assertEquals("verify booh hotel", "Book A Hotel", text3);
		
		WebElement txtfirst = findElementById("first_name");
		String first = getData("adactin", 1, 2);
		sendKeys(txtfirst, first);
		
		WebElement txtlast = findElementById("last_name");
		String last = getData("adactin", 1, 3);
		sendKeys(txtlast, last);
		
		WebElement txtaddress = findElementById("address");
		String address = getData("adactin", 1, 4);
		sendKeys(txtaddress, address);
		
		WebElement txtcardno = findElementById("cc_num");
		String cardno = getData("adactin", 1, 5);
		sendKeys(txtcardno, cardno);
		
		WebElement dwncardtype = findElementById("cc_type");
		selectOptionsByIndex(dwncardtype, 1);
		
		WebElement dwnmonth = findElementById("cc_exp_month");
		selectOptionsByIndex(dwnmonth, 3);
		
		WebElement dwnyear = findElementById("cc_exp_year");
		selectOptionsByIndex(dwnyear, 5);
		
		WebElement txtcvv = findElementById("cc_cvv");
		String cvv = getData("adactin", 1, 6);
		sendKeys(txtcvv, cvv);
		
		WebElement btnbook = findElementById("book_now");
		btnbook.click();
		
		Thread.sleep(10000);
		
		WebElement txtfinal = findElementById("order_no");
		String text1 = getAttributeValue(txtfinal);
		System.out.println(text1);
		
		File file = new File("C:\\Users\\prakash rajhan\\eclipse-workspace\\Excel\\target\\demo.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("adactin");
		Row row = sheet.getRow(1);
		Cell cell = row.createCell(8);
		cell.setCellValue(text1);
		
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		
		WebElement lnkItinerry = findElementByXpath("//a[text()='Booked Itinerary']");
		lnkItinerry.click();
		
		WebElement txtorderid = findElementById("order_id_text");
		String orderid = getData("adactin", 1, 8);
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
	@AfterClass
	public static void afterClass() {
	 closeBrowser();
	}
	
	

}
