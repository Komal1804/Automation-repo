package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
   System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("");
              String Pagesource=driver.getPageSource();
              System.out.println(Pagesource);	
              }

}
