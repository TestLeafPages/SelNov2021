package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectable {

	public static void main(String[] args) {
		// setup the driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// options.setHeadless(true);

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);

		// Load the URL
		driver.get("http://www.leafground.com/pages/selectable.html");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Create Actions object
		Actions builder = new Actions(driver);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	//	WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	//	WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		/*
		 * builder.keyDown(Keys.CONTROL).click(item1) .click(item2) .click(item3)
		 * .click(item4) .keyUp(Keys.CONTROL) .perform();
		 */
		
		builder.clickAndHold(item1)
			.moveToElement(item3)
			.release()
			.perform();
	}
}
