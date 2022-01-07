package org.excel;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\prakash rajhan\\eclipse-workspace\\Excel\\target");
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("sample");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);

	}
}
