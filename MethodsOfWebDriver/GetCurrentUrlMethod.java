package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("");
	       String currentUrl =driver.getCurrentUrl();
	       System.out.println(currentUrl);
		
		// TODO Auto-generated method stub

	}

}
