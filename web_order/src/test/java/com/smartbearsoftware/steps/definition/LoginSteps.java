package com.smartbearsoftware.steps.definition;

import org.apache.log4j.Logger;

import com.smartbearsoftware.page_objects.LoginPage;
import com.smartbearsoftware.utilities.AppProperties;
import com.smartbearsoftware.utilities.CommonStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonStep {

//	private WebDriver driver = getDriver();
	private Logger logger = Logger.getLogger(LoginSteps.class);
	private LoginPage loginPage = LoginPage.getLoginPage(getDriver());

	@Given("User navigates to home page")
	public void user_navigates_to_home_page() {
		getDriver().get(AppProperties.BASE_URL);
		logger.info("Navigated to " + AppProperties.BASE_URL);

	}

	@When("User enters Username and Password")
	public void user_enters_Username_and_Password() {
		loginPage.enterUserName("Tester");
		logger.info("Use user name as a Tester");
		loginPage.enterPassword("test");

	}

	@When("User clicks on Login button")
	public void user_clicks_on_Login_button() {
		loginPage.clickLoginButton();
	}

	@Then("User is on Web Orders page")
	public void user_is_on_Web_Orders_page() {

	}

}
