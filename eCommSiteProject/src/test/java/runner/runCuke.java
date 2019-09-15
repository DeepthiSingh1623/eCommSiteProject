package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/features",
		glue="steps",
		tags = {"@smoke"},
		monochrome=true,
		plugin={"json:target/runCuke/cucumber.json","pretty",
		"html:target/runCuke/cucumber.html",
		"com.cucumber.listener.ExtentCucumberFormatter"})
public class runCuke extends AbstractTestNGCucumberTests
{
	
	@BeforeClass
	public static void setUp()
	{
		//Initiates the extent report
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String FileName = System.getProperty("user.dir")+"\\target\\Extent_Reports\\"+strDate+".html";
		File newFile = new File(FileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
		
		//SYSTEM INFO
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser Version", "v77.0");
		ExtentCucumberFormatter.addSystemInfo("Selenium Version", "v3.141.59");
		
		Map SystemInfo = new HashMap();
		SystemInfo.put("Cucumber Version", "v1.2.5");
		SystemInfo.put("Extent Cucumber reporter Version", "v1.1.0");
		ExtentCucumberFormatter.addSystemInfo(SystemInfo);
		
		
				
	}
	

}
