package org.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class R {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='loginEmailId'][2]"));// TODO Auto-generated method stub
		txtUsername.sendKeys("Greens");
	}

}
