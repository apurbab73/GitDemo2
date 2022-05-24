package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search = By.xpath("//input[@type='search']");
	By productname = By.cssSelector("h4.product-name");
	By topdeals = By.linkText("Top Deals");
	By increment = By.linkText("+");
	By addToCart = By.xpath("//div[@class='product-action']/button");
	By clickCartIcon = By.xpath("//a[@class='cart-icon']/img");
	By proceedtoCheckout = By.xpath("(//div[@class='action-block'])[1]/button");
	
	
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName()
	{
		return driver.findElement(productname).getText();
	}
	
	public void selecttopDealsPage()
	{
		driver.findElement(topdeals).click();
	}
	
	public void incrementProduct(int length)
	{
		for(int i=0; i<length; i++)
		{
			driver.findElement(increment).click();
		}
	}
	public void AddToCart()
	{
		driver.findElement(addToCart).click();
	}
	public void CartIcon()
	{
		driver.findElement(clickCartIcon).click();
	}
	
	public void ProceedToCheckout()
	{
		driver.findElement(proceedtoCheckout).click();
	}
	
}
