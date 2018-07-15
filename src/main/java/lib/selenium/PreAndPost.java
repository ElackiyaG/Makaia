package lib.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import data.reader.ReadExcel;

public class PreAndPost extends WebDriverServiceImpl {
	
	public String testCaseName, testCaseDes, module, author, category,excelName;
	
  @Parameters({"url","usrname","pwd"})
  @BeforeMethod(groups= {"Smoke", "Sanity"})
  public void beforeMethod(String url, String usrname, String pwd) {
	  
	//for reports
			startTestModule(module);
			test.assignAuthor(author);
			test.assignCategory(category);
			
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, usrname);
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, pwd);
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
  }

  @AfterMethod(groups= {"Smoke", "Sanity"})
  public void afterMethod() {
	  System.out.println("After Method executed successfully");
	  closeActiveBrowser();
  }

  @BeforeClass(groups= {"Smoke", "Sanity"})
  public void beforeClass() {
	 
	  startTestCase(testCaseName, testCaseDes);		
	  System.out.println("Before Class executed successfully");
  }

  @AfterClass(groups= {"Smoke", "Sanity"})
  public void afterClass() {
	  System.out.println("After Class executed successfully");
  }

  @BeforeTest(groups= {"Smoke", "Sanity"})
  public void beforeTest() {
	  System.out.println("Before Test executed successfully");
  }

  @AfterTest(groups= {"Smoke", "Sanity"})
  public void afterTest() {
	  System.out.println("After Test executed successfully");
  }

  @BeforeSuite(groups= {"Smoke", "Sanity"})
  public void beforeSuite() {
	  startReport();
	  System.out.println("Before Suite executed successfully");
  }

  @AfterSuite(groups= {"Smoke", "Sanity"})
  public void afterSuite() {
	  endResult();
	  System.out.println("After Suite executed successfully");
  }
  
  @DataProvider(name="Test")
	public String[][] getData() throws IOException
	{
		/*Object [][] data = new Object[1][5]; // can be given String if all data are String type, since combination of String and Integer Object is given
		data[0][0]="TCS";
		data[0][1]="Elackiya";
		data[0][2]="Gunlan";
		data[0][3]="Conference";
		data[0][4]= 9790282;

		data[1][0]="PayPal";
		data[1][1]="Vino";
		data[1][2]="Suresh";
		data[1][3]="Conference";
		data[1][4]= 979028;*/
		ReadExcel read = new ReadExcel();
		String[][] data = read.readExcel(excelName);

		return data;
	}

}
