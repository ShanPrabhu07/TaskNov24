package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kspra\\eclipse-workspace\\TestJava\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		
		//ScreenShot
		
//		TakesScreenshot screen = (TakesScreenshot)driver;
//		
//		File source = screen.getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File("C:\\Users\\kspra\\eclipse-workspace\\TestJava\\Screen\\ama.jpg");
//		
//		FileUtils.copyFile(source,dest);
		
//		String title = driver.getTitle();
//		
//		System.out.println(title);
//		
//		String currentUrl = driver.getCurrentUrl();
//		
//		System.out.println(currentUrl);
//		
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("Prabhu");
//		
//		String attribute = email.getAttribute("value");
//		System.out.println(attribute);
//		
//		WebElement textg = driver.findElement(By.xpath("//div[contains(text(),'celebrity')]"));
//		
//		String text = textg.getText();
//		
//		System.out.println(text);
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
//		
//		Robot robot = new Robot();
		
//		robot.keyPress(KeyEvent.VK_DOWN);
		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		
//        robot.keyPress(KeyEvent.VK_ENTER);
//		
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		
//		String currentUrl = driver.getCurrentUrl();
//		/
//		System.out.println(currentUrl);
		
		//driver.findElement(By.id("nav-search-submit-text")).click();
		
//		Actions action = new Actions(driver);
//		
//		WebElement iphone = driver.findElement(By.xpath("//div[@aria-label='iphone 13']"));
//		
//		action.moveToElement(iphone).perform();
//		
		
		
		//Thread.sleep(2000);
		
		
//		driver.findElement(By.xpath("//div[@data-index=2]//span[contains(@class,'a-size-medium')]")).click();
//		
//		//driver.navigate().to("https://www.facebook.com/");
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
		
		
		
		
		
		driver.close();
		
		
	}
}
