package org.excel;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Date {
	public static void main(String[] args) {
		Date date=new Date();
			System.out.println(date);
	  SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yy");
	  String data=dateformat.format(date);
	  System.out.println(data);
	}

}
