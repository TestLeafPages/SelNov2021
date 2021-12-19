package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {

		// setup the driver
		WebDriverManager.chromedriver().setup();

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://www.leafground.com/pages/Window.html");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Click on Open Home Page
		driver.findElement(By.id("home")).click();

		// Get Title and print it
		String title = driver.getTitle();
		System.out.println(title);

		// switch to new window

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
		
		System.out.println(handles.get(0));
		System.out.println(handles.get(1));
		
		driver.switchTo().window(handles.get(1));
		
		String windowHandle = driver.getWindowHandle();

		// Get Title and print it
		String secondWindowTitle = driver.getTitle();
		System.out.println(secondWindowTitle);
		
		driver.switchTo().window(handles.get(0));
		
		// Close the window
		driver.close();
		
		// Close all the open windows
		//driver.quit();
		
		
	}
}
