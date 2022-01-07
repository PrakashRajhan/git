package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	//	driver.get("http://demo.automationtesting.in/Register.html");
	//	WebElement dDnskills = driver.findElement(By.id("Skills"));
	//	Select select = new Select(dDnskills);
	//	select.selectbyi
		//List<WebElement> options = select.getOptions();
		
		//File file = new File("C:\\Users\\sunil\\eclipse-workspace\\Skill\\target\\data.xlsx");
		//XSSFWorkbook workbook = new XSSFWorkbook();
		//Sheet sheet = workbook.createSheet("data");
		//for (int i = 0; i <options.size(); i++) {
			//Row row = sheet.createRow(i);
		//	Cell cell = row.createCell(0);
		//	WebElement element = options.get(i);
			//String data = element.getText();
	//		cell.setCellValue(data);
			
	//	}
		//FileOutputStream fileOutputStream = new FileOutputStream(file);
		//workbook.write(fileOutputStream);
		
		

	
	
	
	}

}
