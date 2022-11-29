package base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BasePage {
	
	protected static ExtentTest test;
	public static ExtentReports report;
	
	public static WebDriver c;

	public Properties prop;

	public BasePage() throws IOException
	{		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
		prop.load(fis);		
	}

	public WebDriver getDriver() throws IOException 
	{
		if (prop.getProperty("browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
			c = new ChromeDriver();
			c.manage().window().maximize();
//			c.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);			
		}  
		return c;
	}	
	
	public ExtentReports reports()
	{		
		report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");		
		return report;		
	}

//**********************************************************************************************************
	
//**********************************************************************************************************
	

//	@AfterSuite
//	public void close()
//	{
//		c.quit();
//		
//	}
//	

//	public String getUrl() throws IOException {
//		url = prop.getProperty("url");
//		return url;
//	}

//	public void takeSnapShot(WebDriver webdriver) throws IOException {
//		File srcFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
//
//		File destFile = new File(System.getProperty("user.dir") + "\\target\\screenshots\\"
//				+ timestamp() + ".png");
//
//		FileUtils.copyFile(srcFile, destFile);
//	}
//
//	public String timestamp() {
//		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
//	}
	

}
