package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import util.WrongPageException;

public class SeleniumTests {
	
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeSuite
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Programowanie\\SeleniumGecko\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://localhost:8090");
		
		if(!driver.findElement(By.xpath("/html/body/div/h1")).getText().equals ("AngularJS - Spring JPA - PostgreSQL")) {
			throw new WrongPageException("Incorrect page for selenium");
		}
	}

	@Test
	public void homePage() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Programowanie\\SeleniumGecko\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8090");
		System.out.print("  DUPA Test");
		System.out.print("  DUPA 2 Test");
	}

}
