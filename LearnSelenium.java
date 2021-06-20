package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		   
		WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				
					driver.findElement(By.id("username")).sendKeys("demosalesmanager");
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					driver.findElement(By.className("decorativeSubmit")).click();
					driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
					
					driver.findElement(By.linkText("Leads")).click();
					driver.findElement(By.linkText("Create Lead")).click();
					driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
					driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ragavi");
					
					driver.findElement(By.className("smallSubmit")).click();
					
				driver.close();
			}

	
	

	}


