package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageHtmlExample {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
	driver.navigate().to("http://www.leafground.com/pages/Image.html");
	
	
	WebElement homePage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
	homePage.click();
	
	driver.navigate().back();
	
	WebElement broken=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
	
	if(broken.getAttribute("naturalWidth").equals("0")) {
		System.out.println("it is broken");
	}
	else {
		System.out.println("it is not broken");
	}
	}

}
