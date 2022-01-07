package pom;

import org.excel.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Base {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
	}
	@FindBy(id="radiobutton_0")
	public WebElement btnSelect;
	
	@FindBy(id="continue")
	public WebElement btnContinue;

	public WebElement getBtnSelect() {
		return btnSelect;
	}
	
	public void select() {
		click(btnSelect);// TODO Auto-generated method stub

	}
	public void btnContinue() {
		click(btnContinue);// TODO Auto-generated method stub

	}
}
