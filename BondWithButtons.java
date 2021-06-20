package seleniumExamples;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
		
		
	WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
	driver.get("http://www.leafground.com/pages/Button.html");
	

	WebElement positionBox=driver.findElement(By.id("position"));
	org.openqa.selenium.Point xypoint=positionBox.getLocation();
	double Xvalue=xypoint.getX();
	double Yvalue=xypoint.getY();
	System.out.println("X value is:"+Xvalue+"Y value is"+Yvalue);
	
	
	
	WebElement colorButton=driver.findElement(By.id("color"));
	
	String color=colorButton.getCssValue("color");
	System.out.println("color is:"+color);
	
	
	WebElement sizeButton=driver.findElement(By.id("size"));
	
	int height=sizeButton.getSize().getHeight();
	int width=sizeButton.getSize().getWidth();
	System.out.println("the height is:"+height+"the width is:"+width);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
