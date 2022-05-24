package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {

	WebDriver driver;
	String offerpageProductName;
	String landingpageProductName;
	TestContextSetup testContextSetup;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	
	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() {
	    /*
		System.setProperty("webdriver.chrome.driver", "c://chromedriver2.exe");
	    testContextSetup.driver = new ChromeDriver();
	    testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		*/
	    
	    
	}
	//@When("User searched with Shortname {string} and extracted actual name of the product")
	@When("^User searched with Shortname (.+) and extracted actual name of the product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_the_product(String shortname) throws InterruptedException {
	    
		LandingPage landingpage =  testContextSetup.pageObjectManager.getLandingPage();
		//LandingPage landingpage = new LandingPage(testContextSetup.driver);
		landingpage.searchItem(shortname);
		
		//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		Thread.sleep(3000);
		String[] strArr=  landingpage.getProductName().split("-");
		//String[] strArr=  testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-");
		testContextSetup.landingpageProductName = strArr[0].trim();
		System.out.println(testContextSetup.landingpageProductName);
		
		
	}
	
	
}
