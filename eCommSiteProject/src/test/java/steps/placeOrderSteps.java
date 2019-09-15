package steps;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CategoriesActions;
import pages.actions.HomePageActions;
import pages.actions.MyAccountActions;
import pages.actions.PaymentActions;
import pages.actions.SummaryCartPageActions;
import utils.seleniumDriver;

public class placeOrderSteps {

	HomePageActions homePageActions = new HomePageActions();
	MyAccountActions myAccountActions = new MyAccountActions();
	CategoriesActions categoriesActions = new CategoriesActions();
	SummaryCartPageActions summaryCartPageActions = new SummaryCartPageActions();
	PaymentActions paymentActions = new PaymentActions();

	@Given("^Iam on the home page of ecomm site \"([^\"]*)\"$")
	public void iam_on_the_home_page_of_ecomm_site(String website) throws Throwable {

		seleniumDriver.openPage(website);
	}

	@When("^I click on sign In Link$")
	public void i_click_on_sign_In_Link() throws Throwable {
		homePageActions.clickSignIn();
	}

	@When("^enter userid \"([^\"]*)\"$")
	public void enter_userid(String uid) throws Throwable {
		homePageActions.enterUserId(uid);
	}

	@When("^enter Password \"([^\"]*)\"$")
	public void enter_Password(String pwd) throws Throwable {
		homePageActions.enterPwdtxt(pwd);
	}

	@Then("^click Submit Button$")
	public void click_Submit_Button() throws Throwable {
		homePageActions.clickSubmitBtn();
	}

	@Then("^user should Login successfully and see \"([^\"]*)\" page$")
	public void user_should_Login_successfully_and_see_page(String arg1) throws Throwable {
		String Actual = myAccountActions.verifyMyAcctTxt();
		Assert.assertEquals(Actual, arg1);
	}

	@Then("^I click Home Button to see items to buy$")
	public void i_click_Home_Button_to_see_items_to_buy() throws Throwable {
		myAccountActions.clickHomeBtn();
	}

	@Then("^click ItemOne$")
	public void select_ItemOne() throws Throwable {
		categoriesActions.clickItem();
	}

	@Then("^click Add to cart button$")
	public void click_Add_to_cart_button() throws Throwable {
		categoriesActions.clickAddToCart();
		categoriesActions.verifySuccessMsg();
	}


	@Then("^click continue shopping$")
	public void click_continue_shopping() throws Throwable {
		categoriesActions.clickContinueShoppingBtn();
		
	}

	@Then("^click ItemTwo$")
	public void click_ItemTwo() throws Throwable {
		categoriesActions.clickItem2();
	}
	
	@Then("^click Add to cart button for secondItem$")
	public void click_Add_to_cart_button_for_secondItem() throws Throwable {
		categoriesActions.clickAddtoCartItem2();
		categoriesActions.verifySuccessMsg();
	}

	@Then("^Proceed to Checkout button$")
	public void proceed_to_Checkout_button() throws Throwable {
		categoriesActions.clickProceedToCheckOutBtn();
	}

	@Then("^I should see \"([^\"]*)\" in the cart$")
	public void i_should_see_in_the_cart(String arg1) throws Throwable {
		String ActualProducts = summaryCartPageActions.verifyProducts();
		Assert.assertEquals(arg1, ActualProducts);

	}

	@Then("^Navigate all pages of cart summary to confirm Order and Pay$")
	public void Navigate_all_pages_of_cart_summary_to_confirm_Order_and_Pay() throws Throwable {
		summaryCartPageActions.summary();
	}

	@Then("^I should see \"([^\"]*)\" is successful$")
	public void i_should_see_is_successful(String arg1) throws Throwable {
		paymentActions.verifyOrderPlacement();

	}

}
