package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement byIndex = driver.findElement(By.xpath("//select[@id = 'dropdown1']"));
		Select dpD = new Select(byIndex);
		dpD.selectByIndex(1);
		
		WebElement byText = driver.findElement(By.xpath("(//div[@class = 'example'])[2]/select"));
		Select dpD1 = new Select(byText);
		dpD1.selectByVisibleText("Selenium");
		
		WebElement byValue = driver.findElement(By.xpath("(//div[@class = 'example'])[3]/select"));
		Select dpD2 = new Select(byValue);
		dpD2.selectByValue("1");
		

		WebElement number = driver.findElement(By.xpath("(//div[@class = 'example'])[4]/select"));
		Select dpD3 = new Select(number);
		int size = dpD3.getOptions().size();
		System.out.println("Size of the options given: " + size);
		
		driver.findElement(By.xpath("(//div[@class = 'example'])[5]/select")).sendKeys("Selenium");
		
		WebElement multiple = driver.findElement(By.xpath("(//div[@class = 'example'])[6]/select"));
		Select dpD4 = new Select(multiple);
		dpD4.selectByIndex(1);
		//dpD4.selectByValue("2");
		dpD4.selectByIndex(3);
		

		
		
		
		
		
		

	}

}
