package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Black {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\rajar\\eclipse\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.greenstechnologys.com/");
		
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement sDown = d.findElement(By.xpath("(//div[@class='trainer-info'])[1]"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoview(true)" ,sDown);
		
	
	}
	

	

} 
