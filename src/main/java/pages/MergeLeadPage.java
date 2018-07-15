package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class MergeLeadPage extends PreAndPost{
	
	public MergeLeadPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//img[@src='/images/fieldlookup.gif'])[1]")
	WebElement eleFromIcon;
	
	public FindLeadPage clickFromIcon()
	{
		click(eleFromIcon);
		switchToWindow(1);
		return new FindLeadPage(driver, test);
	}
	
	@FindBy(xpath="(//img[@src='/images/fieldlookup.gif'])[2]")
	WebElement eleToIcon;
	
	public FindLeadPage clickToIcon()
	{
		click(eleToIcon);
		switchToWindow(1);
		return new FindLeadPage(driver, test);
	}
	
	@FindBy(xpath="//a[text()='Merge']")
	WebElement eleMergeBut;
	
	public MergeLeadPage clickMergeButton()
	{
		click(eleMergeBut);
		acceptAlert();
		return this;
	}
	
	@FindBy(xpath="//a[text()='Find Leads']")
	WebElement eleFindLead;
	
	public FindLeadPage clickFindLead()
	{
		click(eleFindLead);
		return new FindLeadPage(driver, test);
	}

}
