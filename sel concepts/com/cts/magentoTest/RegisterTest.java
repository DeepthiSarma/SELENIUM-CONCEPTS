package com.cts.magentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://magento.com/");
//		
//		driver.findElement(By.className("icon")).click();
//		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("welcome@123");
//		driver.findElement(By.xpath("//button[@class='button']")).click();
//		

		driver.findElement(By.linkText("My Account")).click();

		driver.findElement(By.xpath("//span[text()='Register']")).click();

		driver.findElement(By.id("firstname")).sendKeys("selenium");
		driver.findElement(By.id("lastname")).sendKeys("cognizant");

		driver.findElement(By.id("email_address")).sendKeys("balaji0017@gmail.com");

		WebElement countryele = driver.findElement(By.id("country"));
		Select selectCountry = new Select(countryele);
		selectCountry.selectByVisibleText("Australia");

		WebElement company = driver.findElement(By.name("company_type"));
		Select companiee = new Select(company);
		companiee.selectByVisibleText("Tech Partner");

		driver.findElement(By.name("password")).sendKeys("@Cognizant1234");
		driver.findElement(By.name("confirmation")).sendKeys("@Cognizant1234");

		WebElement Role = driver.findElement(By.id("customer_individual_role"));
		Select Roles = new Select(Role);
		Roles.selectByVisibleText("Technical/developer");

		WebElement checkBox=driver.findElement(By.id("agree_terms"));
		
		if(!checkBox.isSelected())
		{
			 checkBox.click();
		}
	}

}
