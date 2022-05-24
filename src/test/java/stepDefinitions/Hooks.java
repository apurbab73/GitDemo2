package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {

	TestContextSetup testcontextsetup;
	public Hooks(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
	}
	
	@After
	public void AfterScenario() throws IOException
	{
		testcontextsetup.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws WebDriverException, IOException
	{
		WebDriver driver = testcontextsetup.testBase.WebDriverManager();
		 if(scenario.isFailed())
		 {
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent =  FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(filecontent, "image/png", "image");
		 }
	}
}
