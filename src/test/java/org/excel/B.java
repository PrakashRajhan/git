package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\prakash rajhan\\eclipse-workspace\\Excel\\target\\dsd.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("tst");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellValue("phython");
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		System.out.println("Done");
		

	}
}
