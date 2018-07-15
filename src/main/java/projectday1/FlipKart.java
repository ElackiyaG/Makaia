package projectday1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class FlipKart extends WebDriverServiceImpl{

	@Test
	public void flipKart() throws InterruptedException {

		escape();

		WebElement eleTV = locateElement("xpath","//span[text()='TVs & Appliances']");
		WebElement eleSamsung = locateElement("xpath","(//span[text()='Samsung'])[2]");


		mouseOverClick(eleTV, eleSamsung);

		WebElement eleMin = locateElement("xpath","(//select[@class='fPjUPw'])[1]");
		selectDropDownUsingValue(eleMin, "25000");

		WebElement eleMax = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingValue(eleMax, "60000");

		WebElement eleScreenSize = locateElement("xpath","//div[text()='Screen Size']");
		click(eleScreenSize);

		WebElement elePrefsize = locateElement("xpath","//div[text()='48 - 55']");
		click(elePrefsize);

		WebElement eleFirstProd = locateElement("xpath","(//div[@class='col col-7-12'])[1]");
		click(eleFirstProd);

		WebElement elePrice = locateElement("xpath","(//div[@class='_1vC4OE _2rQ-NK'])[1]");


		String price = getText(elePrice);
		System.out.println("primary window price "+price+" primary window");

		switchToWindow(1);

		WebElement elePrice1 = locateElement("xpath", "//div[@class='_1vC4OE _3qQ9m1']");


		verifyExactText(elePrice1, price);

		closeActiveBrowser();

		switchToWindow(0);

		WebElement eleAddComp1 = locateElement("xpath", "(//span[text()='Add to Compare'])[1]");
		click(eleAddComp1);

		WebElement eleAddComp2 = locateElement("xpath", "(//span[text()='Add to Compare'])[2]");
		click(eleAddComp2);

		Thread.sleep(3000);
		WebElement eleCompare = locateElement("xpath", "//span[text()='COMPARE']");
		click(eleCompare);

		WebElement eleCompareTex = locateElement("xpath", "(//span[text()='Compare'])[1]");
		verifyExactText(eleCompareTex, "Compare");

		WebElement eleFirstPrice = locateElement("xpath","(//div[@class='_1vC4OE'])[1]");
		String firstPrice = getText(eleFirstPrice);
		String firstPriceVal = firstPrice.replaceAll("[₹,]", "");
		int firstPriceInt = Integer.parseInt(firstPriceVal);




		WebElement eleSecPrice = locateElement("xpath","(//div[@class='_1vC4OE'])[2]");
		String secPrice = getText(eleSecPrice);
		String secPriceVal = secPrice.replaceAll("[₹,]", "");
		int secPriceInt = Integer.parseInt(secPriceVal);

		if(firstPriceInt < secPriceInt)
		{
			System.out.println("The lowest price is "+firstPriceInt);
		}
		else
		{
			System.out.println("The lowest price is "+secPriceInt);
		}


		closeActiveBrowser();

	}
}


