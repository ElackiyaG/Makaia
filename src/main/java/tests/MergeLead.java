package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.MyHomePage;

public class MergeLead extends PreAndPost{
	
	/*@DataProvider(name="Test")
	public Object[][] getData()
	{
		Object [][] data = new Object[1][2]; // can be given String if all data are String type, since combination of String and Integer Object is given
		data[0][0]="10006";
		data[0][1]="10007";
		

		return data;
	}
*/
	@BeforeTest
	public void setValue()
	{
		testCaseName="MergeLead";
		testCaseDes="Merge one lead to another lead";
		module="Lead";
		author="Elackiya";
		category="smoke";
		excelName="MergeLead";
		
	}
	
	@Test(groups= {"Sanity"}, dataProvider="Test")
	//enabled=false
	public void mergeLead(String fromId, String toId) throws InterruptedException {
		
		new MyHomePage(driver, test)
		.clickLeads()
		.clickMergeLead()
		.clickFromIcon()
		.typeLeadID(fromId)
		.clickFindLeadBut()
		.clickLeadId()
		.clickToIcon()
		.typeLeadID(toId)
		.clickFindLeadBut()
		.clickLeadId()
		.clickMergeButton()
		.clickFindLead()
		.typeLeadID(fromId)
		.clickFindLeadBut()
		.verifyDisplayedMsg();
		

		

		/*WebElement eleLeads = locateElement("link", "Leads");
		click(eleLeads);

		WebElement eleMerge = locateElement("xpath","//a[text()='Merge Leads']");
		click(eleMerge);*/

		/*WebElement eleIcon = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
		click(eleIcon);*/

		/*switchToWindow(1);*/

		/*WebElement eleID = locateElement("name", "id");
		type(eleID, fromId);*/

		/*WebElement eleFindLeads = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeads);

		Thread.sleep(3000);*/

		/*WebElement elePartyId = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(elePartyId);*/




		//switch to primary window
		//	driver.switchTo().window(windowList.get(0));
		
		/*switchToWindow(0);*/

		/*WebElement eleIcon1 = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
		click(eleIcon1);

		switchToWindow(1);

		WebElement eleID1 = locateElement("name", "id");
		type(eleID1, toId);

		WebElement eleFindLeads1 = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeads1);

		Thread.sleep(3000);

		WebElement elePartyId1 = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(elePartyId1);*/



		//switch to primary window
		//driver.switchTo().window(windowList.get(0));
		
		/*switchToWindow(0);

		WebElement eleMergeBut = locateElement("xpath","//a[text()='Merge']");
		click(eleMergeBut);

		acceptAlert();

		WebElement eleFindLeads2 = locateElement("xpath","//a[text()='Find Leads']");
		click(eleFindLeads2);

		WebElement eleID2 = locateElement("name","id");
		type(eleID2, fromId);

		WebElement eleFindLeadBut = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeadBut);

		Thread.sleep(3000);

		WebElement eleMsg = locateElement("class","x-paging-info");
		String errMsg = getText(eleMsg);


		System.out.println("The error displayed is "+errMsg);*/

		//closeActiveBrowser();	
		}

}
