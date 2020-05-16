package com.cts.magentoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT022\\Desktop\\selenium\\Selenium components\\Chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		
		//id
		
		WebElement username= driver.findElement(By.id("login-username"));
		username.sendKeys("vasanthavanukuri09@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		
		//Name
		driver.findElement(By.name("username")).sendKeys("vasanthavanukuri09@yahoo.com");
		driver.findElement(By.name("signin")).click();
		
	// xpath:
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("vasanthavanukuri09@yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

			//cssselector	
		driver.findElement(By.cssSelector("#login-username")).sendKeys("vasanthavanukuri09@yahoo.com");
		driver.findElement(By.cssSelector("#login-signin")).click();
		
		//Linktext
		
	driver.findElement(By.linkText("Forgotten username?")).click();
		
		//PartialLinktext
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//class
		driver.findElement(By.className("phone-no ")).sendKeys("vasanthavanukuri09@yahoo.com");
		driver.findElement(By.className("orko-button-primary orko-button challenge-button")).click();
	
	}
	

}
