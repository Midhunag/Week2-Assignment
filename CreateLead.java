package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String titleorg = "Leaftaps - TestLeaf Automation Platform";
		String title = driver.getTitle();
		if (titleorg.equals(title)) {
			System.out.println("Correct page");

		} else {
			System.out.println("wrong page");
		}
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Midhuna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suseendar");
		// driver.findElement(By.id("createLeadForm_parentPartyId")).

		// Dropdown: Byvisible text
		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown = new Select(findElement);
		dropDown.selectByVisibleText("Conference");
		// Dropdown: Byindex
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown1 = new Select(findElement2);
		dropDown1.selectByIndex(4);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Midhu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Susi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.name("birthDate")).sendKeys("09/11/96");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("annualRevenue")).sendKeys("2,00,000");
		// Dropdown: Byvalue
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropDown2 = new Select(findElement3);
		dropDown2.selectByValue("INR");

		WebElement findElement4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown3 = new Select(findElement4);
		dropDown3.selectByVisibleText("Computer Software");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");

		WebElement findElement5 = driver.findElement(By.name("ownershipEnumId"));
		Select dropDown4 = new Select(findElement5);
		dropDown4.selectByIndex(5);

		driver.findElement(By.name("sicCode")).sendKeys("7389");
		driver.findElement(By.name("tickerSymbol")).sendKeys("a");
		driver.findElement(By.id("createLeadForm_description")).sendKeys(".....");
		driver.findElement(By.name("importantNote")).sendKeys("------");
		// Contact Information

		// for creating two element
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("2");

		driver.findElement(By.name("primaryPhoneNumber")).sendKeys("9854672364");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("582");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Suseendar");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("526");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleap.org");

		// Primary Address
		driver.findElement(By.name("generalToName")).sendKeys("Midhuna");
		driver.findElement(By.name("generalAttnName")).sendKeys("Suseendar");
		driver.findElement(By.name("generalAddress1")).sendKeys("15,abc nagar");
		driver.findElement(By.name("generalAddress2")).sendKeys("xys, India");
		driver.findElement(By.name("generalCity")).sendKeys("India");

		WebElement findElement6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown5 = new Select(findElement6);
		dropDown5.selectByValue("IN");

		driver.findElement(By.name("generalPostalCode")).sendKeys("605224");

		WebElement findElement7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropDown6 = new Select(findElement7);
		dropDown6.selectByValue("IND");

		driver.findElement(By.name("generalPostalCodeExt")).sendKeys("123");
		driver.findElement(By.className("smallSubmit")).click();

	}

}
