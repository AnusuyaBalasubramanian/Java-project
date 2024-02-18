package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Apple {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajar\\eclipse\\Selenium\\Driver\\chromedriver.exe");
		
WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
WebElement creACC = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		creACC.click();
Thread.sleep(3000);
WebElement date = d.findElement(By.xpath("//select[@title='Day']"));
		Select s = new Select(date);
		  s.selectByValue("4");//using select attribute
		
WebElement month = d.findElement(By.xpath("//select[@title='Month']"));
        Select s1 = new Select(month);
           s1.selectByVisibleText("Jun");//using text attribute
WebElement year = d.findElement(By.xpath("//select[@title='Year']"));
          Select s2 = new Select(year);
            s2.selectByIndex(4);
            

           
           
           
           





		
		
		
		
		
		
				
			
		
	}

}
