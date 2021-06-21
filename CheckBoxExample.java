package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxExample {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
	driver.get("http://www.leafground.com/pages/checkbox.html");
	
	
	
	WebElement languageButton1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
	languageButton1.click();
		
	WebElement checkedButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		
		
	boolean button=	checkedButton.isSelected();
		System.out.println("button is selected:"+button);
		
		
		
		WebElement click1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		
		WebElement click2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(click1.isSelected()) {
			
			click1.click();
		
		
		
		
		}
		else {
			click2.isSelected();
			click2.click();
		}
		
		
		
		
	}

}
