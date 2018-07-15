package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class OpenTapsPage extends PreAndPost{
	
	public OpenTapsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleCompName;
	
	public OpenTapsPage clear()
	{
		eleCompName.clear();
		return this;
	}
	
	public OpenTapsPage editCompanyName(String cName)
	{
		type(eleCompName, cName);
		return this;
	}
	
	
	@FindBy(xpath="//input[@value='Update']")
	WebElement eleUpdateBut;
	
	public ViewLeadPage clickUpdateButton()
	{
		click(eleUpdateBut);
		return new ViewLeadPage(driver, test);
	}
}
