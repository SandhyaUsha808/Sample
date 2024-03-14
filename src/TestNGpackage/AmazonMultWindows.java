package TestNGpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonMultWindows {
	
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		Thread.sleep(8000);
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window title" +driver.getTitle());
		//driver.findElement(By.xpath("/html/body/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile Phones",Keys.ENTER);
		
		/*driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		

		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click() */
		
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String w:allwindowhandles)
		{
			System.out.println(w);
		
		if(!w.equalsIgnoreCase(parentWindow))
		{
			driver.switchTo().window(w);
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
			driver.close();
			}
		driver.switchTo().window(parentWindow);
		}
		}
}