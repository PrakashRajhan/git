package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Action;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I {
static WebDriver driver;
public static  void getDriver() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
}
public void moveover(WebElement element) {
	//WebElement element = driver.findElement(By.xpath(null));
	Actions actions = new Actions(driver);// TODO Auto-generated method stub
	actions.moveToElement(element).perform();
}
public void dragAndDrop(WebElement s,WebElement d) {
Actions actions = new Actions(driver);	// TODO Auto-generated method stub
actions.dragAndDrop(s, d).perform();
}
public static  void getUrl(String url) {
	driver.get(url);	
	
}
public static  void maximize() {
	driver.manage().window().maximize();
}
public void sendKeys(WebElement element,String data) {
	element.sendKeys(data);
}
public void click(WebElement element) {
	element.click();
}
public WebElement findElementById(String attributevalue) {
	WebElement element = driver.findElement(By.id(attributevalue));
	return element;
}
public WebElement findElementByName(String attributeValue) {
	WebElement element = driver.findElement(By.name("attributevalue"));
	return element;
}
public void type(WebElement element,String data) {
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("argument[0].setAttribute('value',"+data+"", element);
}
public WebElement findElementByClassName(String attributeValue) {
	WebElement element = driver.findElement(By.className("attributeValue"));
    return element;
}
public String getText(WebElement element) {
	String data1 = element.getText();
    return data1;
}
public void contextClick(WebElement element) {
	Actions actions = new Actions(driver);// TODO Auto-generated method stub
	actions.contextClick(element).perform();
}
public void doubleclick(WebElement element) {
	Actions actions = new Actions(driver);// TODO Auto-generated method stub
	actions.doubleClick(element).perform();

}
public void clickandHold(WebElement element) {
	Actions actions = new Actions(driver);// TODO Auto-generated method stub
	actions.clickAndHold(element).perform();
}
public void simpleAlert() {
	Alert alert = driver.switchTo().alert() ;
	alert.accept();		

	}
public void conformAlert() {
	Alert alert = driver.switchTo().alert();// TODO Auto-generated method stub
	alert.dismiss();
}
public void promptAlert(String values) {
	Alert alert = driver.switchTo().alert();// TODO Auto-generated method stub
	alert.sendKeys(values);
	alert.accept();
}
public void navigateBack() {
	driver.navigate().back();// TODO Auto-generated method stub

}
public void navigateFroward() {
	driver.navigate().forward();// TODO Auto-generated method stub

}

public void navigateREfresh() {
	driver.navigate().refresh();// TODO Auto-generated method stub
	
}
public void mouseOver(WebElement element) {
	Actions actions = new Actions(driver);// TODO Auto-generated method stub
	actions.moveToElement(element).perform();
}
public void optionsByIndex(WebElement element,int index) {
	Select select = new Select(element);
	select.selectByIndex(index);// TODO Auto-generated method stub

}
public void optionsByText(WebElement element,String text) {
	Select select = new Select(element);// TODO Auto-generated method stub
	select.selectByVisibleText(text);
}
public void optionsByAttribute(WebElement element,String attributevalue) {
	Select select = new Select(element);// TODO Auto-generated method stub
	select.selectByValue(attributevalue);
}
public void deselctAll(WebElement element) {
	Select select = new Select(element);// TODO Auto-generated method stub
	select.deselectAll();
}
public void deslectByIndex(WebElement element) {
	Select select = new Select(element);// TODO Auto-generated method stub
	select.deselectByIndex(0);
}
public void deselectByValue(WebElement element,String attributevalue) {
	Select select = new Select(element);// TODO Auto-generated method stub
	select.deselectByValue(attributevalue);
}
public void deselectByVisibleTExt(WebElement element,String text) {
	Select select = new Select(element);// TODO Auto-generated method stub
	select.deselectByVisibleText(text);
	
}
public  void allSelectedOptions(WebElement element) {
	Select select = new Select(element);// TODO Auto-generated method stub
	select.getAllSelectedOptions();
}
private void selectFirstOption(WebElement element) {
	Select select = new Select(element);// TODO Auto-generated method stub
	select.getFirstSelectedOption();
	
}
public String getAttibuteValue(WebElement element,String attributeName) {
	String attribute = element.getAttribute(attributeName);
	return attribute;
}
public String getAttributeValue(WebElement element) {
	String attribute = element.getAttribute("value");
	return attribute;
}
public WebElement findByXpath(String attributevalue) {
	WebElement element = driver.findElement(By.xpath("attributevalue"));
	return element;// TODO Auto-generated method stub

}
public static void closeBrowser() {
	driver.quit();// TODO Auto-generated method stub

}
public String getData(String SheetName,int rownum,int cellnum) throws IOException {
	
	String data = null;
	File file = new File("C:\\Users\\prakash rajhan\\eclipse-workspace\\Excel\\target\\demo.xlsx");
	FileInputStream fileInputStream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	Sheet sheet = workbook.getSheet(SheetName);
	Row row = sheet.getRow(rownum);
	Cell cell = row.getCell(cellnum);
	int type = cell.getCellType();
	if (type==1) {
	  data = cell.getStringCellValue();
	}
	if (type==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
			data = dateFormat.format(dateCellValue);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l =(long)numericCellValue;
			data = String.valueOf(l);
		}
	}
	return data;


}
}
