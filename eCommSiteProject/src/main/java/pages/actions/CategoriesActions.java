package pages.actions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.CategoriesPageLocators;
import utils.seleniumDriver;

public class CategoriesActions {
		
	CategoriesPageLocators categoriesPageLocators = null;
	
	public CategoriesActions()
	{
		this.categoriesPageLocators = new CategoriesPageLocators();
		PageFactory.initElements(seleniumDriver.getDriver(),categoriesPageLocators);
	}
	
	public void clickItem()
	{	
		categoriesPageLocators.Item1.isDisplayed();
		categoriesPageLocators.Item1.click();
	}
	
	public void clickItem2() throws InterruptedException
	{
		Thread.sleep(2000);
		categoriesPageLocators.Item2.isDisplayed();
		categoriesPageLocators.Item2.click();
	}
	
	public void clickAddToCart()
	{
		
		categoriesPageLocators.AddtoCartBtn.isDisplayed();
		categoriesPageLocators.AddtoCartBtn.click();
	}
	
	public void clickAddtoCartItem2()
	{
		/*Actions actions = new Actions(seleniumDriver.getDriver());
		actions.moveToElement(categoriesPageLocators.AddtoCartBtn2).perform();*/
		categoriesPageLocators.AddtoCartBtn2.isDisplayed();
		categoriesPageLocators.AddtoCartBtn2.click();
	}
	
	public boolean verifySuccessMsg()
	{
		return categoriesPageLocators.successMsg.isDisplayed();
	}
	public void clickContinueShoppingBtn() throws InterruptedException
	{
		categoriesPageLocators.continueShpBtn.click();
		Thread.sleep(3000);
		//categoriesPageLocators.navigateWomenPage.click();
		seleniumDriver.NavigateBackBrowserPage();
	}
	
	public void clickProceedToCheckOutBtn()
	{
		categoriesPageLocators.proceedToCheckOutBtn.click();
	}
	
		
	
}
