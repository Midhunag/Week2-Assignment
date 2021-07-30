package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.xpath("(//span[@class = 'x-tab-strip-text '])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("549");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9790638420");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		WebElement id = driver.findElement(By.xpath("//div[@class = 'x-grid3-body']//a"));
		String text = id.getText();
		id.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys("",text); // to get the variable
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(2000);

		String text2 = driver.findElement(By.xpath("//div[@class = 'x-paging-info']")).getText();
		
		System.out.println(text2);
		driver.close();
	}

}
