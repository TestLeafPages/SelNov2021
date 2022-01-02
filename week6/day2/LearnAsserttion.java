package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAsserttion {
	
	@Test
	public void login() {
		
		//Leaftaps - TestLeaf Automation Platform
		
		String expTitle = "TestLeaf Automation Platform";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		String actTitle = driver.getTitle();
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actTitle, expTitle);
		
		
		//Hard Assert
		//Assert.assertEquals(actTitle, expTitle);
		
		//Assert.assertTrue(displayed); //expects true; if it found true -> pass; if it found false -> fail
		//Assert.assertFalse(displayed); //expects false; if it found true -> fail; if it found false -> pass
		
		
		
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("Matching"); } else {
		 * System.out.println("Not Matching"); }
		 */
		
		System.out.println("Last line of my program");
		
		softAssert.assertAll(); // assertAll() is mandatory as the last line of execution
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
