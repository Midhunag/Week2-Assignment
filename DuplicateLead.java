package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.xpath("//div[@id = 'label']/a")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//given by mentor
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//driver.findElement(By.name("submitButton")).click();
		/* driver.findElement(By.xpath("(//span[@class = 'x-tab-strip-text '])[3]")).click();
		
		driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("jamroth07@gmail.com\r\n");
		driver.findElement(By.xpath("(//button[@class = 'x-btn-text'])[7]")).click();*/
		
	//	WebElement name = driver.findElement(By.linkText("Leelavathi")).click();
	//	String capturedName = name.getText();
	//	name.click();
		
		 WebElement capturedName1 = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a"));
		 String capturedName = capturedName1.getText();
		// driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 Thread.sleep(1000);
		
	driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		String title1 = "Duplicate Lead | opentaps CRM";
		
		if(title.equals(title1))
		{
			System.out.println("The title is same");
		}		
		else {
			System.out.println("Title is different");
		}
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//driver.findElement(By.xpath("(//td[@class='label'])[40]/following-sibling::td/input")).click();
		//driver.findElement(By.className("smallSubmit")).click();
		WebElement name1 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String duplicateName = name1.getText();
		
		if (capturedName.equals(duplicateName)) {
			System.out.println("Both the name are same so the created lead name is duplicate");
		
		}
		else
		{
			System.out.println("The names are not same");
	}
		//driver.close();
	}

}
