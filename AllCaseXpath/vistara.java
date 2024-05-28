package AllCaseXpath;

    import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	 public class vistara {

		public static void main(String[] args) throws InterruptedException 
		{
			//Handle Notificationpopup
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");


			//.......................................
			WebDriver	driver=new ChromeDriver(co);

			driver.manage().window().maximize();
			
			driver.get("https://www.airvistara.com/");

			Thread.sleep(2000);
			driver.findElement(By.id("cookieModalCloseBtn")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("Pune",Keys.ENTER);
			
			driver.findElement(By.xpath("//input[@aria-label='Search destination']")).sendKeys("kochi",Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.id("passengers")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='adds_adult']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='adds_child']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='adds_infant']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(@class,'col-xs') and text()='Done'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("departCalendar")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[text()=' Aug ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='24']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[text()='Return Date']")).click();
			driver.findElement(By.xpath("//div[text()=' Aug ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='28']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@id,'prom')]")).sendKeys("123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(@id,'book')]")).click();
		

		}

	 }
