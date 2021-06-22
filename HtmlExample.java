package seleniumExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlExample {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
	driver.navigate().to("http://www.leafground.com/pages/Link.html");
	
	
	WebElement homePage=driver.findElement(By.linkText("Go to Home Page"));
	homePage.click();
	driver.navigate().back();
	
	WebElement where=driver.findElement(By.partialLinkText("Find where am"));
	String locate=where.getAttribute("href");
	
	System.out.println("where link going on:"+locate);
	
	WebElement broken=driver.findElement(By.linkText("Verify am I broken?"));
	broken.click();
	String title=driver.getTitle();
	
	if(title.contains("404")) {
		System.out.println("it is broken");
	}
	
	driver.navigate().to("http://www.leafground.com/pages/Link.html");
	WebElement homePage1=driver.findElement(By.linkText("Go to Home Page"));
	homePage1.click();
	driver.navigate().back();
	WebElement options = driver.findElement(By.tagName("a"));
	
	options.getSize();
	
	
	}
	
	
	
	
	
	
	
	
	}
	
	
	


