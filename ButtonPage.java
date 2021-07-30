package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {
	
	
     
	//public void ButtonClick() {
		// WebDriverManager.chromedriver().setup();
	     //ChromeDriver driver = new ChromeDriver();
	     //driver.manage().window().maximize();
	     
	    //WebElement button= driver.findElement(By.xpath("//button[@id='home']"));
		//button.click();
		

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	    
      
      driver.get("http://leafground.com/pages/Button.html");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//button[@id='home']")).click();
      driver.findElement(By.linkText("Button")).click();
      
    //int x,y;
      WebElement location = driver.findElement(By.xpath("//button[@id='position']"));
      Point location2 = location.getLocation();
      
      System.out.println("Position of X :" + location2.getX());
      System.out.println("Position of Y :" + location2.getY());
      
      String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
      System.out.println("The color of the button is : " + cssValue);
      
      Dimension size = driver.findElement(By.xpath("//button[@id = 'size']")).getSize();
      int height = size.height;
      int width = size.width;
      System.out.println("Size of the button "   + "Height : " + height + " Width : " + width);
      
      
      
      //System.out.println(location);
      
      
     // ButtonPage Obj = new ButtonPage();
      //Obj.ButtonClick();
     
      
      
      
      
	}

}

