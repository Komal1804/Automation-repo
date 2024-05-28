package AllCaseXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAllCaseP3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_381fS' and @name='mobile']")).sendKeys("9307385149");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name' and @name='name']")).sendKeys("Swaru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_381fS' and @id='email']")).sendKeys("swaru04@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
				

	}

}


