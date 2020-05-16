package com.cts.magentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Magento {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/");
		
		WebElement ele = driver.findElement(By.linkText("My Account"));
		ele.click();
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("welcome@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
//		driver.findElement(By.partialLinkText("Forgot")).click();
//		driver.findElement(By.linkText("Forgot Your Password?")).click();
		
		//Explicit wait
		
		WebDriverWait wait = new  WebDriverWait(driver, 500);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle="My Account";
		
		if(actualTitle.contentEquals(expectedTitle)) {
			
			System.out.println("True");
		}
			else {
				System.out.println("False");
			}
		 driver.findElement(By.linkText("Log Out")).click();
		}
		
	}

