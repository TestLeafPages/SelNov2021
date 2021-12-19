package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {

	public static void main(String[] args) {
		// setup the driver
		WebDriverManager.chromedriver().setup();
		
		// Handle BRowser Notification
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setHeadless(true);

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);

		// Load the URL
		driver.get("https://www.irctc.co.in/nget/train-search");

		// Maximize the Browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(handles.get(0));
		
		driver.close();
		
		
	}
}
