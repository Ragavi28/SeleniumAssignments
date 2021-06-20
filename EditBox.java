package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditBox {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
	driver.get("http://www.leafground.com/pages/Edit.html");
	
	
	WebElement emailBox =driver.findElement(By.id("email"));
	emailBox.sendKeys("ragaviraj2804@gmil.com");
	
	WebElement AppendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
	AppendBox.sendKeys("value");
	
	WebElement DefaultBox =driver.findElement(By.name("username"));
	String value=DefaultBox.getAttribute("value");
	System.out.println("value is:"+value);
	
	
	WebElement clearBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
	clearBox.clear();
	
	
	WebElement abledBox = driver.findElement(By.className("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
	Boolean enabled =abledBox.isEnabled();
	System.out.println(" enabled or not:"+enabled);
	
	

	}

}
