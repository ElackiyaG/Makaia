package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	/*public ChromeDriver driver;*/
	
	/*@Given("open browser and launch URL")
	public void openBrowser()
	{
		//Set driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}*/

	/*@And("login LeafTaps with username as (.*) and password as (.*)")
	public void loginLeafTaps(String userName, String pwd) {
		// Login with Usrname and Pwd
		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		
	}*/

	/*@And("go to Create Lead module")
	public void createLeadModule()
	{
		//Click the links
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@Given("fields with companyname as (.*) and firstname as (.*) and lastname as (.*)")
	public void fillMandateFields(String cName, String fName, String lName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@When("click Create Lead")
	public void clickCreateLead()
	{
		driver.findElementByXPath("//input[@value='Create Lead']").click();
	}
	
	@Then("New lead created")
	public void leadCreated()
	{
		System.out.println("New lead created successfully");
		driver.close();
		
	}*/

}
