package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.MyAccountLocators;
import utils.seleniumDriver;

public class MyAccountActions {
	
	MyAccountLocators myAccountLocators = null;
	
	public MyAccountActions()
	{
		this.myAccountLocators =  new MyAccountLocators();
		PageFactory.initElements(seleniumDriver.getDriver(), myAccountLocators);
	}
	
	public String verifyMyAcctTxt()
	{
		String myHomePgTxt = myAccountLocators.myAcctTxt.getText();
		return myHomePgTxt;
	}

	public void clickHomeBtn()
	{
		myAccountLocators.homeBtn.click();	
		
	}

}
