package com.cts.microsoft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Microsoft {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.office.com/");
		
	driver.findElement(By.id("mectrl_headerPicture")).click();
	driver.findElement(By.name("loginfmt")).sendKeys("deepthiallamudi@gmail.com");
	driver.findElement(By.id("idSIButton9")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("swrawoe4qp");
	driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	
//	WebElement ele= driver.findElement(By.id("passwordError"));
//	System.out.println(ele.getText());
	
	WebElement ele= driver.findElement(By.xpath("//div[contains(text(),'Your account or password is incorrect.')]"));
	System.out.println( ele);
	}

}
