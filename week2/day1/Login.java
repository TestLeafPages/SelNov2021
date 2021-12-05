package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	// Webdriver will always a new browser

	public static void main(String[] args) {
		
		// Setup the chrome driver
		WebDriverManager.chromedriver().setup();// static method call
		
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL (method --> get --> "http:://")
		driver.get("http://leaftaps.com/opentaps");
		
		// Maximise the browser
		driver.manage().window().maximize();
		
		// Get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		// Find the user name and enter the value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// Find the password and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Find the login and click
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//8_ Click Create Lead Link (Menu)
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		//9_ Type the company Name (Any name)
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//10_ Type the first name (Your name)
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Babu");

		//11_ Type the last name (Your father name)
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manickam");
		
		// Select the source by its text
		WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(ele);
		dd.selectByVisibleText("Employee");
		
	
		//12_ Click Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
		// 13_ Print the source text
		String text = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(text);

		//13_ Print the title 
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		// 14_ Close the browser
		//driver.close();
		
		
		
		
	}

}