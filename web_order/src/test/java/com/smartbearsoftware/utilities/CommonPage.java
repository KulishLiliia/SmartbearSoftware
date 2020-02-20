package com.smartbearsoftware.utilities;

import org.openqa.selenium.WebDriver;

/**
 * It is a Parent Class of all Page Object Classes
 * 
 * @author Owner
 *
 */

public class CommonPage {

	private DriverHelper driverHelper;

	protected CommonPage(WebDriver driver) {
		if (driverHelper == null)
			driverHelper = new DriverHelper(driver);

	}

	protected DriverHelper getDriverHelper() {
		return driverHelper;
	}

}
