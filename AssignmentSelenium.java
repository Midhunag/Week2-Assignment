package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("(//div[@class = 'controls'])[2]/input")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String titlePage = "ACME System 1 -  Log In";
		String titlePage1 = driver.getTitle();
		
		if(titlePage.equals(titlePage1))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is not correct");
		}
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		driver.close();
	}

	private static void Thread(int i) {
		// TODO Auto-generated method stub
		
	}

}
