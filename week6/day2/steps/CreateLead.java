package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{

	@When("Click on {string} link")
	public void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();

	}
	
	@Then("{string} Page should be displayed")
	public void verifyPage(String text) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+text+"']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

}
