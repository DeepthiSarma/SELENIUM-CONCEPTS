package com.cts.magentoTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://magento.com/");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int linkcount = linklist.size();
		System.out.println(linkcount);

//	WebElement ele = linklist.get(38);
//	String href = ele.getAttribute("href0");

//		for (int i = 0; i < linkcount; i++) {
//			WebElement ele0 = linklist.get(i);
//			String href0 =ele.getAttribute("href0");
//			System.out.println(href0);
//
//			String text0 = ele.getText();
//			System.out.println(text0);
//			
//			if(text0.trim().equals("Products"))
//			{
//				ele.click();
//				break;
//			}	
//		
		for(WebElement ste :linklist) {

			String href =ste.getAttribute("href");
			System.out.println(href);

			String text0 = ste.getText();
			System.out.println(text0);
			
			if(text0.trim().equals("Products"))
			{
				ste.click();
				break;
			}		
		}
	}
}
