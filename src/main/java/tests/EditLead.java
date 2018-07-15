package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.FindLeadPage;
import pages.MyHomePage;

public class EditLead extends PreAndPost{


	@BeforeTest
	public void setValue()
	{
		testCaseName="EditLead";
		testCaseDes="Searh and edit a Lead";
		module="Lead";
		author="Elackiya Gunalan";
		category="smoke";
		excelName="EditLead";

	}

	@Test(groups= {"Smoke"}, dataProvider="Test")
	//dependsOnMethods= {"tests.CreateLead.createLead"}, description="Edit Module in LeafTaps"
	public void editLead(String fName, String cName) throws InterruptedException {

		new MyHomePage(driver, test)
		.clickLeads()
		.clickFindLead()
		.typeFirstName(fName)
		.clickFindLeadBut()

		.clickFirstLead()
		.verifyTitle("View Lead | opentaps CRM")
		.clickEditButton()
		.clear()
		.editCompanyName(cName)
		.clickUpdateButton()
		.getCompanyName();


		/*WebElement eleLeads = locateElement("link", "Leads");
		click(eleLeads);

		WebElement eleCreateLead = locateElement("link", "Find Leads");
		click(eleCreateLead);*/

		/*WebElement eleFirstName = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(eleFirstName, fName);

		WebElement eleFindLeads = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeads);*/



		/*WebElement eleTable = locateElement("xpath","(//table[@class='x-grid3-row-table']//td[1]//a)[1]");
		click(eleTable);*/

		/*
		boolean verifyExactTitle = verifyExactTitle("View Lead | opentaps CRM");

		if(verifyExactTitle)
		{
			System.out.println("The title is valid");
		}
		else
		{
			System.out.println("The title is invalid");
		}*/


		/*WebElement eleEdit = locateElement("xpath","//a[text()='Edit']");
		click(eleEdit);*/


		/*WebElement eleCompanyName = locateElement("id", "updateLeadForm_companyName");
		eleCompanyName.clear();
		type(eleCompanyName, cName);

		WebElement eleUpdate = locateElement("xpath","//input[@value='Update']");
		click(eleUpdate);

		WebElement eleCompanyNameUpdate = locateElement("id", "viewLead_companyName_sp");
		String text = getText(eleCompanyNameUpdate);

		System.out.println("The updated company name is "+text);*/

		//closeActiveBrowser();

	}

}
