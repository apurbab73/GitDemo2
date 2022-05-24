package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
		}
	
	public void SwitchWindowToChild()
	{
		Set<String> wh=  driver.getWindowHandles();
	    Iterator<String> it =  wh.iterator();
	    String parentWindow = it.next();
	    String childWindow = it.next();
	    driver.switchTo().window(childWindow);
	}
}
