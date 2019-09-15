package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import utils.seleniumDriver;

public class AfterActions {
	
	@After
	public static void tearDown(Scenario scenario)
	{
		//Capture failure screen Shot
		WebDriver driver = seleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		if(scenario.isFailed())
		{
			byte[] screenShotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenShotBytes,"image/png");
			
		}
		seleniumDriver.tearDown();
	}

}
