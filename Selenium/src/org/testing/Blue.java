package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blue {

	// javaScriptExecutor...... is used to execute javaScript code in selenium webdriver
	 // javascript.....good and fast at interatacting with webElements.
	//executeScript()...mathode
	 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajar\\eclipse\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com");
		
		
	}
}
