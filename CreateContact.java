package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.xpath("//div[@id = 'label']/a")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Midhuna");
		driver.findElement(By.id("lastNameField")).sendKeys("Suseendar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Midhuna");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Suseendar");

		driver.findElement(By.xpath("(//tr/td/input)[8]")).sendKeys("Software");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Create contact Assignment");

		driver.findElement(By.xpath("(//td[@colspan = '4'])[7]/input")).sendKeys("midhuna@gmail.com");
		WebElement st = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(st);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();

		driver.findElement(By.className("subMenuButton")).click();

		driver.findElement(By.id("updateContactForm_description")).clear();

		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Fill important note");
		driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();

		String title = driver.getTitle();
		System.out.println("Page title :" + title);
		String orgTitle = "View Contact | opentaps CRM";

	}

}
