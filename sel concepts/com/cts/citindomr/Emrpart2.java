 // mouse Hover


package com.cts.citindomr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Emrpart2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.openemr.io/b/openemr");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");

		WebElement lang = driver.findElement(By.name("languageChoice"));
		Select selectCountry = new Select(lang);
		selectCountry.selectByVisibleText("English (Standard)");

		driver.findElement(By.className("btn")).click();

		// To hover the mouse

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[text()='Reports']"))).pause(2000)
		.moveToElement(driver.findElement(By.xpath("//div[text()='Clients']")))
		.build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//div[text()='List']"))).click()
		.moveToElement(driver.findElement(By.xpath("//span[text()='Billy']"))).build().perform();
		
		driver.switchTo().frame("logoutinnerframe");
		driver.findElement(By.linkText("Logout")).click();

	}
}