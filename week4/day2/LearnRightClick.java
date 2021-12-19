package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRightClick {

	public static void main(String[] args) {
		// setup the driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// options.setHeadless(true);

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);

		// Load the URL
		driver.get("https://www.myntra.com/");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Create Actions object
		Actions builder = new Actions(driver);
		
		// Right Click on Men
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		
	//	builder.contextClick(men).perform();
		
		// Double Click on Men
		builder.doubleClick(men).perform();
		
		
		
		
	}
}
