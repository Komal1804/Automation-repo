package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		     WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("http://laptop-m3japjgg/login.do");
		
		     //identify username textbox of actitime and pass the input ad admin
		     //to identify use findElement method 
		  WebElement usernameTextBox = driver.findElement(By.name("username"));
		  Thread.sleep(2000);
		  usernameTextBox.sendKeys("admin");
		  System.out.println(usernameTextBox);
		  // to identify password text box
		  WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		  Thread.sleep(2000);
		  System.out.println(passwordTextBox);
		  passwordTextBox.sendKeys("Manager");
		
		  
		    

	}

}
