package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.findElement(By.xpath("//label[@for = 'yes']")).click();
		WebElement notSelected = driver.findElementByXPath("//label[@for = 'Unchecked']//input");
		// WebElement Selected = driver.findElementByXPath("//label[@for = 'Checked']//input");
		if(notSelected.isSelected()) {
			System.out.println("Unchecked option is selected by default");
		}
		else {
			System.out.println("Checked option is selected by default");
		}
		//WebElement age1 = driver.findElement(By.xpath("(//input[@value='0'])[3]"));
		WebElement age2 = driver.findElement(By.xpath("(//input[@value='1'])[3]"));
		//WebElement age3 = driver.findElement(By.xpath("//input[@value='2']"));
		
		if(age2.isSelected())
		{
			System.out.println("Your age is selected already");
		}
		else {
			age2.click();
		}



		
		

	}

}
