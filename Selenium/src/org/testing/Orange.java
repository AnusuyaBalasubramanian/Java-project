package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driVer", "C:\\Users\\rajar\\eclipse\\Selenium\\Driver\\chromedriver.exe");
		
WebDriver d = new ChromeDriver();
d.get("https://www.facebook.com/");
		
		JavascriptExecutor j =(JavascriptExecutor)d;
		
WebElement txtEmail = d.findElement(By.xpath("//input[@type='text']"));
j.executeScript("arguments[0].setAttribute('value' , 'anu456@gmail.com')", txtEmail );
		
WebElement txtpass = d.findElement(By.xpath("//input[@type='password']"));
j.executeScript("arguments[0].setAttribute('value' ,'678998')", txtpass);
		
WebElement login = d.findElement(By.xpath("//button[@value='1']"));
j.executeScript("arguments[0].click()", login);
		
		
		
		
		
		
		
	
		
		
		
	}

}
