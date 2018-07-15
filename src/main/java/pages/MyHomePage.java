package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class MyHomePage extends WebDriverServiceImpl {
	
	public MyHomePage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	PageFactory.initElements(driver, this);
	}
	
	public MyHomePage() {
		
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	
	@Given("click leads")
	public MyLeadsPage clickLeads()
	{
		click(eleLeads);
		return new MyLeadsPage(driver, test);
	}
	

}
