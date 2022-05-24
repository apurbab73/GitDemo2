package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class CheckoutPage {

	public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By checkoutProductName = By.xpath("//p[@class='product-name']");
	By applybutton = By.xpath("//button[@class='promoBtn']");
	By placeorderButton = By.xpath("//span[@class='discountAmt']/following-sibling::button[1]");
	
	
	public String getcheckoutProductName()
	{
		return driver.findElement(checkoutProductName).getText().split("-")[0].trim();
	}
	
	public boolean IsApplyButtonDisplayed()
	{
		return driver.findElement(applybutton).isDisplayed();
	}
	
	public boolean IsPlaceOrderButtonDisplayed()
	{
		return driver.findElement(placeorderButton).isDisplayed();
	}
}
