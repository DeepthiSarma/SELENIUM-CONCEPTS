package com.ctc.dataTable;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		driver.findElement(By.xpath("//Button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.linkText("CHECKOUT")).click();
		driver.findElement(By.id("first-name")).sendKeys("pavan");
		driver.findElement(By.id("last-name")).sendKeys("talluru");
		driver.findElement(By.id("postal-code")).sendKeys("522202");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("FINISH")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("image2.png"));
		
		System.out.println(driver.findElement(By.xpath("//h2[@class='complete-header']")).getText());
	}
}
