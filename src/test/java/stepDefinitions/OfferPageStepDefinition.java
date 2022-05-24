package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.GenericUtils;
import utils.TestContextSetup;

public class OfferPageStepDefinition {

	WebDriver driver;
	String offerpageProductName;
	String landingpageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageobjectmanager;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	
	//@Then("user searched for {string} shortname in offers page")
	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException {
		
		switchToOffersPage();
		OffersPage offerspage =  testContextSetup.pageObjectManager.getOffersPage();
		
		//OffersPage offerspage = new OffersPage(testContextSetup.driver);
		offerspage.searchItem(shortName);
	    //testContextSetup.driver.findElement(By.id("search-field")).sendKeys(shortName);
	    
	    Thread.sleep(3000);
	    offerpageProductName = offerspage.getProductName();
	    //offerpageProductName = testContextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	    
	    System.out.println(offerpageProductName);
	}
	
	public void switchToOffersPage()
	{
		//pageobjectmanager = new PageObjectManager(testContextSetup.driver);
		
		
		LandingPage landingpage =  testContextSetup.pageObjectManager.getLandingPage();
		landingpage.selecttopDealsPage();
		testContextSetup.genericUtils.SwitchWindowToChild();
		
	}
	
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(offerpageProductName, testContextSetup.landingpageProductName);
	}
	
	
	
}
