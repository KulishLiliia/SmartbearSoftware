package com.smartbearsoftware.utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

final class DriverFactory {
	
	private static Logger logger = Logger.getLogger(DriverFactory.class);
	private static WebDriver driver;
	
	
	protected static WebDriver getDriver() {
		if(driver == null)driver = getActivedriver();
		return driver;
	}
	
	static void closeDriver() {
		if(driver !=null) {
			driver.close();
			driver.quit();
			driver=null;
		}
	}
	
	
	private synchronized static WebDriver getActivedriver() {
		String browserType = AppProperties.BROWSER_TYPE;
		switch(browserType) {
		case"chrome":
			driver = getChromeDriver();
			break;
		case"firefox":
			driver= getFireFoxDriver();
			break;
		case "edge":
			driver = getEdgeDriver();
			break;
			default:
				System.out.println("Browser type "+browserType+ " invalid");
				break;
		
		}
		
		return driver;
	}
	
	
	

	private static ChromeDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver chDriver = new ChromeDriver();
		return new ChromeDriver();
	}

	private static FirefoxDriver getFireFoxDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumFiles\\browserDrivers\\geckodriver.exe");
		WebDriver ffDriver = new FirefoxDriver();
		return new FirefoxDriver();
	}

	private static EdgeDriver getEdgeDriver() {
		System.setProperty("webdriver.edge.drive", "C:\\SeleniumFiles\\browserDrivers\\msedgedriver.exe");
		WebDriver eDriver = new EdgeDriver();
		return new EdgeDriver();

	}

}
