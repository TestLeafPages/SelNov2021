package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToWaitForElementToDisappear {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/disapper.html");
		
		WebElement eleToDisappear = driver.findElement(By.id("btn"));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(250));
		wait.until(ExpectedConditions.invisibilityOf(eleToDisappear));
		
		String text = driver.findElement(By.tagName("strong")).getText();
		System.out.println(text);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
