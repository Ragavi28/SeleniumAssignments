package seleniumExamples;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement Dropdown1=driver.findElement(By.id("dropdown1"));
		
		Select select=new Select(Dropdown1);
	 	select.selectByIndex(1);
		select.selectByValue("2");
		select.selectByVisibleText("loadRunner");
		
		List<WebElement> listOfOptions	=select.getAllSelectedOptions();
		int size=listOfOptions.size();
		System.out.println("the size is:"+size);
		
		Dropdown1.sendKeys("Selenium");
		
		WebElement multipleSelectBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/option[1]"));
		Select multiSelectBox=new Select(multipleSelectBox);
		
		
	multiSelectBox.selectByIndex(1);
	multiSelectBox.selectByIndex(2);
	

}
}