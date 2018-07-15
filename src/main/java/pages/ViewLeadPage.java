package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class ViewLeadPage extends WebDriverServiceImpl {
	
	public ViewLeadPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	PageFactory.initElements(driver, this);
	}
	
	public ViewLeadPage() {
		
	PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstName;
	

	public ViewLeadPage verifyFirstName(String text)
	{
		verifyExactText(eleFirstName, text);
		return this;
	}
	
		
	public ViewLeadPage verifyTitle(String title)
	{
		boolean flag = verifyExactTitle(title);
		if(flag)
			System.out.println("Title is verified and valid");
		else
			System.out.println("Title is verified and invalid");
		return this;
	}
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement eleEditBut;
	
	public OpenTapsPage clickEditButton()
	{
		click(eleEditBut);
		return new OpenTapsPage(driver, test);
	}
	
		
	@FindBy(id="viewLead_companyName_sp")
	WebElement eleCompanyName;
	
	public ViewLeadPage getCompanyName()
	{
		String companyName = getText(eleCompanyName);
		System.out.println("Updated company name is: "+companyName);
		return this;
	}
	
	@FindBy(xpath="//a[text()='Duplicate Lead']")
	WebElement eleDupBut;
	
	public DuplicateLeadPage clickDupButton()
	{
		click(eleDupBut);
		return new DuplicateLeadPage(driver, test);
	}
	
	@FindBy(className ="subMenuButtonDangerous")
	WebElement eleDelBut;
	
	public MyLeadsPage clickDelButton()
	{
		click(eleDelBut);
		return new MyLeadsPage(driver, test);
	}
	

}
