package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.instagram.com/");
	
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("qspiders");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("swara");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	
	
	}

}
