package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFindElementMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chorme.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https:/127.0.0.1/login.do;jsessionid=a8gk0grs718eg");
	 
	      WebElement usn= driver.findElement(By.xpath("//input[@class='textfield']"));
	      usn.sendKeys("manager");

	}

}
