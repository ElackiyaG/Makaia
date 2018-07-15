package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class CreateAccount extends WebDriverServiceImpl{

	@Test
	public void editLead() throws InterruptedException {


		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleAccounts = locateElement("xpath","//a[text()='Accounts']");
		click(eleAccounts);	
		
		WebElement eleCreateAcct = locateElement("xpath","//a[text()='Create Account']");
		click(eleCreateAcct);	
		
		WebElement eleAcctName = locateElement("id", "accountName");
		type(eleAcctName, "ElackiyaGSENIYASA");
		
		WebElement eleIndustry = locateElement("name", "industryEnumId");
		selectDropDownUsingVisibleText(eleIndustry, "Computer Software");
		
		WebElement eleCurrency = locateElement("id", "currencyUomId");
		selectDropDownUsingValue(eleCurrency, "INR");
		
		WebElement eleSource = locateElement("id", "dataSourceId");
		selectDropDownUsingValue(eleSource, "LEAD_EMPLOYEE");
		
		WebElement eleMarket = locateElement("id", "marketingCampaignId");
		selectDropDownUsingVisibleText(eleMarket, "Affiliate Sites");
		
		WebElement elePhone = locateElement("id", "primaryPhoneNumber");
		type(elePhone, "9790282822");
		
		WebElement eleCity = locateElement("id", "generalCity");
		type(eleCity, "Chennai");
		
		WebElement eleEmail = locateElement("id", "primaryEmail");
		type(eleEmail, "elackiya.guna@gmail.com");
		
		WebElement eleCountry = locateElement("id", "generalCountryGeoId");
		selectDropDownUsingValue(eleCountry, "IND");
				
		WebElement eleState = locateElement("id", "generalStateProvinceGeoId");
		selectDropDownUsingValue(eleState, "IN-TN");
		
		WebElement eleCreateAcctBut = locateElement("xpath","//input[@value='Create Account']");
		click(eleCreateAcctBut);
		
		WebElement eleAccountName = locateElement("xpath","(//span[@class='tabletext'])[3]");
		String acctNameID = eleAccountName.getText();
		String acctID = acctNameID.replaceAll("[a-zA-Z() ]", "");
		String acctName = acctNameID.replaceAll("[0-9() ]", "");
		
		System.out.println(acctID);
		System.out.println(acctName);
		
		
		WebElement eleFindAcct = locateElement("xpath","//a[text()='Find Accounts']");
		click(eleFindAcct);
		
		WebElement eleAcctNameInp = locateElement("xpath","(//input[@name='accountName'])[2]");
		type(eleAcctNameInp, acctName);
		
		WebElement eleAcctID = locateElement("xpath","//input[@name='id']");
		type(eleAcctID, acctID);
		
		
		WebElement eleFindAcctBut = locateElement("xpath","//button[text()='Find Accounts']");
		click(eleFindAcctBut);
		
		
		WebElement eleAcctIDtab = locateElement("xpath","//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']");
		verifyExactText(eleAcctIDtab, acctID);
		
		closeActiveBrowser();
		
	}
}
		
		
		