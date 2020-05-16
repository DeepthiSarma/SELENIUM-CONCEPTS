package com.ctc.dataTable;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	
	Date date = new Date();
	String datestr = date.toString().replace(":", "-");

	TakesScreenshot ts = (TakesScreenshot) driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	screenshot.renameTo(new File("image" + datestr + ".png"));
	
//		WebElement table = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]"));
//		String name1 = table.getText();
//		System.out.println(name1);

//	for(int i =1; i<=10;i++) 
//{
//	System.out.println(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]")));
//}
	List<WebElement>rowEle = driver.findElements(By.xpath("//table[@id='example']"));
	int rowCount = rowEle.size();
	System.out.println(rowCount);
		for(int i =1; i<=rowCount;i++) 
		{
			WebElement table = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[6]"));
		String name1 = table.getText();
		System.out.println(name1);
		}
		driver.quit();
		}
}
