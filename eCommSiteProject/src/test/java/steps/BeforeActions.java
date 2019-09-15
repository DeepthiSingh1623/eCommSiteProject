package steps;

import cucumber.api.java.Before;
import utils.seleniumDriver;

public class BeforeActions {
	
	@Before
	public static void setUp()
	{
		seleniumDriver.setUpDriver();
	}

}
