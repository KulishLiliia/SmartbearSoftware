package com.smartbearsoftware.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class DriverHelper {

	private int timeOutInSeconds = AppProperties.IMPLISITLY_WAIT;
	private WebDriver driver;
	
	
	public DriverHelper (WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitForElementVisibility(By by, int timeOutInSeconds) {
		new WebDriverWait(driver, timeOutInSeconds)
		.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public WebElement getElement (By by) {
		return driver.findElement(by);
	}
	
	
	public WebElement getElement (By by, int timeOutInSeconds) {
		waitForElementVisibility(by, timeOutInSeconds);
		return driver.findElement(by);
	}
	
	public void click (By by, int timeOutInSeconds) {
		
	}
	
	public void sendKeys (By by, String text, int timeOutInSeconds) {
		WebElement textBox = getElement(by, timeOutInSeconds);
		textBox.clear();
		textBox.sendKeys(text);
	}
	
	
	
	
	
	
}
