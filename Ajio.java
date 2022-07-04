package w3.Day2.assignmts;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver= new ChromeDriver(); 	//object instantiation
		driver.manage().window().maximize();		//maximize the window
		driver.get("https://www.ajio.com/");		//navigate to url
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 		//apply 30sec of implicit wait
	    driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER); //enter bags in search field
	    Thread.sleep(2000);							//give wait time of 2sec
		driver.findElement(By.xpath("//Label[@for='Men']")).click(); 		   //click on the check box  
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click(); //click the check box
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText()); //print the text
		List<WebElement> brandlist= driver.findElements(By.className("brand")); 			//store all brands using list
		Thread.sleep(2000);
		System.out.println(brandlist.size()); 			//print the size	
		for (WebElement eachwebElement : brandlist) { 	//get text of each brand using for each 
			String text = eachwebElement.getText(); 
			System.out.println(text);					 //print the text
		}
		
		List<WebElement> bagnames= driver.findElements(By.className("nameCls"));  //store all bagnames in list
		Thread.sleep(2000);
		System.out.println(bagnames.size()); 	
		for (WebElement eachbag : bagnames) { 			//get text of eachbag using for each 
			String text = eachbag.getText();
			System.out.println(text); 					//print the text
		}
	}	
}
