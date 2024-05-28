package MethodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.co.in/");
     driver.switchTo().activeElement().sendKeys("poha");
     // work for multiple web element or multiple suggestion 
     List<WebElement>pohaSuggestions= driver.findElements(By.xpath("//div[@class='w'"));
     
     for(int i=0;i<pohaSuggestions.size();i++)
     {
    	 
		WebElement element= pohaSuggestions.get(i);
    	       String  poha=element.getText(); 
    	       Thread.sleep(2000);
    	       System.out.println(poha);
    	       
     }
    	       
    	    // advance for loop 
    	       for (WebElement pohaE:pohaSuggestions)
    	       {
    	    	 
				System.out.println(pohaE.getText());
   	    	  
    	       }
     
    	       
    	       //for (int i=0;i,laptop.size();i++)
    	      // {
    	      // allLaptop.get(i);
    	       ///for(j=i)
    	       

    	       
    	       
    	       
    	       //for ()webElement poha: pohaSuggestion )
    	       //{
    	    	//   System.out.println("poha.getText()");
    	       //}

     }
     
	}
     
              
     
	
