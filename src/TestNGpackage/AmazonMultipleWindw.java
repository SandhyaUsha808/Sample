package TestNGpackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonMultipleWindw {
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
		Thread.sleep(15000);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("Mobile Phones",Keys.ENTER);
		String title=driver.getTitle();
		if(title.equals("Amazon.in : mobile phones"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();

		Set<String>child=driver.getWindowHandles();
for(String v:child)
{
	if(!v.equalsIgnoreCase(parentWindow))
	{
		driver.switchTo().window(v);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));				//explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")));
		//driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
	
		driver.close();
	}
}
	
	}
}

