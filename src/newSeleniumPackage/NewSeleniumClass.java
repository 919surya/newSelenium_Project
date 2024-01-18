package newSeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSeleniumClass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soyuz\\OneDrive\\Desktop\\newSELENIUM-workspace\\crm\\driver\\chromedriver.exe");

//		init();	
//		loginTest();
//		tearDown();
//		
		init();	
		negloginTest();
		tearDown();
	}
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://techfios.com/billing/?ng=admin/");
		
	}
	public static void loginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();		
		Thread.sleep(2000);	
		
	}
	public static void negloginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc12345");
		driver.findElement(By.name("login")).click();		
		Thread.sleep(2000);	
		
	}
	public static void tearDown() {
		driver.close();
		
	}

}
