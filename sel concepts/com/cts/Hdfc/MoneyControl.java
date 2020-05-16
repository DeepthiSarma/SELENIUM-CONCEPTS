package com.cts.Hdfc;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControl {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.moneycontrol.com/");
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.linkText("SIGN UP WITH EMAIL                                    ")).click();
		//driver.findElement(By.id("clearPass")).sendKeys("pass");

		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle="Business News, Stock/Share Market Investment, Live BSE/NSE Sensex & Nifty, Mutual Funds, Commodity Market, Finance Portfolio Investment/Management, Startup news India, Financial News - Moneycontrol";
		
		if(actualTitle.equals(expectedTitle)) {
			
			System.out.println("True");
		}
			else {
				System.out.println("False");
			}
	}

}
