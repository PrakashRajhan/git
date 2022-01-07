package org.excel;
import java.text.SimpleDateFormat;
import java.util.Date;
public class D {
	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yy");
		String data = dateFormat.format(date);
		System.out.println(data);
		
		
	}
}
