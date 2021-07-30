package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeliniumFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         String titleorg = "Leaftaps - TestLeaf Automation Platform";
         String title = driver.getTitle();
         if(titleorg.equals(title)) {
        	 System.out.println("Correct page");
        	 
         }
         else {
        	 System.out.println("wrong page");
         }
         driver.findElement(By.linkText("CRM/SFA")).click();

	}

}
