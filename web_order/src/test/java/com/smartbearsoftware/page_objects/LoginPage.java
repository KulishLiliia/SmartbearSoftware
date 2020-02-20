package com.smartbearsoftware.page_objects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smartbearsoftware.utilities.CommonPage;
import com.smartbearsoftware.utilities.DriverHelper;

public class LoginPage extends CommonPage {

	private static final Logger logger = Logger.getLogger(LoginPage.class);
	private final int timeOutInSeconds = 15;

	private WebDriver driver;
	private DriverHelper driverHelper = getDriverHelper();

	private static LoginPage loginPage;

	public static LoginPage getLoginPage(WebDriver driver) {
		if (loginPage == null)
			loginPage = new LoginPage(driver);
		return loginPage;
	}

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ctl00_MainContent_username")
	private WebElement textBoxUserName;

	@FindBy(id = "ctl00_MainContent_password")
	private WebElement password;

	@FindBy(id = "ctl00_MainContent_login_button")
	WebElement loginButton;
	private By username = By.id("ctl00_MainContent_username");

	public void enterUserName(String uname) {
		textBoxUserName.sendKeys(uname);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);

	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
