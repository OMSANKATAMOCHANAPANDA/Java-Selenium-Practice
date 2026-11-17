package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");;
		driver.manage().window().maximize();	
		
		//name
		//driver.findElement(By.name("Search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplaystatus);
		
		//linktest & PartialLinktest
		//driver.findElement(By.linkTest("Tablets")).click();exact name which is availabel in web that must me need for identify.
        driver.findElement(By.partialLinkText("Table")).click();//according to similar name is applicable for identify.
        
        //class
        List<WebElement> headerLinks=driver.findElement(By.className("list-inline-item"));
        System.out.println("Totla Number of header links:"+headerLinks.size()); 
        
        //tag
        List<WebElement> Links=driver.findElement(By.tagName("a"));
        System.out.println("Totla Number of header links:"+Links.size());
        
        List<WebElement> Images=driver.findElement(By.tagName("img"));
        System.out.println("Totla Number of header links:"+Images.size()); 
	}

}
