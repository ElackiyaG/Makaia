package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.MyHomePage;

public class CreateLead extends PreAndPost{



	@BeforeTest
	public void setValue()
	{
		testCaseName="CreateLead";
		testCaseDes="Create a new Lead";
		module="Lead";
		author="Elackiya";
		category="smoke";
		excelName="CreateLead";

	}

	@Test(groups= {"Smoke"}, dataProvider="Test")
	//invocationCount = 2, timeOut=30000
	public void createLead(String cName, String fName, String lName, String email, String pNumber) {

		new MyHomePage(driver, test)
		.clickLeads()
		.clickCreateLead()
		.typeCompName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typeEmailAddr(email)
		.typePhNumber(pNumber)
		.clickCreateLeadBut()
		.verifyFirstName(fName);
	



		/*WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);

		WebElement eleCompName = locateElement("id", "createLeadForm_companyName");
		type(eleCompName, cName);

		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, fName);

		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, lName);

		WebElement eleEmail = locateElement("id", "createLeadForm_primaryEmail");
		type(eleEmail, email);*/




		//List<WebElement> eleSelect= locateElements("tag", "select");
		//System.out.println(eleSelect.size());

		/*WebElement eleSource = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingVisibleText(eleSource, dataSource);*/

		/*WebElement elePhone = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(elePhone,pNumber );*/




		/*WebElement eleCalendar = locateElement("id", "createLeadForm_birthDate-button");
		click(eleCalendar);

		WebElement eleTable = locateElement("xpath","//div[@class ='calendar']/table");
		eleTable.findElements(By.tagName("tr"));*/

	/*	WebElement eleCreateLeadBut = locateElement("xpath", "//input[@value='Create Lead']");
		click(eleCreateLeadBut);*/

		/*//driver.close();
*/
	}


}




