package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumDriver {
	
	private static seleniumDriver seleniumDriver;
	
	//init WebDriver
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	
	private seleniumDriver()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		
	}
	public static void openPage(String url)
	{
		driver.get(url);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

	public static void setUpDriver()
	{
		if(seleniumDriver == null)
		{
			seleniumDriver = new seleniumDriver();
		}
	}
	
	public static void NavigateBackBrowserPage()
	{
		driver.navigate().back();
	}
	
	public static void tearDown()
	{
		if(seleniumDriver != null)
		{
			driver.close();
			driver.quit();
		}
	}
}
