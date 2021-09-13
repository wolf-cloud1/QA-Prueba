package allureReportes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class WebingTest {
	
	WebDriver driver;
			
	@BeforeClass
	public void setUp() {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alvaro\\Downloads\\chromedriver\\chromedriver.exe"); // /usr/bin/google-chrome
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
			
	}
	
	@Test	
	public void google() {
		
		WebElement hola = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		hola.sendKeys("buscar");
	}
		
	@AfterClass
	public void tearDown()
	{	
		driver.quit();
	}
	
}
