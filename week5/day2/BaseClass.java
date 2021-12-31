package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ChromeDriver driver;
	public String fileName;

	@Parameters({"username","password"}) //name should be exactly matched, order can vary
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(String uName, String pWord) { //name can be anything, but order matters
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
									//rows column
		/*
		 * String[][] data = new String[2][3];
		 * 
		 * data[0][0] = "Testleaf"; //index starts with 0 data[0][1] = "Hari";
		 * data[0][2] = "R";
		 * 
		 * data[1][0] = "Qeagle"; data[1][1] = "Babu"; data[1][2] = "M";
		 * 
		 * return data;
		 */
		return ReadExcel.readData(fileName);
	
	}
}
