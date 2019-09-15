package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPageLocator {
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement confirmOrder;
	
	@FindBy(xpath="//h1[text()='Order confirmation']")
	public WebElement orderConfirmation;

}
