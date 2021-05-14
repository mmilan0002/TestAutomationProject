package com.dbs.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dbs.qa.base.TestBase;
import com.dbs.qa.pages.LoginPage;

public class MainPageTest extends TestBase {

	LoginPage loginPage;

	public MainPageTest() {

		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test
	public void investTest() throws InterruptedException {

		String title = loginPage.investPage();
		Assert.assertEquals(title, "Digital Banking - Digital Banking Services in India | digibank by DBS");
		loginPage.clickOnMutualFundLink();

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
