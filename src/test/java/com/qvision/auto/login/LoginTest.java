package com.qvision.auto.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	private WebDriver driver;
	public String URL;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://pruebadeuso.com/index.php?r=site/login");
		
	}
	
	@Test
	public void testDemoLogin()
	{
		URL = driver.getCurrentUrl();
		
		if(URL.equals(URL))
		{
			System.out.println("Página a la que desea ingresar es correcta");
			System.out.println(URL);
			
			driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).click();
			driver.findElement(By.id("LoginForm_username")).sendKeys("pruebaUsuario");
			
			driver.findElement(By.xpath("//*[@id=\"LoginForm_password\"]")).click();
			driver.findElement(By.id("LoginForm_password")).sendKeys("123*");
			
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/div[1]/input")).click();
		}
		else
		{
			System.out.println("Página a la que desea ingresar NO es correcta");
			System.out.println(URL);
		}
		System.out.println(driver.getTitle());
	}
	
	@After
	public void turnDown()
	{
		//driver.quit();
		//driver.close();
	}
}
