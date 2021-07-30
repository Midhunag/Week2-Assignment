package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		//Enter Email Address
		
		driver.findElement(By.xpath("//label[@for = 'email']/following-sibling::input")).sendKeys("midhunag96@gmail.com");
		
		//Append a Text
		WebElement element = driver.findElement(By.xpath("(//div[@class = 'large-6 small-12 columns'])[2]/input"));
	    Thread.sleep(3000);
	    //Keys to click tab in keyboard
		element.sendKeys("hi" + Keys.TAB);
		
		String text = driver.findElement(By.xpath("//input[@value = 'TestLeaf']")).getAttribute("value");
		System.out.println("The text entered is:" + text);
		
		driver.findElement(By.xpath("(//label[@for = 'uname'])[2]/following-sibling::input")).clear();
		
		String attribute = driver.findElement(By.xpath("//label[@for = 'disabled']/following-sibling::input")).getAttribute("disabled");
		String attribute1 = "true";
		//boolean isDisabled = true;
		
		if (attribute.equals(attribute1)){
			System.out.println("The field is disabled");
			
		}
		else {
			System.out.println("The field is not disabled");
		}
		
		

	}

}
