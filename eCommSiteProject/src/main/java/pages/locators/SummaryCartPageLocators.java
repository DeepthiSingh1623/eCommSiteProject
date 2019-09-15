package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryCartPageLocators {
	
	@FindBy(xpath="//span[@id='summary_products_quantity']")
	public WebElement products;
	
	@FindBy(xpath="(//a[contains(@title,'Proceed to checkout')])[2]")
	public WebElement proceed;
	
	@FindBy(xpath="//h3[text()='Your delivery address']")
	public WebElement addressTxt;
	
	// Proceed to checkOut on PageAddress
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement Submit_ProceedBtn;
	
	//Shipping CheckBox on Shipping
	@FindBy(xpath ="//*[@id='cgv']")
	public WebElement checkBox;
		
	@FindBy(xpath="//*[@name='processCarrier']")
	public WebElement proceedtoChartShippingPg;
	
	//Payment Type
	@FindBy(xpath="//a[@class='bankwire']")
	public WebElement bankWire;
		

}
