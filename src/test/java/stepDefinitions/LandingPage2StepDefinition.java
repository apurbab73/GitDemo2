package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class LandingPage2StepDefinition {

	public TestContextSetup testcontextsetup;
	public LandingPage2StepDefinition(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
	}
	
	@Given("User is on GreenKart Home page")
	public void user_is_on_green_kart_home_page() {
		//Chaanges by AB
		System.out.println("American guy making changes 1");
		System.out.println("American guy making changes 2");
	}
	@When("User searched with {string} as ShortName and extracted actual name of the product")
	public void user_searched_with_as_short_name_and_extracted_actual_name_of_the_product(String shortname) {
	    testcontextsetup.pageObjectManager.getLandingPage().searchItem(shortname);
	}
	@When("increment quntitiy to {int}")
	public void increment_quntitiy_to(Integer length) throws InterruptedException {
		Thread.sleep(3000);
		testcontextsetup.pageObjectManager.getLandingPage().incrementProduct(length);
	}
	@When("Click Add to Cart")
	public void click_add_to_cart() {
		testcontextsetup.pageObjectManager.getLandingPage().AddToCart();
	}
	@When("Clcik Checkout Bag")
	public void clcik_checkout_bag() {
		testcontextsetup.pageObjectManager.getLandingPage().CartIcon();
	}
	@When("Click Proceed to Checkout")
	public void click_proceed_to_checkout() {
		testcontextsetup.pageObjectManager.getLandingPage().ProceedToCheckout();
	}
	

	
}
