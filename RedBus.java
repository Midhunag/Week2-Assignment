package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/ ");
		driver.findElement(By.id("src")).sendKeys("chenn");
		 driver.findElement(By.xpath("//li[@class='selected']")).click();
		 
		 
		driver.findElement(By.id("dest")).sendKeys("Pondicherry" + Keys.ENTER);
		//WebElement findElement = driver.findElement(By.xpath("(//td[@class='wd day'])[1]"));
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		driver.findElement(By.id("search_btn")).click();
		

	}

}
