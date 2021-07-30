package week2.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://leafground.com/pages/Link.html");
     
     driver.findElement(By.linkText("Go to Home Page")).click();
     driver.navigate().back(); // to navigate back to the orginal page
     
     String attribute = driver.findElement(By.xpath("(//a[@link = 'blue'])[2]")).getAttribute("href");
     System.out.println("The page given in this link is: "+ attribute);
     
 // WebElement findElement = driver.findElements(By.tagName("a"));
 // System.out.println("The number of links found is :" + findElement.size());
    // iterator it = findElement.iterator();
     
     //To find the number of links use findElements and use size()   
  List<WebElement> findElements = driver.findElementsByTagName("a");
  System.out.println("The number of links found is :" + findElements.size());
  
  //To find the broken link
  WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
  brokenLink.click();
  String title = driver.getTitle();
  System.out.println(title);
  String title1 = "HTTP Status 404 – Not Found";
  if(title.equals(title1))
  {
	  System.out.println("The link is broken link");
	  Thread.sleep(1000);
	  driver.navigate().back();;
  }
  
//to interact with the same link
     String string1 = driver.findElement(By.xpath("//div[@class = 'large-6 small-12 columns']/a")).getAttribute("href");
      WebElement findElement = driver.findElement(By.xpath("(//div[@class = 'large-6 small-12 columns']/a)[4]"));
      String string2 = findElement.getAttribute("href");
     
     if(string1.equals(string2)) {
    	 System.out.println("Both the links are same");
    	 findElement.click();
    	 
     }
     else
     {
    	 System.out.println("Given links are different");
     }
     
	}

}
