package com.cts.magentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowser {

	public static void main(String[] args) {

		String browser="45";
		WebDriver driver=null;
		if (browser == "ch") {

			 driver = new ChromeDriver();
		}

		else if (browser == "Fd") 
		{
			 driver = new FirefoxDriver();
		} 
		else if(browser== "IE")
		{
			 driver = new InternetExplorerDriver();
		}
		System.out.println("");
		driver.manage().window().maximize();
		driver.get("https://magento.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("welcome@123");
		driver.findElement(By.id("send")).click();
	}
}
