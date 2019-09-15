package pages.actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.seleniumDriver;

public class HomePageActions {
	
	HomePageLocators homePageLocators = null;
	
	public HomePageActions()
	{
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(seleniumDriver.getDriver(), homePageLocators);
	}
	
	public void clickSignIn()
	{
		homePageLocators.signInBtn.click();
	}
	
	public void enterUserId(String uid)
	{
		homePageLocators.userId.click();
		homePageLocators.userId.clear();
		homePageLocators.userId.sendKeys(uid);	
	}
	
	public void enterPwdtxt(String pwd)
	{
		homePageLocators.password.click();
		homePageLocators.password.clear();
		homePageLocators.password.sendKeys(pwd);
			
	}
	
	public void clickSubmitBtn()
	{
		homePageLocators.submitBtn.click();	
	}
	
	
	
	
		
	

}
