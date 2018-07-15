package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.FindLeadPage;
import pages.MyHomePage;

public class DeleteLead extends PreAndPost{

	/*@DataProvider(name="Test")
	public String[] getData()
	{
		String [] data = new String[1]; 
		data[0]="9790282";
		//data[1]="9790282";

		return data;
	}*/
	
	@BeforeTest
	public void setValue()
	{
		testCaseName="DeleteLead";
		testCaseDes="Remove an existing Lead";
		module="Lead";
		author="Elackiya";
		category="smoke";
		excelName="DeleteLead";
		
	}

	@Test(groups= {"Sanity"}, dataProvider="Test" )
	//dependsOnMethods= {"tests.CreateLead.createLead"}, alwaysRun=true
	public void deleteLead(String pHNumber) throws InterruptedException {
		
		

		FindLeadPage clickFindLeadBut = new MyHomePage(driver, test)
		.clickLeads()
		.clickFindLead()
		.clickPhone()
		.typePhoneNumber(pHNumber)
		.clickFindLeadBut();
		
		FindLeadPage flp = new FindLeadPage(driver, test);
		String firstLeadID = flp.getFirstLeadID();
		
		clickFindLeadBut.clickFirstLead()
		.clickDelButton()
		.clickFindLead()
		.typeLeadID(firstLeadID)
		.clickFindLeadBut()
		.verifyDisplayedMsg();
		
		
		

		/*WebElement eleLeads = locateElement("link", "Leads");
		click(eleLeads);

		WebElement eleCreateLead = locateElement("link", "Find Leads");
		click(eleCreateLead);*/

		/*WebElement elePhone = locateElement("xpath","//span[text()='Phone']");
		click(elePhone);*/

		/*WebElement eleAreaCode = locateElement("name","phoneAreaCode");
		type(eleAreaCode, "1");*/

		/*WebElement elePhoneNo = locateElement("name","phoneNumber");
		type(elePhoneNo, pHNumber);*/


		/*WebElement eleFindLeads = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeads);*/

		/*Thread.sleep(3000);*/

		/*WebElement eleLeadId = locateElement("xpath","(//table[@class='x-grid3-row-table']//td//a)[1]");
		String leadId = getText(eleLeadId);*/

		/*click(eleLeadId);*/

		/*WebElement eleDelete = locateElement("class","subMenuButtonDangerous");
		click(eleDelete);


		System.out.println("The deleted Lead ID is "+leadId);*/

		/*WebElement eleFindLeadsMod = locateElement("xpath","//a[text()='Find Leads']");
		click(eleFindLeadsMod);*/

		/*WebElement eleID = locateElement("name","id");
		type(eleID, leadId);*/

		/*WebElement eleFindLeadsBut = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeadsBut);


		Thread.sleep(3000);*/

		/*WebElement eleMsg = locateElement("class","x-paging-info");
		String errMsg = getText(eleMsg);

		System.out.println("Error message printed is \""+errMsg+"\"");*/

		//closeActiveBrowser();

	}

}
