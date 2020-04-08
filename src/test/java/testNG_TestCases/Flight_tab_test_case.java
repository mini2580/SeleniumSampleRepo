package testNG_TestCases;

import PageFactoryConcept.ExpediaHomePage;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Flight_tab_test_case {
	
	WebDriver driver;
	String baseUrl;
	ExpediaHomePage obj;
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mini\\Documents\\Testing\\mylib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  obj = new ExpediaHomePage(driver);
	  baseUrl = "https://www.expedia.com";
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @Test
  public void test_flight_tab() throws InterruptedException {
	  
	  driver.get(baseUrl);
	  obj.flight_tab_click();
	  Thread.sleep(2000);
	  obj.flying_from_txt();
	  Thread.sleep(2000);
	  obj.destination_txt();
	  Thread.sleep(2000);
	  obj.flight_depart_date_select();
	  Thread.sleep(2000);
	  
	  obj.flight_return_date_select();
	  Thread.sleep(2000);
	  obj.submit_click();
	  
	  
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
