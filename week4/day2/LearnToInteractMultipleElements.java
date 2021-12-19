package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToInteractMultipleElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//to locate multiple WebElements
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		/*
		 * //to find the number of items in a list int size = allLinks.size();
		 * System.out.println(size);
		 */
		
		List<WebElement> allElements = driver.findElements(By.className("inputLogin"));
		
		for (WebElement eachElement : allElements) {
			
			String attribute = eachElement.getAttribute("name");
			System.out.println(attribute);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
