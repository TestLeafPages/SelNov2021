package week2.day1;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFirefox {
	
	// Webdriver will always a new browser

	public static void main(String[] args) {
		
		// Setup the chrome driver
		WebDriverManager.firefoxdriver().setup();// static method call
		
		// Launch the chrome browser
		FirefoxDriver driver = new FirefoxDriver();
		
		// Load the URL (method --> get --> "http:://")
		driver.get("http://leaftaps.com/opentaps");
		
		// Maximise the browser
		driver.manage().window().maximize();
		
		// Get the title
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}