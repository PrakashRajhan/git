package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\prakash rajhan\\eclipse-workspace\\Excel\\target\\Testing.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet("Sheet1");
		//Row row=sheet.getRow(2);
		//System.out.println(row);
		//Cell cell=row.getCell(1);
		//System.out.println(cell);
		int count = sheet.getPhysicalNumberOfRows();
		System.out.println(count);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows();i++) {
			Row row=sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
				
			}
		}
			

	}

}
