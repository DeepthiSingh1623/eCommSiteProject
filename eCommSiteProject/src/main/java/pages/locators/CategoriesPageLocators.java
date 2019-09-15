package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPageLocators {
	
	@FindBy(xpath="//div[contains(@class,'product-container')]")
	public WebElement Item1;
	
	@FindBy(xpath="(//div[contains(@class,'product-container')])[2]")
	public WebElement Item2;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	public WebElement AddtoCartBtn;
	
	@FindBy(xpath="//*[@id='add_to_cart']")
	public WebElement AddtoCartBtn2;
		
	
	//Verify Successmsg
	@FindBy(xpath ="//*[contains(@class,'icon-ok')]")
	public WebElement successMsg;
		
	//Continue shopping
	@FindBy(xpath ="//*[contains(@title, 'Continue shopping')]")
	public WebElement continueShpBtn;
	
	@FindBy(xpath="(//a[@title='Women'])[2]")
	public WebElement navigateWomenPage;
		
	//Proceed To CheckOut
	@FindBy(xpath="//*[contains(@title, 'Proceed to checkout')]")
	public WebElement proceedToCheckOutBtn;
	
	


}
