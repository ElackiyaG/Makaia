package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class DuplicateLeadPage extends PreAndPost{
	
	public DuplicateLeadPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
		
	}
	
		
	
	
	public DuplicateLeadPage verifyTitle(String title)
	{
		boolean flag = verifyExactTitle(title);
		if(flag)
			System.out.println("The title is verified and valid");
		else
			System.out.println("The title is verified and valid");	
		return this;
	}

	@FindBy(xpath="//input[@value='Create Lead']")
	WebElement eleCreateLeadBut;
	
	public ViewLeadPage clickCreateLeadBut()
	{
		click(eleCreateLeadBut);
		return new ViewLeadPage(driver, test);
	}
}
