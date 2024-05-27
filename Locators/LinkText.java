package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("file:///C:/Users/swara/OneDrive/Desktop/Automation/flipkart%20link.html");
		Thread.sleep(2000);
		
		driver1.findElement(By.linkText("FLIPKART_LINK")).click();
		
	}

}
