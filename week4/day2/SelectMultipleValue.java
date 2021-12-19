package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultipleValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		/*
		 * WebElement selenium = driver.findElement(By.
		 * xpath("//option[text()='Select your programs']/following-sibling::option[text()='Selenium']"
		 * ));
		 * 
		 * WebElement loadRunner = driver.findElement(By.
		 * xpath("//option[text()='Select your programs']/following-sibling::option[text()='Loadrunner']"
		 * ));
		 */
		  Actions builder=new Actions(driver);
	        
	        WebElement item1 = driver.findElement(By.xpath("//option[text()='Select your programs']/following::option[1]"));
	        WebElement item2 = driver.findElement(By.xpath("//option[text()='Select your programs']/following::option[4]"));
	        
		
		builder.keyDown(Keys.CONTROL).click(item1).click(item2).keyUp(Keys.CONTROL).perform();
		
	}

}
