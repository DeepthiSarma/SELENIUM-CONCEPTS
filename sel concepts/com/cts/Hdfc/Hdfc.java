package com.cts.Hdfc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		// to access a html page inside another page
		
		driver.switchTo().frame("login_page");
		
	// can use both ways	
	driver.findElement(By.name("fldLoginUserId")).sendKeys("deepthiallamud");
	driver.findElement(By.xpath("//input[@ name='fldLoginUserId']")).sendKeys("deepthiallamud");
	
		
		//driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		
		WebElement conele=driver.findElement(By.xpath("//img[@alt='continue']"));
		String imgSrc= conele.getAttribute("src");
		System.out.println(imgSrc);
		conele.click();
		
		//coming out of the frame
		
		driver.switchTo().defaultContent();
	}

}
