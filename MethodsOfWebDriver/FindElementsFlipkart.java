package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFlipkart {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.flipkart.com/");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[text()='✕']")).click();
          Thread.sleep(2000);
          
          driver.findElement(By.name("q")).sendKeys("Laptop");
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i5']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
          
          
          
          
          
        //  driver.findElement(By.xpath("//button[@class=''"))
          
          
          
          
          

	}

}
