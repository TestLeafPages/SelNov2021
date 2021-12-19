package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		// setup the driver
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setHeadless(true);
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		
		// Load the URL
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		// Click on Alert Box
		// driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		// driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		// switch to the Alert
		Alert alert = driver.switchTo().alert();
		
		
		// Get Text and print
		String alertText = alert.getText();
		
		System.out.println(alertText);
		
		alert.sendKeys("xyz");
		
		Thread.sleep(5000);
		
		// Dismissing the Alert
		alert.accept();
		
	}
}
