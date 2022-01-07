package org.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tst extends Base{

	//@Parameters({"UserName","Password"})
	//@Test
	//private void chromeBrowser(String name,String pass) {
	//	chromeLaunch();
	//	getUrl("https://www.facebook.com/");
	//	maximize();
	//	WebElement txtusername = findElementById("email");
		//sendKeys(txtusername,name);
		
	//	WebElement txtpassword = findElementById("pass");
	//	sendKeys(txtpassword, pass);
	//	WebElement btnlogin = findElementByName("login");
	//	click(btnlogin);
	//}
	
	
	//@Parameters({"UserName","Password"})
	//@Test
	//private void fireFoxBrowser(String name,String pass) {
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new InternetExplorerDriver();
		//getUrl("https://www.facebook.com/");
	//	maximize();
		//WebElement txtusername = findElementById("email");
	//	sendKeys(txtusername,name);
		
		//WebElement txtpassword = findElementById("pass");
		//sendKeys(txtpassword, pass);
		//WebElement btnlogin = findElementByName("login");
		//click(btnlogin);
	//}
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void BrowserLaunch(String browser) {
		System.out.println("Running browser is"+browser);// TODO Auto-generated method stub
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 
			
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement textFacebook=driver.findElement(By.xpath("//h2[contains(text(),'F')]"));
		
		WebElement txtUsername=driver.findElement(By.id("email"));
		txtUsername.sendKeys("prakash@gmail.com");
		WebElement txtPass=driver.findElement(By.id("pass"));
		txtPass.sendKeys("123mail");
		WebElement btnLogin=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		btnLogin.click();
	}
	
	@Parameters("ebrowser")
	@Test(priority = 2)
	private void ieLaunch(String ebrowser) {
		System.out.println("Running browser is"+ebrowser);// TODO Auto-generated method stub
		if (ebrowser.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		
		} 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement textFacebook=driver.findElement(By.xpath("//h2[contains(text(),'F')]"));
		
		WebElement txtUsername=driver.findElement(By.id("email"));
		txtUsername.sendKeys("123@gmail.com");
		WebElement txtPass=driver.findElement(By.id("pass"));
		txtPass.sendKeys("123mail");
		WebElement btnLogin=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		btnLogin.click();
	}
	
	@Parameters("fbrowser")
	@Test(priority = 3)
	private void firefoxLaunch(String fbrowser) {
		System.out.println("Running browser is"+fbrowser);// TODO Auto-generated method stub
		if (fbrowser.equals("fire")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		} 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement textFacebook=driver.findElement(By.xpath("//h2[contains(text(),'F')]"));
		
		WebElement txtUsername=driver.findElement(By.id("email"));
		txtUsername.sendKeys("123@gmail.com");
		WebElement txtPass=driver.findElement(By.id("pass"));
		txtPass.sendKeys("123mail");
		WebElement btnLogin=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		btnLogin.click();
	}
}