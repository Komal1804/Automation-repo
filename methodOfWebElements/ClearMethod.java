package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=137hs8d3atdtb");
		WebElement usnTB = driver.findElement(By.name("username"));
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		
		usnTB.sendKeys("admin");
		pwdTB.sendKeys("MANAGER");
		
		Thread.sleep(2000);
		
		usnTB.clear();
		pwdTB.clear();
		

	}

}
