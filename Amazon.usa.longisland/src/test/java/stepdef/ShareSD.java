package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ShareSD {

	private static final String URL = "https://www.amazon.com/";
	private static WebDriver driver = null;
	
		
@Before
	
	public static void before() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\workspace1\\Amazon.usa.longisland\\Browser_Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

	
	
	
	

	@After
	
	public static void after() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}


	
