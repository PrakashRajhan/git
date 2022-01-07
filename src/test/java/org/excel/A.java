package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\prakash rajhan\\eclipse-workspace\\Excel\\target\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row=sheet.getRow(0);
		Cell cell = row.getCell(0);
		int type = cell.getCellType();
		if (type==1) {
			String data = cell.getStringCellValue();
			System.out.println(data);
		}
		if (type==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
				String data = dateFormat.format(date);
				System.out.println(data);
			}
			else {
				double d = cell.getNumericCellValue();
				long l=(long)d;
				String data = String.valueOf(l);
				System.out.println(data);
			}
		}
	
	}
	
}
