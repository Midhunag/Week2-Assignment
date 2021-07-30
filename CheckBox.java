package week2.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.findElement(By.xpath("//div[@class = 'example']//input")).click();
		
		WebElement cb1 = driver.findElement(By.xpath("(//div[@class = 'example'])[2]//input"));
		//to find the whether the option is checked or not
		if (cb1.isSelected()) {
			System.out.println("The option is selected already");
			
		}
		else {
			System.out.println("The option is not selected");
		}
		//deselect only if checked
		WebElement cb2 = driver.findElement(By.xpath("(//div[@class = 'example'])[3]//input"));
		WebElement cb3 = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[8]"));
		
		if (!cb2.isSelected() || cb3.isSelected()) {
			//cb2.click();
			cb3.click();		
		}
		else
		{
			cb2.click();
		}
		//Click all the checkbox
		List<WebElement> element = driver.findElementsByXPath("(//div[@class = 'example'])[4]//input");
		int size = element.size();
		
		for (int i = 0; i < size; i++) {
			element.get(i).click();
			
		}
		
		

	}

}
