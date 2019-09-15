package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath="//a[contains(@class,'sf-with-ul')]")
	public WebElement homePg;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	public WebElement signInBtn;
	
	//SignIn
	@FindBy(xpath ="//*[@id='email']")
	public WebElement userId; 
	
	@FindBy(xpath ="//*[@id='passwd']")
	public WebElement password; 
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	public WebElement submitBtn;

}
