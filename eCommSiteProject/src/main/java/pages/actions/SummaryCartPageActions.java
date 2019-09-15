package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.SummaryCartPageLocators;
import utils.seleniumDriver;

public class SummaryCartPageActions {
	
	SummaryCartPageLocators summaryCartPageLocators = null;
	
	public SummaryCartPageActions()
	{
		this.summaryCartPageLocators = new SummaryCartPageLocators();
		PageFactory.initElements(seleniumDriver.getDriver(), summaryCartPageLocators);
	}
	
	public String verifyProducts() throws InterruptedException
	{
		String productsTxt = summaryCartPageLocators.products.getText();
		return productsTxt;
	}
	
	public void proceedCheckOut_01SummaryPg()
	{
		summaryCartPageLocators.proceed.click();
	}
	
	public String verifyAddressPg1()
	{
		String addressTxt1 = summaryCartPageLocators.addressTxt.getText();
		return addressTxt1;
	}
	public boolean verifyAddressPg()
	{
		return summaryCartPageLocators.addressTxt.isDisplayed();
		
	}
	public void proceedBtn_03AddressPg()
	{
		summaryCartPageLocators.Submit_ProceedBtn.click();
	}
	public void clickCheckBox()
	{
		
		summaryCartPageLocators.checkBox.isDisplayed();
		summaryCartPageLocators.checkBox.click();
	}
	public void clickProceedBtn_ShippingPg()
	{
		summaryCartPageLocators.proceedtoChartShippingPg.click();
	}
	
	public void payBankWire()
	{
		summaryCartPageLocators.bankWire.isDisplayed();
		summaryCartPageLocators.bankWire.click();
	 	
	}
	
	public void summary() throws InterruptedException 
	{
		proceedCheckOut_01SummaryPg();
		verifyAddressPg();
		proceedBtn_03AddressPg();
		Thread.sleep(2000);
		clickCheckBox();
		clickProceedBtn_ShippingPg();
		payBankWire();
		
	}
	

}
