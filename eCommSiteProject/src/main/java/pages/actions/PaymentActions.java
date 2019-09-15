package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.PaymentPageLocator;
import utils.seleniumDriver;

public class PaymentActions {
	
	PaymentPageLocator paymentPageLocator = null;
	
	public PaymentActions()
	{
		this.paymentPageLocator = new PaymentPageLocator();
		PageFactory.initElements(seleniumDriver.getDriver(),paymentPageLocator);
	}
	
	public void clickConfirmOrderBtn()
	{
		paymentPageLocator.confirmOrder.click();
	}
	
	public Boolean verifyConfirmOrder()
	{
		return paymentPageLocator.orderConfirmation.isDisplayed();
		
	}
	

	public void verifyOrderPlacement()
	{
		clickConfirmOrderBtn();
		verifyConfirmOrder();
	}
			
	
			

}
