package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.selenium.PreAndPost;

public class CreateLeadPage extends PreAndPost {

	public CreateLeadPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	public CreateLeadPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompName;

	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;

	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;

	@FindBy(id="createLeadForm_primaryEmail")
	WebElement eleEmailAddr;

	@FindBy(id="createLeadForm_primaryPhoneNumber")
	WebElement elePhNumber;

	@FindBy(xpath="//input[@value='Create Lead']")
	WebElement eleCreateLeadBut;

	@And("type companyname as (.*)")
	public CreateLeadPage typeCompName(String cName)
	{
		type(eleCompName, cName);
		return this;
	}

	@And("type firstname as (.*)")
	public CreateLeadPage typeFirstName(String fName)
	{
		type(eleFirstName, fName);
		return this;
	}

	@And("type lastname as (.*)")
	public CreateLeadPage typeLastName(String lName)
	{
		type(eleLastName, lName);
		return this;
	}

	@And("type email as (.*)")
	public CreateLeadPage typeEmailAddr(String emailAddr)
	{
		type(eleEmailAddr, emailAddr);
		return this;
	}

	@And("type phone as (.*)")
	public CreateLeadPage typePhNumber(String phNumber)
	{
		type(elePhNumber, phNumber);
		return this;
	}

	@Then("click Create Lead")
	public ViewLeadPage clickCreateLeadBut()
	{
		click(eleCreateLeadBut);
		return new ViewLeadPage(driver, test);
	}


}
