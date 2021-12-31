package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void createLEad() {
	  System.out.println("Test");
  }
  
  @Test
  public void editLead() {
	  System.out.println("Test1");
  }
  @Test
  public void deleteLead() {
	  System.out.println("Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }


  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }


  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }
}
