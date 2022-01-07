package org.excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void BrowserLaunch(String browser) {
		System.out.println("Running browser is"+browser);// TODO Auto-generated method stub
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}
		else if (browser.equals("ie")) {
			
			WebDriverManager.iedriver().setup();
			 driver =new InternetExplorerDriver();
		} 
		driver.get("https://www.facebook.com/");
	}

}
