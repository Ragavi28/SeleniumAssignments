package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
	driver.get("http://www.leafground.com/pages/radio.html");
	
WebElement enjoyClassButton=driver.findElement(By.id("yes"));
enjoyClassButton.click();


WebElement unChecked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
WebElement Checked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));

boolean num1=unChecked.isSelected();
boolean num2=Checked.isSelected();
System.out.println("num1 is:"+num1);
System.out.println("num2 is:"+num2);

WebElement ageButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
ageButton.click();
	
	
	}

}
