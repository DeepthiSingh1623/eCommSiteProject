package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountLocators {

	@FindBy(xpath = "//*[text()='My account']")
	public WebElement myAcctTxt;
	
	//Home btn
	@FindBy(xpath="//a[contains(@class,'home')]")
	public WebElement homeBtn;
	
}
