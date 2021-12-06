package utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserlaunch  extends util_file{
	WebDriver driver;
	Properties prop;
	String path;

	public WebDriver launchBrowser() throws IOException {
		// Loading properties from properties file class
		prop = propfile();
		// getting browser name from config.properties file
		String browser = prop.getProperty("browser");
		// verifying browser name
		if (browser.equalsIgnoreCase("chrome")) {
			// getting path for chromedriver.exe
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		// verifying browser name is firefox or not
		else if (browser.equalsIgnoreCase("firefox")) {
			// getting path for geckodriver.exe
			path = System.getProperty("user.dir") + "\\src\\main\\resources\\geckodriver.exe";
			FirefoxOptions op = new FirefoxOptions();
			// using chromeoptions for disabling notifications
			op.addPreference("dom.webnotifications.enabled", false);
			// setting system variables for geckodriver
			System.setProperty("webdriver.gecko.driver", path);
			// instalizing driver with firefoxdriver
			driver = new FirefoxDriver(op);
		} else {
			System.out.println("pleae use chrome or firefox driver to execute tests");
		}
		// maximizing the browser window
		driver.manage().window().maximize();

		return driver;
	}

}
