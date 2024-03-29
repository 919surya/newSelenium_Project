package newSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit01 {
	 WebDriver driver;
	 
	 @BeforeClass
	 public static void beforeClass() {
		 System.out.println("Before Class");
	 }
	 
	 @AfterClass
	 public static void afterClass() {
		 System.out.println("After Class");
	 }
	@Before
	public void init() {
		System.out.println("Init Method");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://techfios.com/billing/?ng=admin/");
		
	}
	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("Login Test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();		
		Thread.sleep(3000);	
		
	}
	@Test
	public void negloginTest() throws InterruptedException {
		System.out.println("NegLogin Test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc12345");
		driver.findElement(By.name("login1")).click();		
		Thread.sleep(3000);	
		
	}
	@After
	public void tearDown() {
		System.out.println("TearDown");
//		driver.close();
		driver.quit();
	}
}
