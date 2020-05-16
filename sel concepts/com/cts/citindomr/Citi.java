package com.cts.citindomr;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citi {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm?eOfferCode=INHOOSTINBA");
		
		driver.findElement(By.xpath("//a[text()='APPLY FOR CREDIT CARDS']")).click();
		
		Thread.sleep(5000);
		//driver.close();
		//driver.quit();
		
		// Returns Session id
	String parent = driver.getWindowHandle();
		System.out.println(parent+"\n");
		
		// for multiple tabs
		Set<String> parents = driver.getWindowHandles();
		
		for(String i : parents)
		{
			System.out.println(i+"\n");
			driver.switchTo().window(i);
			String title = driver.getTitle();
			System.out.println(title); //  title prints
			
			if(title.equals("Credit Card Application Online, Apply Now - Citi India"))
			{
				break;
			}
		}
		
		driver.findElement(By.linkText("Travel")).click();
		
		driver.close();
		driver.switchTo().window(parent);
		
		String title = driver.getTitle();
		System.out.println(title); //  title prints
		driver.quit();
		}
}
