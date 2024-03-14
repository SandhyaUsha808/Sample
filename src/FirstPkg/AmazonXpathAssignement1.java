/*package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpathAssignement1 {
	ChromeDriver driver;
	
	@Before
	public void setp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(1050);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles",Keys.ENTER);
		//driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
		//driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
		//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("qwerty@gmaill.com",Keys.ENTER);
		//driver.navigate().back();
		//driver.navigate().back();
		//driver.navigate().back();
		//driver.findElement(By.xpath("//*[@id='nav-xshop']/a[7]")).click();
		//driver.navigate().back();
		//driver.navigate().back();
		//driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();

	}
	

	{
	}
}
*//
