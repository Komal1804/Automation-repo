package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.switchTo().activeElement().sendKeys("selenium");
	}
}