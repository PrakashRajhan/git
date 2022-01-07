package pom;

import java.io.IOException;

import org.excel.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JuHotelLogin extends Base{
	
	public JuHotelLogin() {
		PageFactory.initElements(driver, this);// TODO Auto-generated method stub

	}
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public void login(String userName,String password) throws IOException {
		sendKeys(getTxtUserName(),getData("adactin", 1, 0));// TODO Auto-generated method stub
		sendKeys(getTxtPassword(), getData("adactin", 1, 1));
		click(login);
	}
	
	

}
