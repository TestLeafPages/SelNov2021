package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schools {

	public static void main(String[] args) {
		// setup the driver
		WebDriverManager.chromedriver().setup();

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		// Maximize the Browser
		driver.manage().window().maximize();
		
		// Switch to Frame
		driver.switchTo().frame("iframeResult");
		
		// Click on Try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// Enter your name in Alert
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Haja");
		
		// Accept the alert
		alert.accept();
		
		// Verify your name is displayed successfully
		String text = driver.findElement(By.id("demo")).getText();
		
		if(text.contains("Haja")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
