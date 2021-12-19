package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapshot {

	public static void main(String[] args) throws IOException {
		// setup the driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	//	options.setHeadless(true);

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);

		// Load the URL
		driver.get("http://www.leafground.com/pages/Alert.html");

		// Maximize the Browser
		driver.manage().window().maximize();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// Screenshot of WebPage
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/leafground.png");
		FileUtils.copyFile(source, destination);
		
		// Screenshot of WebElement
		
		WebElement alertBox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		File sourceEle = alertBox.getScreenshotAs(OutputType.FILE);
		File destinationEle = new File("./alertBox.png");
		FileUtils.copyFile(sourceEle, destinationEle);
		
	}
}
