package com.cts.citindomr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenEmr {

	public static void main(String[] args) throws InterruptedException {

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

		WebElement act = driver.findElement(By.xpath("//div[text()='Patient/Client']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(act).build().perform();

		// actions.moveToElement(act).moveByOffset(450,
		// 0).click().clickAndHold().build().perform();

		driver.findElement(By.xpath("//div[text()='New/Search']")).click();

		driver.switchTo().frame("pat");

		driver.findElement(By.id("form_fname")).sendKeys("deepthi");

		driver.findElement(By.id("form_lname")).sendKeys("priya");

		Select gender = new Select(driver.findElement(By.name("form_sex")));
		gender.selectByVisibleText("Female");

		Select title = new Select(driver.findElement(By.name("form_title")));
		title.selectByVisibleText("Mrs.");

		driver.findElement(By.id("form_DOB")).sendKeys("2020-02-24");

		// WebDriverWait wait = new WebDriverWait(driver, 50);
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("create")));
		
		driver.findElement(By.id("create")).click();

		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		driver.switchTo().frame("modalframe");
		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
		
		driver.switchTo().defaultContent();
		//alert closing clicking OK button & printing alert text

		//Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alertBox = driver.switchTo().alert();
		String alertTest = alertBox.getText();
		System.out.println(alertTest);
		Thread.sleep(3000);
		alertBox.accept();
		
		driver.findElement(By.xpath("//div[@class='closeDlgIframe']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("pat");
		
		// For tag name only one patient name can be accessed 
	//String printing = driver.findElement(By.xpath("//h2[contains(text(),'Medical Record Dashboard - Deepthi Priya   ')]")).getText();
		
		//contains can get data by giving only the common data
		String printing =driver.findElement(By.xpath("//h2[contains(text(),'Medical Record Dashboard ')]")).getText();
		
		System.out.println(printing);
		
		driver.switchTo().defaultContent();
		
	}

}



