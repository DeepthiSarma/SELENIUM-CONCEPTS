package slenium;
//
////Below is the whole WebDriver code to check the background color of the <TR> element before and after the mouse-over.


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover{
public static void main(String[] args) {
	
String baseUrl = "http://www.facebook.com/"; 
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");					
WebDriver driver = new ChromeDriver();

driver.get(baseUrl);
WebElement txtUsername = driver.findElement(By.id("email"));

Actions builder = new Actions(driver);
Action seriesOfActions = builder
	.moveToElement(txtUsername)
	.click()
	.keyDown(txtUsername, Keys.SHIFT)
	.sendKeys(txtUsername, "hello")
	.keyUp(txtUsername, Keys.SHIFT)
	.doubleClick(txtUsername)
	.contextClick()
	.build();
	
seriesOfActions.perform() ;

}
}

//public class MouseHover {
//    
//    public static void main(String[] args) throws InterruptedException {
//        String baseUrl = "http://demo.guru99.com/test/newtours/";
//        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
//	     
//	  WebDriver  driver= new ChromeDriver();
//
//                driver.get(baseUrl);           
//                WebElement link_Home = driver.findElement(By.linkText("Home"));
//                WebElement td_Home = driver
//                        .findElement(By
//                        .xpath("//html/body/div"
//                        + "/table/tbody/tr/td"
//                        + "/table/tbody/tr/td"
//                        + "/table/tbody/tr/td"
//                        + "/table/tbody/tr"));    
//                 
//                Actions builder = new Actions(driver);
//                Action mouseOverHome = builder
//                        .moveToElement(link_Home)
//                        .build();
//                 
//                String bgColor = td_Home.getCssValue("background-color");
//                System.out.println("Before hover: " + bgColor);        
//                mouseOverHome.perform();        
//                bgColor = td_Home.getCssValue("background-color");
//                System.out.println("After hover: " + bgColor);
//                
//                Thread.sleep(3000);
//                driver.close();
//        }
//}