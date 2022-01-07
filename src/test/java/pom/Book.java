package pom;

import java.io.IOException;

import org.excel.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book extends Base{

	
	public Book() {
		PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	

	@FindBy(id="address")
	private WebElement txtaddress;
	

	
	@FindBy(id="cc_num")
	private WebElement cardNumber;
	
	@FindBy(id="cc_type")
	private WebElement dDncardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnexpmon;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	

	@FindBy(id="book_now")
	private WebElement btnBook;


	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getAddress() {
		return txtaddress;
	}

	

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getdDncardtype() {
		return dDncardtype;
	}

	public WebElement getdDnexpmon() {
		return dDnexpmon;
	}

	public WebElement getdDnexpyear() {
		return dDnexpyear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}
	
	public WebElement getBtnBook() {
		return btnBook;
	}
	
	
	public void booking( String cardType,String expmon,String expyy) throws IOException {
		sendKeys(getTxtFirstName(),getData("adactin", 1, 2));
		sendKeys(getTxtLastName(),getData("adactin", 1, 3));
		sendKeys(getAddress(), getData("adactin", 1, 4));
		sendKeys(getCardNumber(),getData("adactin", 1, 5));
		selectOptionsByText(getdDncardtype(), cardType);
		selectOptionsByText(getdDnexpmon(), expmon);
		selectOptionsByText(getdDnexpyear(), expyy);
		sendKeys(getCvvNum(), getData("adactin", 1, 6));
		click(getBtnBook());// TODO Auto-generated method stub

	}

	
	
	
	
	
	
}
