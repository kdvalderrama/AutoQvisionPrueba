package com.qvision.auto.prueba;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSearchTest {
	
	private WebDriver driver;
	public String title;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com");
		
	}
	
	@Test
	public void testDemoblaze()
	{
		//WebElement searchbox = driver.findElement(By.name("q"));
		title = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(driver.getTitle());
	}
	
	@After
	public void turnDown()
	{
		//driver.quit();
		//driver.close();
	}

}
