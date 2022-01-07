package org.excel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JU {
	static WebDriver driver;
	@BeforeClass
	public static void beforteClass() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("http://greenscart.in/#/login?returnUrl=%2F");// TODO Auto-generated method stub

	}
	@AfterClass
	public static  void afterClass() {
		driver.quit();// TODO Auto-generated method stub

	}
	@Before
	public void before() {
		long start = System.currentTimeMillis();
		System.out.println(start);// TODO Auto-generated method stub

	}
	@After
	public void after() {
		long end = System.currentTimeMillis();// TODO Auto-generated method stub
		System.out.println(end);
	}
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(10000);
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='loginEmailId'][2]"));// TODO Auto-generated method stub
		txtUsername.sendKeys("Greens");
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='loginPassword'][2]"));
		txtPass.sendKeys("Greens@123");
		WebElement btnLogin = driver.findElement(By.className("btnRegister form-control"));
		btnLogin.click();
	
		
	}

}
