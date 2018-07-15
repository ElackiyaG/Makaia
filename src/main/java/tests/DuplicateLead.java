package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.FindLeadPage;
import pages.MyHomePage;
import pages.ViewLeadPage;

public class DuplicateLead extends PreAndPost{
	
	/*@DataProvider(name="Test")
	public Object[][] getData()
	{
		Object [][] data = new Object[1][2]; // can be given String if all data are String type, since combination of String and Integer Object is given
		data[0][0]="gopinath@testleaf.com";
		data[0][1]="Duplicate Lead | opentaps CRM";
		
		return data;
	}*/

	@BeforeTest
	public void setValue()
	{
		testCaseName="DuplicateLead";
		testCaseDes="Duplicate an existing Lead";
		module="Lead";
		author="Elackiya";
		category="smoke";
		excelName="DuplicateLead";
		
	}

	@Test(groups= {"Sanity"}, dataProvider="Test")
	public void duplicateLead(String emailAddr) throws InterruptedException {
		
		

		FindLeadPage findLeadPage = new MyHomePage(driver, test)
		.clickLeads()
		.clickFindLead()
		.clickEmail()
		.typeEmailAddr(emailAddr)
		.clickFindLeadBut();
		
		FindLeadPage findLead = new FindLeadPage(driver,test);
		String firstRowName = findLead.getFirstRowName();
		
		findLeadPage.clickFirstRowName()
		.clickDupButton()
		.clickCreateLeadBut()
		.verifyFirstName(firstRowName);
		
		

		/*WebElement eleLeads = locateElement("link", "Leads");
		click(eleLeads);*/

		/*WebElement eleCreateLead = locateElement("link", "Find Leads");
		click(eleCreateLead);*/

		/*WebElement eleEmail = locateElement("xpath","//span[text()='Email']");
		click(eleEmail);

		WebElement eleEmailAddr = locateElement("name","emailAddress");
		type(eleEmailAddr, emailAddr);

		WebElement eleFindLeads = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeads);*/
/*
		Thread.sleep(3000);

		WebElement eleFirstName = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
		String firstName = getText(eleFirstName);
		click(eleFirstName);*/

		/*WebElement eleDupLead = locateElement("xpath","//a[text()='Duplicate Lead']");
		click(eleDupLead);*/

		/*boolean verifyExactTitle = verifyExactTitle("Duplicate Lead | opentaps CRM");

		if(verifyExactTitle)
		{
			System.out.println("The title is valid");
		}
		else
		{
			System.out.println("The title is invalid");
		}*/

		/*WebElement eleCreLead = locateElement("xpath","//input[@value='Create Lead']");
		click(eleCreLead);*/

		/*WebElement eleFirstName1 = locateElement("id","viewLead_firstName_sp");
		String firstName1 = getText(eleFirstName1);

		if(firstName.equalsIgnoreCase(firstName1))
		{
			System.out.println(firstName+ " is equal to " +firstName1+ " .So the duplicated name is same as captured");
		}
		else
		{
			System.out.println(firstName+ " is not equal to " +firstName1+ " .So the duplicated name is not same as captured");	
		}*/

		//closeActiveBrowser();

	}

}
