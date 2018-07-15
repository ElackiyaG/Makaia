package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class FindLeadPage extends PreAndPost {

	public FindLeadPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement eleFirstName;

	public FindLeadPage typeFirstName(String fName)
	{
		System.out.println("typing first name");
		type(eleFirstName, fName);

		return this;
	}


	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLeadBut;

	public FindLeadPage clickFindLeadBut()
	{

		click(eleFindLeadBut);
		return this;

	}


	@FindBy(xpath="(//table[@class='x-grid3-row-table']//td//a)[1]")
	WebElement eleFirstLead;

	public String getFirstLeadID()
	{
		String leadID = getText(eleFirstLead);
		return leadID;

	}

	public ViewLeadPage clickFirstLead()
	{
		click(eleFirstLead);
		return new ViewLeadPage(driver, test);

	}




	@FindBy(xpath="//span[text()='Email']")
	WebElement eleEmail;

	public FindLeadPage clickEmail()
	{
		click(eleEmail);
		return this;
	}


	@FindBy(name="emailAddress")
	WebElement eleEmailTextBox;

	public FindLeadPage typeEmailAddr(String emailAddr)
	{
		type(eleEmailTextBox, emailAddr);

		return this;
	}

	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
	WebElement eleFirstRowName;

	public ViewLeadPage clickFirstRowName()
	{
		click(eleFirstRowName);
		return new ViewLeadPage(driver, test);

	}

	public String getFirstRowName()
	{
		String fName = getText(eleFirstRowName);
		return fName;

	}

	@FindBy(xpath="//span[text()='Phone']")
	WebElement elePhone;

	public FindLeadPage clickPhone()
	{
		click(elePhone);
		return this;
	}

	@FindBy(name="phoneNumber")
	WebElement elePhoneTextBox;

	public FindLeadPage typePhoneNumber(String phoneNumber)
	{
		type(elePhoneTextBox, phoneNumber);

		return this;
	}

	@FindBy(name="id")
	WebElement eleLeadID;

	public FindLeadPage typeLeadID(String leadID)
	{
		type(eleLeadID, leadID);

		return this;
	}


	@FindBy(className="x-paging-info")
	WebElement eleMsg;

	public FindLeadPage verifyDisplayedMsg()
	{
		String errMsg = getText(eleMsg);
		System.out.println("Error message printed is \""+errMsg+"\"");

		return this;
	}


	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement eleLeadId;

	
	public MergeLeadPage clickLeadId()
	{
		click(eleLeadId);
		switchToWindow(0);
		return new MergeLeadPage(driver, test);

	}


}
