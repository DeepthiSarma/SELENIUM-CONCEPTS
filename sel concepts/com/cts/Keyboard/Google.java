package com.cts.Keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://google.co.in");

		WebElement ele = driver.findElement(By.name("q"));
		Actions actions = new Actions(driver);
		actions.click(ele).pause(1000)
		.keyDown(Keys.SHIFT).pause(1000).sendKeys("facebook").keyUp(Keys.SHIFT).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ENTER).build().perform();
		for(int i=1; i<=5;i++)
		{
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		actions.sendKeys(Keys.ENTER).build().perform();
}
}
