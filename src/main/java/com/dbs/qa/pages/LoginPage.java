package com.dbs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dbs.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//header/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")
	WebElement investTab;

	@FindBy(xpath = "//a[contains(text(),'Mutual Funds')]")
	WebElement mutualFundLink;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	//Verify tile
	public String investPage() {

		return driver.getTitle();

	}

	Actions actions = new Actions(driver);

	public void clickOnMutualFundLink() {

		actions.moveToElement(investTab).moveToElement(mutualFundLink).click().build().perform();

	}

}
