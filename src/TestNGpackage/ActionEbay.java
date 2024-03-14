package TestNGpackage;	
import org.testng.annotations.Test;

import java.time.Duration;																			//20-2-2024

//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ActionEbay {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ebay.com/");
		
	}
	@Test
	public void test() throws Exception
	{
		//Thread.sleep(6000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));`          //implicit wait
		driver.manage().window().maximize();
		WebElement mouse=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));				//explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	}
}