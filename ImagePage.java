package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[@for = 'home']/following-sibling::img")).click();
	     driver.findElement(By.xpath("(//a[@class = 'wp-categories-link maxheight'])[4]")).click();

		 WebElement findElement = driver.findElement(By.xpath("(//label[@for = 'position']/following-sibling::img)[2]"));
        
		//for mouse operation need actions method to perform
		 
		 Actions action = new Actions(driver);
         Actions moveToElement = action.moveToElement(findElement);
         Thread.sleep(1000);
         moveToElement.click().perform(); // simple form : action.moveToElement(findElement).click().perform();
         
	}

}
