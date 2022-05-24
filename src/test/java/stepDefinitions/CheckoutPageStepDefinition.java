package stepDefinitions;



import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {

	public TestContextSetup testcontextsetup;
	public CheckoutPageStepDefinition(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
		//Test by Apurba 1
		//Test by Apurba 2
		System.out.println("American guy making changes 1");
		System.out.println("American guy making changes 2");
		/*
		 * Changes by the Developer
		 * 
		 * 
		 */
	}
	
	
	@Then("the checkout page is displayed")
	public void the_checkout_page_is_displayed() {
		
	}
	@Then("User validates the product name in the Checkout page with the Greenkart page")
	public void user_validates_the_product_name_in_the_checkout_page_with_the_greenkart_page() {
		
		Assert.assertEquals(testcontextsetup.pageObjectManager.getLandingPage().getProductName().split("-")[0].trim(), testcontextsetup.pageObjectManager.getCheckoutPage().getcheckoutProductName());
		
	}
	@Then("User verifies if the Apply and Place order buttons are displayed")
	public void user_verifies_if_the_apply_and_place_order_buttons_are_displayed() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(testcontextsetup.pageObjectManager.getCheckoutPage().IsApplyButtonDisplayed());
		System.out.println(testcontextsetup.pageObjectManager.getCheckoutPage().IsPlaceOrderButtonDisplayed());
		System.out.println("test in progress by Appu");
	}

	
}
