package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//find the number of rows in the WebTable and use it in the for loop condition
		int rowCount = driver.findElements(By.xpath("//table[@id='table_id']//tr")).size();
		
				
		for (int i = 2; i <= rowCount; i++) { //rows
			
			int cellCount = driver.findElements(By.xpath("//table[@id='table_id']//tr["+i+"]/td")).size();
			
			for (int j = 1; j <= cellCount; j++) { //cell or data
				if(j==3) {
					driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]/input")).click();
				}else {
					
					String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText();
					System.out.println(text);
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
